from itertools import combinations


def solution(number):
    answer = 0
    numberList = list(combinations(number, 3))
    print(numberList)
    print("========")
    for n in numberList:
        if sum(n) == 0:
            answer += 1

    return answer