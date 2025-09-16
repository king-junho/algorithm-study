import sys

N,x=map(int,sys.stdin.readline().split())

input_list = list(map(int,sys.stdin.readline().split()))
result_list = []
for i in range(N) :
    if input_list[i] < x:
        result_list.append(input_list[i])

print(" ".join(map(str,result_list)))