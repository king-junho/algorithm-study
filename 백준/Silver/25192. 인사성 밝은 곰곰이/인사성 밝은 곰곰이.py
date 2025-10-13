import sys

n = int(sys.stdin.readline())
count = 0
user = set()
for _ in range(n):
    command = sys.stdin.readline().strip()
    if command == "ENTER":
        count += len(user)
        user = set()
    else:
        user.add(command)
count += len(user)
print(count)
