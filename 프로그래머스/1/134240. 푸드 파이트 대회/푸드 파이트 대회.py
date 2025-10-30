def solution(food):
    answer = ""
    temp = ""
    for i in range(1, len(food)):
        temp += (f"{i}") * (food[i] // 2)

    answer = temp + "0" + temp[::-1]
    return answer
