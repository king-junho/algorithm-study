def solution(friends, gifts):
    answer = 0
    n = len(friends)
    present_point_table = [[0] * n for _ in range(n)]
    present_point = [0] * n
    present_result = [0] * n

    for gift in gifts:
        giver, taker = gift.split()
        giver_idx = friends.index(giver)
        taker_idx = friends.index(taker)
        present_point_table[giver_idx][taker_idx] += 1
        present_point[giver_idx] += 1
        present_point[taker_idx] -= 1

    for i in range(n):
        for j in range(n):
            if i == j:
                continue

            if present_point_table[i][j] == present_point_table[j][i]:
                # 선물지수가 더 높은사람이 받음
                if present_point[i] == present_point[j]:
                    continue
                elif present_point[i] > present_point[j]:
                    present_result[i] += 1

            else:
                if present_point_table[i][j] > present_point_table[j][i]:
                    present_result[i] += 1

    answer = max(present_result)

    return answer

