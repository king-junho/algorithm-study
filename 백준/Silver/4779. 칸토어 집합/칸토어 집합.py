import sys


def cantor(n):
    word = ""
    if n == 1:
        return "-"
    word += cantor(n // 3)
    word += " " * (n // 3)
    word += cantor(n // 3)

    return word


for cmd in sys.stdin:
    n = int(cmd.strip())
    print(cantor(3**n))
