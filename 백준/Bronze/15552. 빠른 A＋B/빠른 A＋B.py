import sys

tc = int(sys.stdin.readline())
result = []
for idx in range(tc) :
    a,b = map(int,sys.stdin.readline().split())
    result.append(str(a+b))

print("\n".join(result))