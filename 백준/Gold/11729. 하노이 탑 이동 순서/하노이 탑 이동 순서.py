import sys

n = int(sys.stdin.readline())
result = []


def my_hanoi(n, a, b, c):
    if n == 1:
        result.append(f"{a} {c}")
        return
    my_hanoi(n - 1, a, c, b)
    result.append(f"{a} {c}")
    my_hanoi(n - 1, b, a, c)


my_hanoi(n, 1, 2, 3)
print(len(result))
print("\n".join(result))
