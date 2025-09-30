import sys

isTrue = True
a1,a0 = map(int,sys.stdin.readline().split())
c=int(sys.stdin.readline())
n0=int(sys.stdin.readline())

for i in range(n0,101):
    if (a1*i+a0)>c*i:
        isTrue=False
        break

print(1) if isTrue else print(0)
