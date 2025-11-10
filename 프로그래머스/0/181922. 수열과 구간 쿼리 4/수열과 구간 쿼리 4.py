def solution(arr, queries):
    for s,e,k in queries:
        for i in range(s,e+1):
            if i==0:
                arr[0]+=1
            elif i%k==0:
                arr[i]+=1
    return arr