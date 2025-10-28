import sys

n, m = map(int, sys.stdin.readline().split())
result = []


def my_backtrack():
    if len(result) == m:
        print(*result)
        return

    for i in range(1, n + 1):
        result.append(i)

        my_backtrack()

        result.pop()


my_backtrack()
