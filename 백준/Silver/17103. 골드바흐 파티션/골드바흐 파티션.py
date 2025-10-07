import sys
import math

if __name__ == '__main__':
    primeNums=[True]*(1000001)
    for i in range(2,int(math.sqrt(1000001))+1):
        if primeNums[i]:
            for j in range(i*2, 1000001, i):
                primeNums[j] = False

    n=int(sys.stdin.readline())
    result=[]
    for _ in range(n):
        count = 0
        input_num = int(sys.stdin.readline())
        for i in range(2,input_num//2+1):
            if primeNums[i] and primeNums[input_num-i]:
                count+=1
        result.append(count)
    print("\n".join(map(str,result)))