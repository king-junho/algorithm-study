import math
import sys

def travel(count) :
	x1,y1,x2,y2 = map(int, sys.stdin.readline().split())

	n=int(sys.stdin.readline())
	for c in range(n) :
		c1,c2,r = map(int, sys.stdin.readline().split())
		r_sq = r**2
	
		des1 = (x1-c1)**2 + (y1-c2)**2
		des2 = (x2-c1)**2 + (y2-c2)**2

		#출발점이 원 안에 있는지 확인
		#출발점이 원 안에 있을 때
		if des1 < r_sq and des2 >r_sq :
			count+=1
		elif des1 >r_sq and des2 <r_sq :
			count+=1
	return count

tc = int(sys.stdin.readline())
for _ in range(tc):
	count=0
	print(travel(count))