def solution(my_string, is_suffix):
    suffixs=[]
    for i in range(len(my_string)):
        suffixs.append(my_string[i:])
    
    return 1 if is_suffix in suffixs else 0