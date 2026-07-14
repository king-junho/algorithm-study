def solution(message, spoiler_ranges):
    is_spoiler= [False]*len(message)
    
    for start, end in spoiler_ranges:
        for index in range(start,end+1):
            is_spoiler[index]=True
        
    spoiler_words= set()
    normal_words = set()
    
    index=0
    while index<len(message):
        if message[index]==" ":
            index+=1
            continue
        start = index
        
        while index < len(message) and message[index] != " ":
            index+=1
        end = index
        
        word = message[start:end]
        
        if any(is_spoiler[start:end]):
            spoiler_words.add(word)
        else:
            normal_words.add(word)
            
    important_words = spoiler_words-normal_words
        
    return len(important_words)