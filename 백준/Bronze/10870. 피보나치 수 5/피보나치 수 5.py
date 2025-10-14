import sys


def my_fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return my_fibonacci(n - 1) + my_fibonacci(n - 2)


n = int(sys.stdin.readline().strip())
result = my_fibonacci(n)
print(result)
