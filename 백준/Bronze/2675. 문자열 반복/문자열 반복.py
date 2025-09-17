import sys

tc = int(sys.stdin.readline())
result_list = []
word = ""
for _ in range(tc):
    R, S = sys.stdin.readline().split()
    for i in S :
        word+=i*int(R)
    result_list.append(word)
    word=""

print("\n".join(result_list))