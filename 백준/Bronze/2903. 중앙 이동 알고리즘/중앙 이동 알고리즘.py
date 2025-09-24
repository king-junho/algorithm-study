import sys
import math

n = int(sys.stdin.readline())
spot=2

for _ in range(n):
    spot+=spot-1

print(spot*spot)