import sys

result=[]

for line in sys.stdin:
    a,b = map(int, line.split())
    result.append(a+b)

print("\n".join(map(str,result)))