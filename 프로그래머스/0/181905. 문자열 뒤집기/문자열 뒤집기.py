def solution(my_string, s, e):
    answer = ""
    answer += my_string[0:s]
    if s - 1 < 0:
        answer += my_string[e::-1]
    else:
        answer += my_string[e : s - 1 : -1]
    answer += my_string[e + 1 :]
    return answer