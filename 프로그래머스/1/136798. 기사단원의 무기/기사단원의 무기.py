import math


def divisorCount(n, limit, power):
    if n == 1:
        return 1
    result = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            if i**2 == n:
                result += 1
            else:
                result += 2
        if result > limit:
            result = power
            break
    return result


def solution(number, limit, power):
    answer = 0
    divisor_count = []
    for i in range(1, number + 1):
        value = divisorCount(i, limit, power)
        divisor_count.append(value)
    return sum(divisor_count)
