## 🖥️ 코드 (Python)

```python
# Baekjoon 2480 — 주사위 세개
a, b, c = map(int, input().split())
dice = [a, b, c]
unique = set(dice)   # 중복 제거된 주사위 눈

if len(unique) == 1:  # 모두 같음
    price = 10000 + dice[0] * 1000
elif len(unique) == 2:  # 두 개 같음
    for x in unique:
        if dice.count(x) == 2:
            price = 1000 + x * 100
            break
else:  # 모두 다름
    price = max(dice) * 100

print(price)
```
## 🧩 코드 해석

dice = [a, b, c]
→ 주사위 눈 3개를 리스트에 저장

unique = set(dice)
→ 중복이 제거된 주사위 눈 (집합 자료형)

len(unique)

1 → 모두 같음

2 → 두 개 같음

3 → 모두 다름

dice.count(x)
→ 리스트에서 숫자 x가 몇 번 나오는지 세기
(두 개 같은 경우 찾을 때 사용)

## 🧮 set 함수 정리
📍 기본 개념
파이썬의 집합 자료형(set)은 중복을 허용하지 않고, 순서가 없는 자료구조
리스트나 문자열 등 반복 가능한 자료형을 넣으면, 중복이 제거된 원소들만 저장됨

```python
nums = [1, 2, 2, 3, 3, 3]
s = set(nums)
print(s)   # {1, 2, 3}
```

## ✅ 정리 포인트

set()을 이용하면 중복 제거와 원소 개수 확인이 쉬움
len(set(...)) : 서로 다른 값의 개수를 파악 가능 → 조건 분기 간단화에 유용
list.count(x) : 특정 값이 몇 번 나오는지 확인 가능 → "2개 같은 눈"을 찾는 데 활용
