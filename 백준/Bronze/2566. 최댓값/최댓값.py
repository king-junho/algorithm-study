import sys

max_value = -1
max_row, max_col = 0, 0

for i in range(9):
    row = list(map(int, sys.stdin.readline().split()))
    current_max = max(row)
    
    if current_max > max_value:
        max_value = current_max
        max_row = i + 1
        max_col = row.index(current_max) + 1

print(max_value)
print(max_row, max_col)