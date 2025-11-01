def solution(schedules, timelogs, startday):
    answer = 0
    
    for i in range(len(schedules)):
        answer+=1
        nowDay=startday
        for day in timelogs[i]:
            if nowDay>7:
                nowDay=1
            standard=(schedules[i]//100)*60+(schedules[i]%100)
            if nowDay==6 or nowDay==7:
                nowDay+=1
                continue
            if standard+10 < (day//100)*60+(day%100):
                answer-=1
                break
            nowDay+=1
            
    
    return answer