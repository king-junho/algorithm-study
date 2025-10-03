import sys

n = int(sys.stdin.readline())
cards = list(map(int,sys.stdin.readline().strip().split()))
m = int(sys.stdin.readline())
check = list(map(int,sys.stdin.readline().strip().split()))

cards_dict={}

for card in cards:
    if cards_dict.get(card):
        cards_dict[card]+=1
    else:
        cards_dict[card]=1

answer=[]
for x in check:
    if cards_dict.get(x):
        answer.append(cards_dict[x])
    else :
        answer.append(0)
print(" ".join(map(str,answer)))