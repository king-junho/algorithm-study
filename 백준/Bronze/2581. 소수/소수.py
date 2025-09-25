import sys
import math

def isDivisor(n):
    if n==1 :
        return False
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0 :
            return False
    return True

M=int(sys.stdin.readline())
N=int(sys.stdin.readline())

divisors = [i for i in range(M,N+1) if isDivisor(i)]
if len(divisors)==0:
    print(-1)
else :
    print(sum(divisors))
    print(min(divisors))