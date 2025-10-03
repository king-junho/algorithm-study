import sys

n=int(sys.stdin.readline())
cards = set(list(map(int,sys.stdin.readline().split())))
m=int(sys.stdin.readline())
check_cards = list(map(int,sys.stdin.readline().split()))

for check in check_cards:
    if  check in cards:
        print(1, end=" ")
    else:
        print(0, end=" ")