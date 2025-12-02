def solution(order):
    answer=0
    for s in order:
        if "americano" in s:
            answer+=4500
        elif "cafelatte" in s:
            answer+=5000
        else: 
            answer+=4500
            
    
    return answer