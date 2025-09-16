# Python 입력 처리 정리 (EOF / 여러 테스트 케이스)

1. 문제 상황<br>
테스트 케이스 수가 주어지지 않음 -> 입력 끝까지 처리해야 함 (EOF 처리 필요)

## 2. 방법 1: sys.stdin 사용<br>
```python 

import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a + b)

```

sys.stdin으로 한 줄씩 읽음

입력이 더 이상 없으면 반복 종료

여러 테스트 케이스 처리 가능 <br>


## 3. 방법 2: try-except 사용
``` python
while True:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except EOFError:
        break
```
input()으로 한 줄씩 읽음
입력 끝나면 EOFError 발생 → 반복 종료 (읽는 방식이 직관적)

## 4. 핵심 포인트

입력 개수가 정해지지 않은 경우에는 EOF까지 처리 필요

sys.stdin과 try-except 두 가지 방법 모두 사용 가능
