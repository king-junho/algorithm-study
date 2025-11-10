def solution(s):
    answer = []
    dict_alpha = {}

    for i in range(len(s)):
        if s[i] in dict_alpha:
            answer.append(i - dict_alpha[s[i]])
        else:
            answer.append(-1)
        dict_alpha[s[i]] = i

    return answer
