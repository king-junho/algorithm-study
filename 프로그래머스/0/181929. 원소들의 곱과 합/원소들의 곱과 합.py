def solution(num_list):
    answer = 0
    n1 = 1
    n2 = sum(num_list) ** 2

    for n in num_list:
        n1 *= n
    answer = 1 if n1 < n2 else 0
    return answer

