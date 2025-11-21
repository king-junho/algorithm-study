def solution(myString, pat):
    index = 0
    for i in range(0, len(myString) - (len(pat) - 1)):
        if myString[i : i + len(pat)] == pat:
            index = i

    return myString[:index] + pat
