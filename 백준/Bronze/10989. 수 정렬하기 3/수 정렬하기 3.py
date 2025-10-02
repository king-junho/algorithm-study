import sys

n= int(sys.stdin.readline())
input_count=[0]*10000

for _ in range(n):
    input_count[int(sys.stdin.readline())-1]+=1

for i in range(10000):
    for _ in range(input_count[i]):
        print(i+1)