def solution(my_string, m, c):
    answer = ""
    idx = 0
    for i in range(len(my_string)):
        if idx == c - 1:
            answer += my_string[i]
        idx = (idx + 1) % m

    return answer