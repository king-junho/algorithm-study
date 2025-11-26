def solution(numbers, target):
    answer = 0

    def refun(idx, value):
        nonlocal answer
        if idx == len(numbers):
            if target == value:
                answer += 1
            return
        refun(idx + 1, value + numbers[idx])
        refun(idx + 1, value - numbers[idx])

    refun(0, 0)

    return answer