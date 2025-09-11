import sys

# 미리 저장할 리스트
fib_counts = [(1, 0), (0, 1)] # fib_counts[i] = (0의 호출 횟수, 1의 호출 횟수)

# fib(n)을 호출했을 때 0과 1의 호출 횟수를 계산
def solve_fib_counts(n):
    # 이미 저장된 값은 바로 반환
    if n < len(fib_counts):
        return fib_counts[n]

    # 저장되지 않은 값은 반복문을 통해 계산하여 추가
    for i in range(len(fib_counts), n + 1):
        prev_0_count, prev_1_count = fib_counts[i-1]
        prev2_0_count, prev2_1_count = fib_counts[i-2]
        
        # 0과 1의 호출 횟수는 각각 이전 두 항의 합
        current_0_count = prev_0_count + prev2_0_count
        current_1_count = prev_1_count + prev2_1_count
        fib_counts.append((current_0_count, current_1_count))
        
    return fib_counts[n]

tc = int(sys.stdin.readline())
for c in range(tc):
    n = int(sys.stdin.readline())
    count0, count1 = solve_fib_counts(n)
    print(count0, count1)