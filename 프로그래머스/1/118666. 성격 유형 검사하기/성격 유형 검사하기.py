def solution(survey, choices):
    personality_dic = {"A": 0, "N": 0, "R": 0, "T": 0, "C": 0, "F": 0, "J": 0, "M": 0}
    answer = ""

    for i in range(len(choices)):
        a = survey[i][0]
        b = survey[i][1]
        if choices[i] == 4:
            continue
        elif choices[i] < 4:
            personality_dic[a] += 4 - choices[i]
        else:
            personality_dic[b] += choices[i] - 4

    if personality_dic["T"] > personality_dic["R"]:
        answer += "T"
    else:
        answer += "R"
    if personality_dic["C"] >= personality_dic["F"]:
        answer += "C"
    else:
        answer += "F"
    if personality_dic["J"] >= personality_dic["M"]:
        answer += "J"
    else:
        answer += "M"
    if personality_dic["A"] >= personality_dic["N"]:
        answer += "A"
    else:
        answer += "N"

    return answer