import sys
N,M = map(int,sys.stdin.readline().split())

result_list = [0]*N

for _ in range(M):
    i,j,k=map(int,sys.stdin.readline().split())
    for idx in range(i-1,j):
        result_list[idx]=k

print(" ".join(map(str,result_list)))
