def solution(a, b, c, d):
    answer = 0
    dices = [a, b, c, d]
    dice_set = list(set(dices))
    dice_set_len = len(dice_set)

    if dice_set_len == 1:
        answer = 1111 * a
    elif dice_set_len == 2:
        if dices.count(dice_set[0]) == 1:
            answer = (10 * dice_set[1] + dice_set[0]) ** 2
        elif dices.count(dice_set[0]) == 3:
            answer = (10 * dice_set[0] + dice_set[1]) ** 2
        else:
            answer = (dice_set[0] + dice_set[1]) * (max(dice_set) - min(dice_set))
    elif dice_set_len == 3:
        answer = 1
        for dice in dice_set:
            if dices.count(dice) != 2:
                answer *= dice
    else:
        answer = min(dice_set)

    return answer