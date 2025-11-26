def solution(n, w, num):
    def find_idx(n):
        idx = 0
        if n % w == 0:
            if (n // w - 1) % 2 == 0:
                idx = w
            else:
                idx = 1

        else:
            if (n // w) % 2 == 0:
                idx = n % w
            else:
                idx = w - (n % w) + 1
        return idx

    answer = 0
    num_idx = find_idx(num)
    n_idx = find_idx(n)
    num_count = 0
    n_count = 0

    n_count = n // w + 1 if n % w != 0 else n // w
    num_count = num // w + 1 if num % w != 0 else num // w

    if n_count % 2 == 0:
        if n_idx > num_idx:
            answer = n_count - num_count
        else:
            answer = n_count - num_count + 1
    else:
        if n_idx < num_idx:
            answer = n_count - num_count
        else:
            answer = n_count - num_count + 1

    return answer