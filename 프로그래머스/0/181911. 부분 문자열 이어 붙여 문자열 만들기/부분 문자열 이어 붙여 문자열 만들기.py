def solution(my_strings, parts):
    answer = ""
    idx = 0
    for s, e in parts:
        answer += my_strings[idx][s : e + 1]
        idx += 1
    return answer
