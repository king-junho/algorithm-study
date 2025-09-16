import sys

result=[]

a, b = map(int, sys.stdin.readline().split())
while a!=0 and b!=0:
    result.append(a + b)
    a, b = map(int, sys.stdin.readline().split())

print("\n".join(map(str,result)))