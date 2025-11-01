def solution(video_len, pos, op_start, op_end, commands):
    answer = ""
    video_m, video_s = map(int, video_len.split(":"))
    video_time = video_m * 60 + video_s

    pos_m, pos_s = map(int, pos.split(":"))
    pos_time = pos_m * 60 + pos_s

    op_start_m, op_start_s = map(int, op_start.split(":"))
    op_start_time = op_start_m * 60 + op_start_s

    op_end_m, op_end_s = map(int, op_end.split(":"))
    op_end_time = op_end_m * 60 + op_end_s

    for cmd in commands:
        if pos_time >= op_start_time and pos_time <= op_end_time:
            pos_time = op_end_time

        if cmd == "next":
            pos_time += 10
            if pos_time > video_time:
                pos_time = video_time
        elif cmd == "prev":
            pos_time -= 10
            if pos_time < 0:
                pos_time = 0
    if pos_time >= op_start_time and pos_time <= op_end_time:
        pos_time = op_end_time

    if pos_time // 60 < 10:
        pos_m = "0" + str(pos_time // 60)
    else:
        pos_m = str(pos_time // 60)

    if pos_time % 60 < 10:
        pos_s = "0" + str(pos_time % 60)
    else:
        pos_s = str(pos_time % 60)
    answer = f"{pos_m}:{pos_s}"
    return answer

