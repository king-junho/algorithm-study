import sys

input_n=[int(n) for n in sys.stdin]

input_n.sort()
print(sum(input_n)//len(input_n))
print(input_n[2])