def solution(s):
    answer = 0
    x=s[0]
    x_count=0
    x_not_count=0
    for c in s:
        if x_count==x_not_count:
            x_count=x_not_count=0
            x=c
            answer+=1
        
        if c==x:
            x_count+=1
        else:
            x_not_count+=1
            
    return answer