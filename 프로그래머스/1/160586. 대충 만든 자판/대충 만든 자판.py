def solution(keymap, targets):
    def findIdx(keymap, s):
        result = 100
        for case in keymap:
            if s in case:
                idx = case.index(s)
                result = idx if idx < result else result
        return result + 1 if result != 100 else -1

    answer = []

    for target in targets:
        value = 0
        for s in target:
            idx = findIdx(keymap, s)
            if idx == -1:
                answer.append(-1)
                break
            else:
                value += idx
        if idx!=-1:
            answer.append(value)
    return answer
