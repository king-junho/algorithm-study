def solution(arr):
    answer = []
    i=0
    while i<len(arr):
        if len(answer)==0:
            answer.append(arr[i])
            i+=1
        else:
            if arr[i]==answer[-1]:
                answer.pop()
                i+=1
            else:
                answer.append(arr[i])
                i+=1
            
    return answer if len(answer)!=0 else [-1]