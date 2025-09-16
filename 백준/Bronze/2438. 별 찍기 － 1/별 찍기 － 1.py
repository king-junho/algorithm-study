import sys

N= int(sys.stdin.readline())

for idx in range(N):
    for _ in range(idx+1):
        print("*",end="")
    print()