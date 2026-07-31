def solution(bandage, health, attacks):
    answer = 0
    time=1
    cur_health=health
    #시전시간, 초당 회복, 추가 회복
    t,x,y=bandage

    for i in range(len(attacks)-1):
        cur_health-=attacks[i][1]
        if cur_health <= 0 :
            return -1
        dur_time = attacks[i+1][0]-attacks[i][0]-1
        recover = (dur_time*x) + (dur_time//t)*y
        cur_health+= recover
        if cur_health > health:
            cur_health=health
            
    cur_health-=attacks[len(attacks)-1][1]
    
    return cur_health if cur_health>0 else -1