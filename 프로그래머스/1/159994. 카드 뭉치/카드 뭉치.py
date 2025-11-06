def solution(cards1, cards2, goal):
    cards1 = list(cards1[::-1])
    cards2 = list(cards2[::-1])
    for word in goal:
        if len(cards1) == 0:
            if cards2[-1] != word:
                return "No"
            cards2.pop()

        elif len(cards2) == 0:
            if cards1[-1] != word:
                return "No"
            cards1.pop()
        else:
            if cards1[-1] == word:
                cards1.pop()
            elif cards2[-1] == word:
                cards2.pop()

    return "Yes"

