import sys
import math

n = int(sys.stdin.readline())
result=[]

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    result.append(a*b//math.gcd(a,b))
print("\n".join(map(str,result)))
