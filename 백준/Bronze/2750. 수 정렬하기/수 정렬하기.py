import sys

n=sys.stdin.readline()
input_n=[int(n) for n in sys.stdin]

input_n.sort()
print("\n".join(map(str,input_n)))