import sys

# sys.stdin.readline()은 한 줄의 문자열을 읽어옵니다.
# strip()은 문자열 양 끝의 공백을 제거합니다.
line = sys.stdin.readline().strip()

# split()을 사용해 공백을 기준으로 문자열을 나눕니다.
# 예: "1 2" -> ['1', '2']
parts = line.split()

# map(int, ...)를 사용해 각 문자열을 정수로 변환합니다.
# ['1', '2'] -> [1, 2]
a, b = map(int, parts)

# 두 정수를 더하고 결과를 출력합니다.
print(a + b)