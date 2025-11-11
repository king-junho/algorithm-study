def solution(my_string, queries):
    answer = ""
    for s, e in queries:
        temp = my_string[e : s - 1 : -1] if s != 0 else my_string[e::-1]
        my_string = my_string[0:s] + temp + my_string[e + 1 :]

    return my_string