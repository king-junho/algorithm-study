def solution(new_id):
    def process_1(id):
        return id.lower()

    def process_2(id):
        value = ""
        for c in id:
            if c.isalpha() or c.isdigit() or c == "-" or c == "_" or c == ".":
                value += c
        return value

    def process_3(id):
        value = ""
        for c in id:
            if c == ".":
                if len(value) != 0 and value[-1] == ".":
                    continue
            value += c
        return value

    def process_4(id):
        value = id
        if id[0] == ".":
            value = id[1:]
        if id[-1] == ".":
            value = value[: len(value) - 1]
        return value

    def process_5(id):
        if len(id) == 0:
            return "a"
        else:
            return id

    def process_6(id):
        value = ""
        if len(id) >= 16:
            value = id[:15] if id[14] != "." else id[:14]
            return value
        else:
            return id

    def process_7(id):
        value = ""
        if len(id) <= 2:
            value = id + (id[-1] * (3 - len(id)))
            return value
        else:
            return id

    answer = new_id
    answer = process_1(answer)
    answer = process_2(answer)
    answer = process_3(answer)
    answer = process_4(answer)
    answer = process_5(answer)
    answer = process_6(answer)
    answer = process_7(answer)

    return answer

