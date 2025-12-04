def solution(n):
    answer = [[0] * n for _ in range(n)]
    dir = 0
    i = 0
    j = 0
    value = 1
    while value <= n**2:
        answer[i][j] = value
        value += 1
        if dir == 0:
            j += 1
            if j == n or answer[i][j] != 0:
                dir += 1
                j -= 1
                i += 1
                continue
        elif dir == 1:
            i += 1
            if i == n or answer[i][j] != 0:
                dir += 1
                i -= 1
                j -= 1
                continue
        elif dir == 2:
            j -= 1
            if j == -1 or answer[i][j] != 0:
                dir += 1
                j += 1
                i -= 1
                continue
        elif dir == 3:
            i -= 1
            if i == -1 or answer[i][j] != 0:
                dir = 0
                i += 1
                j += 1
                continue

    return answer