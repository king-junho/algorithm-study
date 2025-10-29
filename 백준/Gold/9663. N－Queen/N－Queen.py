import sys

n = int(sys.stdin.readline())
case = []
cols = [False] * n
diag1 = [False] * (2 * n)
diag2 = [False] * (2 * n)
case = []
result = 0

def chesstrack(row):
    global result
    if row == n:
        result += 1
        return
    for col in range(n):
        if not cols[col] and not diag1[row + col] and not diag2[row - col + n]:
            cols[col] = diag1[row + col] = diag2[row - col + n] = True
            case.append((row, col))

            chesstrack(row + 1)

            case.pop()
            cols[col] = diag1[row + col] = diag2[row - col + n] = False


chesstrack(0)
print(result)
