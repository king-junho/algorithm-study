def solution(todo_list, finished):
    answer = []
    for i in range(len(todo_list)):
        todo = todo_list[i]
        isfinish = finished[i]
        if not isfinish:
            answer.append(todo)
    return answer