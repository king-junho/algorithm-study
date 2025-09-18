import sys

correct_count = [1,1,2,2,2,8]
input_count = list(map(int,sys.stdin.readline().split()))
result = []

for i in range(len(correct_count)):
    result.append(correct_count[i]-input_count[i])

print(*result)