def solution(picture, k):
    answer = []
    for line in picture:
        result = ""
        for c in line:
            result += c * k
        for _ in range(k):
            answer.append(result)
    return answer