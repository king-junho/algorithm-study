from math import lcm

def solution(signals):
    total_cycle = 1
    
    for g, y, r in signals:
        period = g+y+r
        total_cycle = lcm(total_cycle,period)
    
    for time in range(1,total_cycle+1):
        all_yellow = True
        
        for g,y,r in signals:
            period = g+y+r
            position = (time-1)%period
            
            if not (g<=position<g+y):
                all_yellow=False
                break
        if all_yellow :
            return time
        
    return -1