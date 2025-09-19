import sys

rate_dic = {
    "A+" : 4.5,
    "A0" : 4.0,
    "B+" : 3.5,
    "B0" : 3.0,
    "C+" : 2.5,
    "C0" : 2.0,
    "D+" : 1.5,
    "D0" : 1.0,
    "F" : 0.0,
}

sum_grade=0
sum_result=0

for line in sys.stdin:
    subject, grade, rate = line.split()
    if rate!='P':
        sum_grade += float(grade)
        sum_result += float(grade)*rate_dic[rate]

print(sum_result/sum_grade)