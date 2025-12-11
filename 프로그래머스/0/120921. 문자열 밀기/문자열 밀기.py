def solution(A, B):
    answer = 0
    temp = ""
    if A==B:
        return 0
    else :
        answer=-1
        for i in range(1, len(A)):
            temp = A[-i:] + A[:-i]
            if temp == B:
                answer = i
                break

    return answer