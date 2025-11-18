def solution(names):
    answer = []
    for idx, name in enumerate(names, 0):
        if idx % 5 == 0:
            answer.append(name)
    return answer