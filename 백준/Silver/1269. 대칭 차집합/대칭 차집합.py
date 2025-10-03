import sys

a,b = map(int,sys.stdin.readline().split())
a_set = set(map(int,sys.stdin.readline().split()))
b_set = set(map(int,sys.stdin.readline().split()))
count = 0

for x in a_set:
    if x in b_set:
        count += 1

print(len(a_set)+len(b_set)-2*count)