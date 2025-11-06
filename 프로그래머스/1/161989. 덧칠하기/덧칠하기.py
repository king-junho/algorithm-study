def solution(n, m, section):
    answer = 0
    current_section = 0
    for s in section:
        if current_section <= s:
            answer += 1
            current_section = s + m

    return answer
