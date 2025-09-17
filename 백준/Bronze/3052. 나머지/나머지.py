import sys

result_list=[]

for i in range(10):
    n=int(sys.stdin.readline())
    result_list.append(n%42)

print(len(set(result_list)))
