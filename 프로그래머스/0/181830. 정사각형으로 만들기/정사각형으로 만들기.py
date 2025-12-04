def solution(arr):
    max_len = max(len(arr), len(arr[0]))
    answer = []
    for x in arr:
        answer.append(x + [0] * (max_len - len(x)))
    for _ in range(max_len - len(arr)):
        answer.append([0] * max_len)
    return answer
