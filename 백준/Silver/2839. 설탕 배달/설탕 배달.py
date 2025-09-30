import sys

n = int(sys.stdin.readline())
quotient = n//5
count=-1

for i in range(quotient,-1,-1):
    temp = n-i*5
    if temp%3==0:
        count=i+temp//3
        break

print(count)