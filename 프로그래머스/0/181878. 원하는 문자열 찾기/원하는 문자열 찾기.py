def solution(myString, pat):
    answer = 0
    myString = myString.lower()
    pat = pat.lower()
    return 1 if pat in myString else 0