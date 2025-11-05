def solution(mats, park):
    def checkPlace():
        for i in range(row, row + mat):
            for j in range(col, col + mat):
                if park[i][j] != "-1":
                    return False
        else:
            return True

    answer = -1
    empty_place_idx = []
    width = len(park[0])
    height = len(park)
    for i in range(height):
        for j in range(width):
            if park[i][j] == "-1":
                empty_place_idx.append([i, j])

    for mat in mats:
        if answer >= mat:
            continue
        for row, col in empty_place_idx:
            if row + mat > height or col + mat > width:
                continue
            if checkPlace():
                answer = mat
                break

    return answer

