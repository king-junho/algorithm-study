import sys

n, m = map(int, sys.stdin.readline().split())

pocketmon = [sys.stdin.readline().strip() for _ in range(n)]
pocketmon_dict = {name: idx for idx, name in enumerate(pocketmon)}

answer=[]
for _ in range(m):
    question = sys.stdin.readline().strip()
    if question.isdigit():
        answer.append(pocketmon[int(question)-1])
    else:
        answer.append(pocketmon_dict.get(question)+1)

print("\n".join(map(str,answer)))
