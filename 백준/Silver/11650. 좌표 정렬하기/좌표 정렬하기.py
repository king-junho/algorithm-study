import sys

n = int(sys.stdin.readline())
coordinates = [tuple(map(int,sys.stdin.readline().split())) for _ in range(n)]
coordinates.sort()
for x,y in coordinates:
    print(x,y)