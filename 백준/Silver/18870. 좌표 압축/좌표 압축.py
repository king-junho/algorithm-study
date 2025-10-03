import sys

n= int(sys.stdin.readline())
input_x = list(map(int,sys.stdin.readline().split()))
sort_x = sorted(set(input_x))
dict_x = {value:idx for idx, value in enumerate(sort_x)}

print(" ".join(str(dict_x[i]) for i in input_x))