import sys

n,m = map(int, sys.stdin.readline().split())
count=0

n_str = sorted(sys.stdin.readline().strip() for _ in range(n))
for _ in range(m):
    input_str = sys.stdin.readline().strip()
    if input_str in n_str:
        count+=1

print(count)