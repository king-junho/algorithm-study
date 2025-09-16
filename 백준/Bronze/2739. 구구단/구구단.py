import sys

N = int(sys.stdin.readline())

for x in range(9) :
    print(f'{N} * {x+1} = {N*(x+1)}')