import sys

n = int(sys.stdin.readline())
last_room=1
i=1

while True:
    if last_room >= n:
        break
    last_room+=(6*i)
    i+=1

print(i)
