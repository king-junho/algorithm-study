import sys

N = int(sys.stdin.readline())
count=0
keep=True

for _ in range(N):
    input_str = sys.stdin.readline().strip()
    input_len = len(input_str)
    reverse_str = input_str[::-1]
    word_list = list(set(input_str))

    for i in range(len(word_list)):
        start_idx = input_str.index(word_list[i])
        end_idx = reverse_str.index(word_list[i])
        if start_idx==input_len-(1+end_idx):
            continue
        elif input_str[start_idx:input_len-end_idx] != word_list[i]*(input_len-end_idx-start_idx):
            keep=False
            break
    if keep:
        count += 1
    keep=True

print(count)
