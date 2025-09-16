import sys

tc = int(sys.stdin.readline())

result = []
for _ in range(tc) :
    a,b = map(int,sys.stdin.readline().split())
    result.append(str(a+b))

for idx in range(len(result)) :
    print(f'Case #{idx+1}: {result[idx]}')