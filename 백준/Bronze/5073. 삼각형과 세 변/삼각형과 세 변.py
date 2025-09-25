import sys

while True:
    input_angle = []
    input_angle[0:3] = map(int,sys.stdin.readline().split())
    if input_angle[0]==0:
        break
    if 2*max(input_angle) >= sum(input_angle):
        print("Invalid")
    else:
        input_angle=set(input_angle)
        if len(input_angle)==1:
            print("Equilateral")
        elif len(input_angle)==2:
            print("Isosceles")
        else:
            print("Scalene")