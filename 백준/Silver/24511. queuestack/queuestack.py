import sys
from collections import deque

n = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().strip().split()))
b = list(map(int, sys.stdin.readline().strip().split()))
m = int(sys.stdin.readline().strip())
c = deque(list(map(int, sys.stdin.readline().strip().split())))
result = []
queue = deque()

for i in range(n):
    if a[i] == 0:
        queue.append(b[i])
while len(result) < m:
    if queue:
        result.append(queue.pop())
    else:
        result.append(c.popleft())
print(*result)
