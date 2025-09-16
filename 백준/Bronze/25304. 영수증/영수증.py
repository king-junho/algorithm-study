import sys

X = int(sys.stdin.readline())
N = int(sys.stdin.readline())
price=0

for _ in range(N):
    a,b = map(int,sys.stdin.readline().split())
    price = price+(a*b)

if price==X:
    print("Yes")
else:
    print("No")