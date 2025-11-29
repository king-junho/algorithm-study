def solution(n, computers):
    answer = 0
    visited = [False] * n

    def myDfx(x):
        visited[x] = True
        for i in range(n):
            if computers[x][i] == 1 and not visited[i]:
                myDfx(i)
    for i in range(n):
        if not visited[i]:
            myDfx(i)
            answer+=1

    return answer