import sys
from collections import deque

n = int(sys.stdin.readline().strip())
my_deque = deque()
for _ in range(n):
    command = sys.stdin.readline().strip().split()
    order = int(command[0])

    if order == 1:
        my_deque.appendleft(int(command[1]))
    elif order == 2:
        my_deque.append(int(command[1]))
    elif order == 3:
        if my_deque:
            print(my_deque.popleft())
        else:
            print(-1)
    elif order == 4:
        if my_deque:
            print(my_deque.pop())
        else:
            print(-1)
    elif order == 5:
        print(len(my_deque))
    elif order == 6:
        print(0 if my_deque else 1)
    elif order == 7:
        print(my_deque[0] if my_deque else -1)
    elif order == 8:
        print(my_deque[-1] if my_deque else -1)
