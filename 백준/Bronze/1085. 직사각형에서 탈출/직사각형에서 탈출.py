import sys

x,y,w,h=map(int,sys.stdin.readline().split())
max_width=abs(w-x) if abs(w-x)<abs(x-0) else abs(x-0)
max_length=abs(h-y) if abs(h-y)<abs(y-0) else abs(y-0)
print(min(max_width,max_length))