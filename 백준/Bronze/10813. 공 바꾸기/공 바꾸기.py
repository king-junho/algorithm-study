import sys

N,M = map(int,sys.stdin.readline().split())
buckets = []
temp=0

for i in range(N):
    buckets.append(i+1)

for _ in range(M):
    i,j = map(int,sys.stdin.readline().split())
    temp = buckets[j-1]
    buckets[j-1]=buckets[i-1]
    buckets[i-1]=temp

print(*buckets)