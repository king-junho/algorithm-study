import sys

tc = int(sys.stdin.readline())
result=[]

for _ in range(tc):
    input_str = sys.stdin.readline().strip()
    result.append(input_str[0]+input_str[len(input_str)-1])

print("\n".join(result))