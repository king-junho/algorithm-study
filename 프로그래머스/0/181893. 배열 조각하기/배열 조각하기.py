def solution(arr, query):
    for query_idx, arr_idx in enumerate(query, 0):
        if query_idx % 2 == 0:
            arr = arr[: arr_idx + 1]
        else:
            arr = arr[arr_idx:]
    return arr