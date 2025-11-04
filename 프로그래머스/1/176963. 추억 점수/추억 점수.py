def solution(name, yearning, photo):
    answer = []
    for line in photo:
        result = 0
        for p in line:
            if p in name:
                idx = name.index(p)
                result += yearning[idx]
        answer.append(result)
    return answer

