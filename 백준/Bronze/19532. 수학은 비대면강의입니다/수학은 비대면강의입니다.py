import sys

a,b,c,d,e,f = map(int,sys.stdin.readline().split())

result_x=((e*c)-(b*f))/((a*e)-(b*d))
result_y=((-d*c)+(a*f))/((a*e)-(b*d))

print(int(result_x),int(result_y))