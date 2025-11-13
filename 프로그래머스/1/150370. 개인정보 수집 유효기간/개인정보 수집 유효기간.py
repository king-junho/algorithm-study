def solution(today, terms, privacies):
    answer = []
    today_year, today_month, today_day = map(int, today.split("."))
    dic_term = {}
    idx = 1
    for term in terms:
        a, b = term.split()
        dic_term[a] = int(b)
    for privacy in privacies:
        date, people = privacy.split()
        year, month, day = map(int, date.split("."))
        if day - 1 > 0:
            day -= 1
        else:
            day = 28
            month -= 1
        if month + dic_term[people] <= 12:
            month += dic_term[people]
        else:
            year += (
                (month + dic_term[people]) // 12
                if (month + dic_term[people]) % 12 != 0
                else (month + dic_term[people]) // 12 - 1
            )
            month = (month + dic_term[people]) % 12
            if month == 0:
                month = 12
        exp_period = str(year) + f"{month:02d}" + f"{day:02d}"
        today_str = str(today_year) + f"{today_month:02d}" + f"{today_day:02d}"
        print(exp_period)
        if int(exp_period) < int(today_str):
            answer.append(idx)
        idx += 1
    return answer
