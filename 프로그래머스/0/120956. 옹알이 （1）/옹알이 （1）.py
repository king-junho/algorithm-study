def solution(babbling):
    answer = 0
    speak = ["aya", "ye", "woo", "ma"]
    for word in babbling:
        for case in speak:
            word = word.replace(case, " ")
        if word.strip() == "":
            answer += 1
            
    return answer