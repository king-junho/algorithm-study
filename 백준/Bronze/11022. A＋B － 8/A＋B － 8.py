import sys

tc = int(sys.stdin.readline())

result = []
for _ in range(tc) :
    a,b = map(int,sys.stdin.readline().split())
    case=[a,b,str(a+b)]
    result.append(case)

for idx,case in enumerate(result,1):
    print(f'Case #{idx}: {case[0]} + {case[1]} = {case[2]}')