def solution(l, r):
    def test(i):
        while i > 0:
            if i % 10 != 5 and i % 10 != 0:
                return False
            i //= 10
        return True

    answer = []
    for i in range(l, r + 1):
        if test(i):
            answer.append(i)
    return answer if len(answer) != 0 else [-1]
