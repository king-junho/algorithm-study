def solution(today, terms, privacies):
    answer = []

    def to_days(date):
        y, m, d = map(int, date.split("."))
        return y * 12 * 28 + m * 28 + d

    today_days = to_days(today)

    term_dict = {}
    for t in terms:
        name, period = t.split()
        term_dict[name] = int(period)

    for idx, info in enumerate(privacies, 1):
        date, people = info.split()
        expire_days = to_days(date) + term_dict[people] * 28 - 1

        if expire_days < today_days:
            answer.append(idx)
    return answer