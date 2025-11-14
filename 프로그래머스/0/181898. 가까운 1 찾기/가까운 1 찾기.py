def solution(arr, idx):
    answer = 0
    if arr[idx] == 1:
        return idx
    arr = arr[idx + 1 :]
    if 1 in arr:
        return arr.index(1) + idx + 1
    else:
        return -1