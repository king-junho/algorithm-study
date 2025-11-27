def solution(rank, attendance):
    rank_dict = {}
    answer = 0

    for i in range(len(rank)):
        if attendance[i]:
            rank_dict[rank[i]] = i

    rank_dict = sorted(rank_dict.items())

    return rank_dict[0][1]*10000+100*rank_dict[1][1]+rank_dict[2][1]