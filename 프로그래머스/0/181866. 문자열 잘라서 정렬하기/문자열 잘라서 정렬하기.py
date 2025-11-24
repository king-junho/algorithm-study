def solution(myString):
    answer = []
    resultStr = ""
    for c in myString:
        if c == "x":
            if len(resultStr) != 0:
                answer.append(resultStr)
                resultStr = ""
        else:
            resultStr += c
    if len(resultStr) != 0:
        answer.append(resultStr)

    answer.sort()
    return answer