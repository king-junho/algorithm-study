def solution(my_string):
    answer = [0] * 52
    for c in my_string:
        if c.islower():
            answer[26 + (ord(c) - ord("a"))] += 1
        else:
            answer[ord(c) - ord("A")] += 1
    return answer