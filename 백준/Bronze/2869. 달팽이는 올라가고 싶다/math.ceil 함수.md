# 📘 Python `math.ceil()` 정리

## 1. 개요
- `math.ceil(x)` : **주어진 수를 올림하여 가장 작은 정수를 반환**하는 함수.
- `ceil`은 **ceiling(천장)**에서 온 말로, 소수점이 있으면 무조건 위쪽 정수로 올림.


## 2. 사용법
```python
import math

print(math.ceil(3.1))   # 4
print(math.ceil(3.9))   # 4
print(math.ceil(-3.1))  # -3
```
## 3. 주요 특징
- math.ceil()은 항상 올림 처리
- 음수일 때도 올림 → -3.1은 -3으로 (0 쪽으로 가는 게 아님)
- 실수(float)뿐 아니라 정수도 입력 가능 (정수 입력 시 그대로 반환)

## 4. 관련 함수
- math.floor(x) : 내림 (소수점 버리고 가장 큰 정수)
- math.trunc(x) : 0 방향으로 잘라냄
- round(x) : 반올림 (Python은 은행가 반올림 사용, 즉 .5일 때 짝수 쪽으로 감)

```python
import math

print(math.floor(3.9))  # 3
print(math.trunc(3.9))  # 3
print(math.trunc(-3.9)) # -3
print(round(2.5))       # 2
print(round(3.5))       # 4
```
## 5. 활용 예시
✅ 달팽이 올라가기 문제 (BOJ 2869)
```python
import math

A, B, V = map(int, input().split())
days = math.ceil((V - A) / (A - B)) + 1
print(days)
```

## 6. 요약
- ceil = 올림
- floor = 내림
- trunc = 0 방향 버림
- round = 반올림 (짝수 쪽으로)

수학적 계산에서 나머지 처리 대신 올림이 필요할 때 math.ceil()을 쓰면 편리함
