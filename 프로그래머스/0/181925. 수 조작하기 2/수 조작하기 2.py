def solution(numLog):
    answer = ''
    for i in range(len(numLog)-1):
        result=numLog[i+1]-numLog[i]
        
        if result==1:
            answer+="w"
        elif result==-1:
            answer+="s"
        elif result==10:
            answer+="d"
        elif result==-10:
            answer+="a"
        
    return answer