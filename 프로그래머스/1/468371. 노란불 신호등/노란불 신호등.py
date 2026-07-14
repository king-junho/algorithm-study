from math import lcm


def solution(signals):
    # 모든 신호등 상태가 다시 처음으로 돌아오는 전체 반복 주기
    total_cycle = 1

    for green, yellow, red in signals:
        period = green + yellow + red
        total_cycle = lcm(total_cycle, period)

    # 한 번의 전체 반복 주기만 확인
    for time in range(1, total_cycle + 1):
        all_yellow = True

        for green, yellow, red in signals:
            period = green + yellow + red
            position = (time - 1) % period

            # 현재 신호등이 노란불이 아닌 경우
            if not (green <= position < green + yellow):
                all_yellow = False
                break

        if all_yellow:
            return time

    return -1