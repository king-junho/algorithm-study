import sys
from itertools import permutations

n, m = map(int, sys.stdin.readline().split())
data = [i + 1 for i in range(n)]

for i in permutations(data, m):
    print(*i)
