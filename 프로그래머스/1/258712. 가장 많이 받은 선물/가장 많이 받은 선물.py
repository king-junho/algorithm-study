def solution(friends, gifts):
    answer = 0
    gift_score=[0]*len(friends)
    gift_table=[[0]*len(friends) for _ in range(len(friends))]
    
    for s in gifts:
        giver,receiver = s.split()
        giver_idx = friends.index(giver)
        receiver_idx = friends.index(receiver)
        gift_score[giver_idx]+=1
        gift_score[receiver_idx]-=1
        gift_table[giver_idx][receiver_idx]+=1

    for i in range(len(friends)):
        value=0
        for j in range(len(friends)):
            if i!=j:
                if gift_table[i][j]>gift_table[j][i]:
                    value+=1
                elif (gift_table[i][j]==gift_table[j][i]) & (gift_score[i]>gift_score[j]):
                    value+=1
        if value>answer:
            answer=value
                    
    return answer