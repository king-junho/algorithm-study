

def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    
    video_m,video_s = map(int,video_len.split(":"))
    video_val = video_m*60+video_s
    
    pos_m,pos_s = map(int,pos.split(":"))
    pos_val = pos_m*60+pos_s

    op_start_m, op_start_s = map(int,op_start.split(":"))
    op_start_val = op_start_m*60 + op_start_s

    op_end_m, op_end_s = map(int,op_end.split(":"))
    op_end_val = op_end_m*60 + op_end_s
    
    for command in commands:
        if op_start_val<=pos_val<=op_end_val:
            pos_val = op_end_val
        if command == "next":
            pos_val+=10
            if pos_val>video_val:
                pos_val=video_val
        else:
            pos_val-=10
            if pos_val < 0 :
                pos_val = 0
        print(pos_val)
    
    if op_start_val<=pos_val<=op_end_val:
        pos_val = op_end_val
    answer = str(pos_val//60).zfill(2)+":"+str(pos_val%60).zfill(2)

    return answer