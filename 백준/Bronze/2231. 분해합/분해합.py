import sys

def findConstructor(start,end):
    for i in range(start,end):
        result=i
        digit=[]
        while i:
            digit.append(i % 10)
            i //= 10
        result+=sum(digit)
        if result==n:
            return result-sum(digit)

    return 0

def digitSet(n):
    digit=[]
    while n:
        digit.append(n % 10)
        n //= 10
    return digit

n = int(sys.stdin.readline())
digit = digitSet(n)

min_num = digit[len(digit)-1]-1 + (9*(len(digit)-1))

print(findConstructor(n-min_num,n))