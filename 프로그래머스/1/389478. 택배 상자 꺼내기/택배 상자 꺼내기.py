def solution(n, w, num):
    answer = 0
    num_idx = (num-1)%w if ((num-1)//w)%2==0 else w-1-(num-1)%w
    n_idx = (n-1)%w if ((n-1)//w)%2==0 else w-1-(n-1)%w
    
    if n%w==0:
        answer = ((n-1)//w) - ((num-1)//w) +1
    else:
        #맨 위 왼쪽부터 채울 때
        if ((n-1)//w)%2==0:
            if num_idx<=n_idx:
                answer = ((n-1)//w) - ((num-1)//w) +1
            else : 
                answer = ((n-1)//w) - ((num-1)//w)
        #맨 위 오른쪽부터 채울 때
        else:
            if num_idx>=n_idx:
                answer = ((n-1)//w) - ((num-1)//w) +1
            else:
                answer = ((n-1)//w) - ((num-1)//w)
            
    return answer