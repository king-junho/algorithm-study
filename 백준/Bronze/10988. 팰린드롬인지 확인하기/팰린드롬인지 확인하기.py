import sys

input_str = sys.stdin.readline().strip()
print(1 if input_str == input_str[::-1] else 0)