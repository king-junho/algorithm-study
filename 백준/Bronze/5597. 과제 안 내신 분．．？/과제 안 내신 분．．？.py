import sys

students = list(range(1,31))

for _ in range(28):
    n=int(sys.stdin.readline())
    students[n-1]=0

result_list = [s for s in students if s!=0]
result_list.sort()

print(result_list[0])
print(result_list[1])