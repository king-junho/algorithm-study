import sys

tc = int(sys.stdin.readline())
stack=[]

for _ in range(tc):
    n=int(sys.stdin.readline())

    if n==0:
        stack.pop()
    else:
        stack.append(n)

print(sum(stack))