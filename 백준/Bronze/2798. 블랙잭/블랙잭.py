import sys

def find_card(cards, n, m):
    result=0
    for i in range(n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                card_sum = cards[i] + cards[j] + cards[k]
                if card_sum == m:
                    result = m
                    return result
                elif card_sum < m and card_sum > result:
                    result = card_sum
    return result

N,M = map(int,sys.stdin.readline().split())
cards = list(map(int,sys.stdin.readline().split()))
print(find_card(cards,N,M))

