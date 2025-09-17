import sys

S = sys.stdin.readline().strip()
result = []

for i in range(26):
    result.append(S.find(chr(ord('a')+i)))

print(*result)