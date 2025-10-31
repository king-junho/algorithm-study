def solution(n, w, num):
    answer = 0
    if ((n - 1) // w) % 2 != 0:
        if col_index(n, w) <= col_index(num, w):
            answer = ((n - 1) // w) - ((num - 1) // w) + 1
        else:
            answer = ((n - 1) // w) - ((num - 1) // w)
    else:
        if col_index(n, w) >= col_index(num, w):
            answer = ((n - 1) // w) - ((num - 1) // w) + 1
        else:
            answer = ((n - 1) // w) - ((num - 1) // w)
    return answer


def col_index(num, w):
    if ((num - 1) // w) % 2 == 0:
        idx = (num - 1) % w
    else:
        idx = w - ((num - 1) % w + 1)

    return idx

