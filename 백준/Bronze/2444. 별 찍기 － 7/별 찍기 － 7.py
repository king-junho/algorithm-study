import sys

N = int(sys.stdin.readline())

for i in range(2*N-1):
    if i<=N-1:
        print(" "*(N-(i+1))+"*"*(2*i+1))
    else:
        print(" "*((i+1)%N)+"*"*((2*N-1)-2*((i+1)%N)))
 