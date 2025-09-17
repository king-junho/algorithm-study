import sys

N = int(sys.stdin.readline())
input_value = sys.stdin.readline().strip()
sum =0

for i in range(len(input_value)) :
    sum+=int(input_value[i])

print(sum)