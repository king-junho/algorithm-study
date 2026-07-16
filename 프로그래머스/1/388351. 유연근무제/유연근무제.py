def solution(schedules, timelogs, startday):
    answer = 0

    for i in range(len(schedules)):
        if 60<=(schedules[i]+10)%100<=69:
            schedule = (schedules[i]+10-60)+100
        else:
            schedule=schedules[i]+10 
        day=startday-1
        isGood=True
        
        for timelog in timelogs[i]:
            if not 5<=day<=6:
                if schedule<timelog:
                    isGood=False
                    break
            day = (day+1)%7
            
        if isGood :
            answer+=1
            
            
    return answer