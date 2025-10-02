import sys

n=sys.stdin.readline().strip()
input_arr=[]
for ch in n:
    value= int(ch)
    input_arr.append(value)
input_arr.sort(reverse=True)
for ch in input_arr:
    print(ch,end="")
