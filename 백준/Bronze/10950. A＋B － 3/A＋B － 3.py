import sys

tc = int(sys.stdin.readline())
result =[]
for x in range(tc):
    a,b = map(int,sys.stdin.readline().split())
    result.append(a+b)


for x in range(tc) :
    print(result[x])