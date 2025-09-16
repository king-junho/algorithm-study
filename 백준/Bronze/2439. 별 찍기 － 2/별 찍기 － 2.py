import sys

N= int(sys.stdin.readline())

for idx in range(N):
    for x in range(N):
        if x< (N-(idx+1)):
            print(" ",end="")
        else :
            print("*", end="")
    print()