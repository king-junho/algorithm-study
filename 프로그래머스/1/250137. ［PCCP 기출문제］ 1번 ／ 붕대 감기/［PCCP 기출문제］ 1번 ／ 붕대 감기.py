def solution(bandage, health, attacks):
    answer = 0
    answer = health
    attack_idx = 0
    sequence_count = 1

    for i in range(1, attacks[-1][0] + 1):
        # 공격당했을 때
        if attacks[attack_idx][0] == i:
            answer -= attacks[attack_idx][1]
            if answer <= 0:
                answer = -1
                break
            attack_idx += 1
            sequence_count = 0
        else:
            sequence_count += 1
            if sequence_count == bandage[0]:
                sequence_count=0
                answer = min(answer + bandage[2]+bandage[1], health)
            else:
                answer = min(answer + bandage[1], health)

    return answer