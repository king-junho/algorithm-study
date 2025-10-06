import math
import sys


def is_prime(n):
    for i in range(3,int(math.sqrt(n))+1,2):
        if n%i==0:
            return False
    return True
def next_prime(n):
    if n<=2:
        return 2
    if n%2==0:
        n+=1
    while True:
        if is_prime(n):
            return n
        n+=2

n = int(sys.stdin.readline())
result=[]
for _ in range(n):
    x= int(sys.stdin.readline())
    result.append(next_prime(x))
print("\n".join(map(str,result)))