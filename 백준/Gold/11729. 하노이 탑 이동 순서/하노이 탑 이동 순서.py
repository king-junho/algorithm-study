import sys


def myhanoi(n, a, b, c):
    if n == 1:
        result.append(f"{a} {c}")
        return

    myhanoi(n - 1, a, c, b)
    result.append(f"{a} {c}")
    myhanoi(n - 1, b, a, c)


result = []
n = int(sys.stdin.readline())
myhanoi(n, 1, 2, 3)

print(len(result))
print("\n".join(result))
