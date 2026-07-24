def solution(mats, park):
    answer = -1
    mats.sort(reverse=True)
    
    for mat in mats:
        for i in range(len(park)):
            for j in range(len(park[0])):
                if park[i][j]=="-1" and i<=len(park)-mat and j<=len(park[0])-mat:
                    answer = solution2(park,i,j,mat)
                    if answer!=-1:
                        print(i,j)
                        return answer
    
    return answer


def solution2(park,row,col,mat):
    for i in range(row,row+mat):
        for j in range(col, col+mat):
            if park[i][j]!="-1":
                return -1

    return mat