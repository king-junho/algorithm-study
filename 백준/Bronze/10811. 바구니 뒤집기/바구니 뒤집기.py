import sys

N,M = map(int, sys.stdin.readline().split())
buckets=[x for x in range(1,N+1)]

for _ in range(M):
    i,j = map(int, sys.stdin.readline().split())
    temp = buckets[i-1:j]
    temp.reverse()
    buckets[i-1:j]=temp

print(" ".join(map(str,buckets)))
