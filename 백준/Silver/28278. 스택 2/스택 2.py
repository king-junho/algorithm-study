import sys

tc= int(sys.stdin.readline())
stack = []
respond=[]

for _ in range(tc):
    input_str=sys.stdin.readline().strip()
    if input_str.isdigit():
        n=int(input_str)
    else:
        n, x=map(int,input_str.split())

    if n==1:
        stack.append(x)
    elif n==2:
        if len(stack)!=0:
            respond.append(stack.pop())
        else:
            respond.append(-1)
    elif n==3:
        respond.append(len(stack))
    elif n==4:
        if len(stack)!=0:
            respond.append(0)
        else:
            respond.append(1)
    else:
        if len(stack)!=0:
            respond.append(stack[-1])
        else:
            respond.append(-1)

print("\n".join(map(str,respond)))