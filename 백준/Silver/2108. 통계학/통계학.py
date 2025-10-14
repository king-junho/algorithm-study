import sys
from collections import Counter

n = int(sys.stdin.readline().strip())
numbers = []

for _ in range(n):
    numbers.append(int(sys.stdin.readline().strip()))

numbers.sort()
counter = Counter(numbers)
most_freq = counter.most_common(1)[0][1]
modes = [mode for mode, freq in counter.items() if freq == most_freq]


mean = round(sum(numbers) / n)
median = numbers[n // 2]
mode = modes[0] if len(modes) == 1 else modes[1]
range = numbers[-1] - numbers[0]

print(mean)
print(median)
print(mode)
print(range)
