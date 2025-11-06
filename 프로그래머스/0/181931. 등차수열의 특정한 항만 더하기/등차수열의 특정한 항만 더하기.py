def solution(a, d, included):
    answer = 0
    n=a
    for i in included:
        if i:
            answer+=n
        n+=d
    return answer