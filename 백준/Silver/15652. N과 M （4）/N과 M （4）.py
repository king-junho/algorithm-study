import sys

n, m = map(int, sys.stdin.readline().split())
result = []


def my_backtrack(start):
    if len(result) == m:
        print(*result)
        return

    for i in range(start, n + 1):
        result.append(i)
        my_backtrack(i)
        result.pop()


my_backtrack(1)