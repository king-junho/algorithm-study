import sys

N,M = map(int,sys.stdin.readline().split())
matrix_a=[]
matrix_b=[]
result=[0]*N

for i in range(N):
    matrix_a.append(list(map(int,sys.stdin.readline().strip().split())))

for i in range(N):
    matrix_b.append(list(map(int,sys.stdin.readline().strip().split())))

for i in range(N):
    print(*list(x+y for x,y in zip(matrix_a[i],matrix_b[i])))

