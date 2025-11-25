def solution(myStr):
    answer = []
    result = ""
    for c in myStr:
        if c == "a":
            if len(result) != 0:
                answer.append(result)
                result = ""
        elif c == "b":
            if len(result) != 0:
                answer.append(result)
                result = ""
        elif c == "c":
            if len(result) != 0:
                answer.append(result)
                result = ""
        else:
            result += c
    if len(result) != 0:
        answer.append(result)

    return answer if len(answer) != 0 else ["EMPTY"]
