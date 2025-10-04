import sys
import math


a,b = map(int,sys.stdin.readline().split())
divisor = math.gcd(a,b)
a,b = a//divisor , b//divisor

c,d = map(int,sys.stdin.readline().split())
divisor = math.gcd(c,d)
c,d = c//divisor, d//divisor

divisor = math.gcd(b,d)
numerator= (a*(d//divisor))+(c*(b//divisor))
denominator = b*d//divisor

divisor = math.gcd(numerator,denominator)
numerator, denominator = numerator//divisor, denominator//divisor

print(f"{numerator} {denominator}")