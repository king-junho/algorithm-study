def solution(message, spoiler_ranges):
    # 각 문자 위치가 스포 방지 구간인지 표시
    is_spoiler = [False] * len(message)

    for start, end in spoiler_ranges:
        for index in range(start, end + 1):
            is_spoiler[index] = True

    spoiler_words = set()
    normal_words = set()

    index = 0

    while index < len(message):
        # 공백 건너뛰기
        if message[index] == " ":
            index += 1
            continue

        # 현재 단어의 시작 위치
        start = index

        # 단어 끝까지 이동
        while index < len(message) and message[index] != " ":
            index += 1

        # end는 단어의 마지막 인덱스 다음 위치
        end = index

        word = message[start:end]

        # 단어의 문자 중 하나라도 스포일러라면
        if any(is_spoiler[start:end]):
            spoiler_words.add(word)
        else:
            normal_words.add(word)

    # 일반 영역에도 등장한 단어는 제외
    important_words = spoiler_words - normal_words

    return len(important_words)