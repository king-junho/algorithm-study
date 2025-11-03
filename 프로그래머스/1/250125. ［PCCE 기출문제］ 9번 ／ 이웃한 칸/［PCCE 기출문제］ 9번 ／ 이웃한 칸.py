def solution(board, h, w):
    answer=0
    n=len(board)
    target_color=board[h][w]
    dh=[0,1,-1,0]
    dw=[1,0,0,-1]
    for i in range(4):
        check_h=h+dh[i]
        check_w=w+dw[i]
        if (0<=check_h<n) and (0<=check_w<n):
            if target_color==board[check_h][check_w]:
                answer+=1
    return answer