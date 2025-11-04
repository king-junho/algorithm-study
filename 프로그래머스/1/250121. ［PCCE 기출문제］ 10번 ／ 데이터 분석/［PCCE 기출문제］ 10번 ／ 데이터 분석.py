def solution(data, ext, val_ext, sort_by):
    answer = []
    case = ["code", "date", "maximum", "remain"]
    ext_idx = case.index(ext)
    sort_idx = case.index(sort_by)

    for x in data:
        if x[ext_idx] < val_ext:
            answer.append(x)
    
    answer.sort(key=lambda x:x[sort_idx])
    return answer


data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]
ext = "date"
val_ext = 20300501
sort_by = "remain"
print(solution(data, ext, val_ext, sort_by))
