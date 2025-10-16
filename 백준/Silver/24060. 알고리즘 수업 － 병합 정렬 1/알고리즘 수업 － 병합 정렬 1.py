import sys

count = 0


def merge_sort(arr, p, r, k):
    if p < r:
        q = (p + r) // 2
        merge_sort(arr, p, q, k)
        merge_sort(arr, q + 1, r, k)
        arr = merge(arr, p, q, r, k)

    return arr


def merge(arr, p, q, r, k):
    global count
    i = p
    j = q + 1
    t = 0
    tmp = [0] * (r - p + 1)
    while i <= q and j <= r:
        if arr[i] <= arr[j]:
            tmp[t] = arr[i]
            t += 1
            i += 1
            count += 1
        else:
            tmp[t] = arr[j]
            t += 1
            j += 1
            count += 1
        if count == k:
            print(tmp[t-1])
            return
    while i <= q:
        tmp[t] = arr[i]
        t += 1
        i += 1
        count += 1
        if count == k:
            print(tmp[t-1])
            return
    while j <= r:
        tmp[t] = arr[j]
        t += 1
        j += 1
        count += 1
        if count == k:
            print(tmp[t-1])
            return
    i = p
    t = 0
    while i <= r:
        arr[i] = tmp[t]
        i += 1
        t += 1
    return arr


n, k = map(int, sys.stdin.readline().split())
numbers = list(map(int, sys.stdin.readline().split()))
merge_sort(numbers, 0, len(numbers) - 1, k)
if count < k:
    print(-1)
