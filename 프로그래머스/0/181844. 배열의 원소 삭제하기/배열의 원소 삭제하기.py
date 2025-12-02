def solution(arr, delete_list):
    answer = []
    for x in arr:
        if x in delete_list:
            continue
        answer.append(x)
    return answer