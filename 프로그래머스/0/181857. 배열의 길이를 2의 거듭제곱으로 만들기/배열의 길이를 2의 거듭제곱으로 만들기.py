def solution(arr):
    answer = arr

    def find_n(len):
        n = 0
        while len > 2**n:
            n += 1
        return 2**n

    n = find_n(len(arr))
    answer += [0] * (n - len(arr))
    return answer