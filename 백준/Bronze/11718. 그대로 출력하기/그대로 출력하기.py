import sys

output_list = []
for s in sys.stdin :
    output_list.append(s.strip())

print("\n".join(output_list))