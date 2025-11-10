def solution(k, score):
    answer = []
    honor = []
    for n in score:
        if len(honor) == k:
            if honor[-1] < n:
                honor[-1] = n
        else:
            honor.append(n)
        honor.sort(reverse=True)
        answer.append(honor[-1])
    return answer

