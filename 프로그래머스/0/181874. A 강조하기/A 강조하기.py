def solution(myString):
    answer = ''
    for c in myString:
        if c=='a':
            answer+=c.upper()
        elif c=='A':
            answer+=c
        else:
            answer+=c.lower()
    return answer