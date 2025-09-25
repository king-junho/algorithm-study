import sys

width=[]
height=[]

for _ in range(3):
    x,y = map(int,sys.stdin.readline().split())
    width.append(x)
    height.append(y)

for i in range(3):
    if width.count(width[i])==1:
        x=width[i]
    if height.count(height[i])==1:
        y=height[i]
print(x,y)