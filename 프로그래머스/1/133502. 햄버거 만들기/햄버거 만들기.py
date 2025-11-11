def solution(ingredient):
    answer = 0
    hambuger_stack = []
    for i in ingredient:
        if i == 1 and len(hambuger_stack) >= 3:
            if (
                hambuger_stack[-1] == 3
                and hambuger_stack[-2] == 2
                and hambuger_stack[-3] == 1
            ):
                hambuger_stack.pop()
                hambuger_stack.pop()
                hambuger_stack.pop()
                answer += 1
            else:
                hambuger_stack.append(i)
        else:
            hambuger_stack.append(i)

    return answer
