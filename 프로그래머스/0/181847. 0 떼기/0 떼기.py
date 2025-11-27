def solution(n_str):
    answer = ""
    idx = 0
    for c in n_str:
        if c != "0":
            break
        idx += 1
    answer = n_str[idx:]
    return answer