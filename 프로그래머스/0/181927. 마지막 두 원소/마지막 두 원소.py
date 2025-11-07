def solution(num_list):
    answer=list(num_list)
    a=num_list[-1]
    b=num_list[-2]
    if a>b:
        answer.append(a-b)
    else:
        answer.append(2*a)

    return answer

