import sys

dice = list(map(int,sys.stdin.readline().split()))

if len(set(dice))==1:
    price=10000+dice[0]*1000
elif len(set(dice))==2:
    for x in range(6) :
        if dice.count(x+1) ==2:
            price=1000+(x+1)*100
            break
else:
    price = max(dice)*100

print(price)

