def solution(arr, queries):
    answer = []
    for s, e, k in queries:
        temp = [x for x in arr[s : e + 1] if x > k]
        if len(temp) == 0:
            answer.append(-1)
        else:
            answer.append(min(temp))

    return answer
