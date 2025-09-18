import sys

input_str = sys.stdin.readline().strip().upper()
set_input = set(input_str)
result=""
count=0

for s in set_input:
    n=input_str.count(s)
    if count < n :
        count=n
        result=s
    elif count == n :
        result="?"
print(result)