def solution(myString, pat):
    tc2 = ""
    for c in myString:
        if c == "A":
            tc2 += "B"
        else:
            tc2 += "A"
    if pat in tc2:
        return 1
    return 0