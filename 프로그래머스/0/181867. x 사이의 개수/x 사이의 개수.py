def solution(myString):
    answer = []
    length=0
    for c in myString:
        if c=="x":
            answer.append(length)
            length=0
        else:
            length+=1
    answer.append(length)
    return answer