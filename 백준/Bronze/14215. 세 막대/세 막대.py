import sys

input_value=list(map(int,sys.stdin.readline().split()))
sum_value = sum(input_value)
max_value = max(input_value)
if max_value*2 >= sum_value:
    print(2*(sum_value-max_value)-1)

else :
    print(sum_value)
