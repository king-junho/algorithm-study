import math
import sys

def solve() :
	#좌표 입력
	x1, y1, r1, x2, y2, r2 = map(int, sys.stdin.readline().split())

	#두 터렛간 거리 계산
	des = (x1-x2)**2 + (y1-y2) **2

	#반지름 길이 합과 차
	r_sum = r1+r2
	r_diff = abs(r1-r2)

	#두 터렛 위치가 같을 때
	if des == 0:
		#중심이 같고 반지름도 같은 경우
		if r1==r2:
			print(-1)
		#중심은 같지만 반지름이 다른 경우
		else :
			print(0)
	#두 터렛 위치가 다를 때
	else :
		#두 원이 내접하거나 외접하는 경우
		if des == r_sum**2 or des ==r_diff**2:
			print(1)
		#두 원이 두 점에서 만나는 경우
		elif r_diff**2 < des < r_sum**2:
			print(2)
		#두 원이 안 만나는 경우
		else:
			print(0)
tc = int(sys.stdin.readline())
for c in range(tc):
	solve()