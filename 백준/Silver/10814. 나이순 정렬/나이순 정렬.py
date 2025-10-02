import sys

n = int(sys.stdin.readline())
peoples = [sys.stdin.readline().strip().split() for _ in range(n)]
peoples.sort(key=lambda people:(int(people[0])))
for age,name in peoples:
    print(age,name)
