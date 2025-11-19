def solution(arr):
    answer = 0
    isTrue = True
    while isTrue:
        isTrue = False
        for i, n in enumerate(arr):
            if n >= 50 and n % 2 == 0:
                arr[i] = n / 2
                isTrue = True
            elif n < 50 and n % 2 != 0:
                arr[i] = n * 2 + 1
                isTrue = True
        answer += 1
    return answer - 1
