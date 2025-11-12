def solution(intStrs, k, s, l):
    answer = []
    for intStr in intStrs:
        value=int(intStr[s:s+l])
        if k<value:
            answer.append(value)
    return answer