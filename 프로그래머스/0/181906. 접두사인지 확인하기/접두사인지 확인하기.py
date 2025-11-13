def solution(my_string, is_prefix):
    prefixs=[]
    for i in range(len(my_string)):
        prefixs.append(my_string[0:i+1])
    
    return 1 if is_prefix in prefixs else 0