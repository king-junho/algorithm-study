import sys


def draw_blank(n, row, col):
    for i in range(row, row + n):
        for j in range(col, col + n):
            my_star[i][j] = " "
    return


def draw_star(n, row, col):
    if n == 3:
        for i in range(row, row + 3):
            for j in range(col, col + 3):
                if i % 3 == 1 and j % 3 == 1:
                    my_star[i][j] = " "
                else:
                    my_star[i][j] = "*"
        return
    draw_star(n // 3, row, col)
    draw_star(n // 3, row, col + (n // 3))
    draw_star(n // 3, row, col + (n // 3) * 2)
    draw_star(n // 3, row + (n // 3), col)
    draw_blank(n // 3, row + (n // 3), col + (n // 3))
    draw_star(n // 3, row + (n // 3), col + (n // 3) * 2)
    draw_star(n // 3, row + (n // 3) * 2, col)
    draw_star(n // 3, row + (n // 3) * 2, col + (n // 3))
    draw_star(n // 3, row + (n // 3) * 2, col + (n // 3) * 2)


n = int(sys.stdin.readline())
my_star = [[0] * n for _ in range(n)]
draw_star(n, 0, 0)

for i in range(n):
    for j in range(n):
        print(my_star[i][j], end="")
    print("")
