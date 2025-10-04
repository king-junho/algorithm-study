import sys
import math

n=int(sys.stdin.readline())
trees = [int(sys.stdin.readline()) for _ in range(n)]
distances=[]
result=0

for i in range(len(trees)-1):
    distances.append(trees[i+1]-trees[i])

divisor = math.gcd(*distances)
for value in distances:
    result+=value//divisor-1

print(result)