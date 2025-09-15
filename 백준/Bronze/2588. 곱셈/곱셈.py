import sys

num1=int(sys.stdin.readline())
num2=int(sys.stdin.readline())

hundreads = int(num2/100)
tens = int((num2%100)/10)
units = int((num2%10))

result1=num1*units
result2=num1*tens
result3=num1*hundreads
print(result1)
print(result2)
print(result3)

print(result3*100+result2*10+result1)