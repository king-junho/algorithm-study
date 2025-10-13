import sys
import math

tc = int(sys.stdin.readline().strip())
result = []
for _ in range(tc):
    n, m = map(int, sys.stdin.readline().strip().split())
    result.append(math.comb(m, n))
print("\n".join(map(str, result)))