import sys

dials=['ABC','DEF','GHI',"JKL","MNO","PQRS","TUV","WXYZ"]
total_time=0
def find_dial(str) :
    index=0
    for dial in dials:
        if dial.find(str)!=-1:
            return index+3
        index+=1



input_str = sys.stdin.readline().strip()
for s in input_str:
    total_time+=find_dial(s)
print(total_time)
