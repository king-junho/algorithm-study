import sys


def recursion(s, l, r, cnt):
    if l >= r:
        return (1, cnt + 1)
    elif s[l] != s[r]:
        return (0, cnt + 1)
    else:
        return recursion(s, l + 1, r - 1, cnt + 1)


tc = int(sys.stdin.readline())
result = []

for _ in range(tc):
    word = sys.stdin.readline().strip()
    result.append(recursion(word, 0, len(word) - 1, 0))

print("\n".join(f"{x[0]} {x[1]}" for x in result))
