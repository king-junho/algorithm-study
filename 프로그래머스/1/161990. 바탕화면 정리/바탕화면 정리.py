def solution(wallpaper):
    width = len(wallpaper[0])
    height = len(wallpaper)

    lux = width
    luy = height
    rdx = 0
    rdy = 0
    for i in range(height):
        for j in range(width):
            if wallpaper[i][j] == "#":
                lux = min(j, lux)
                luy = min(i, luy)
                rdx = max(j, rdx)
                rdy = max(i, rdy)

    answer = [luy, lux, rdy + 1, rdx + 1]
    return answer