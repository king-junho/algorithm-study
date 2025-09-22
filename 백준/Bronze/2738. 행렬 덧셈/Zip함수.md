# Python `zip()` 함수 정리

## 📌 기본 개념
- `zip()` 함수는 **여러 개의 iterable(리스트, 튜플, 문자열 등)** 을 동시에 묶어서 하나의 튜플로 반환한다.
- 가장 짧은 iterable의 길이를 기준으로 묶인다.

---

## ✅ 기본 사용법
```python
a = [1, 2, 3]
b = ['a', 'b', 'c']
result = zip(a, b)

print(list(result))  
# 출력: [(1, 'a'), (2, 'b'), (3, 'c')]
```

## ✅ 여러 개 iterable 묶기
```
nums = [1, 2, 3]
letters = ['a', 'b', 'c']
symbols = ['!', '@', '#']

zipped = zip(nums, letters, symbols)
print(list(zipped))
# 출력: [(1, 'a', '!'), (2, 'b', '@'), (3, 'c', '#')]
```
## ✅ 길이가 다를 때

zip()은 가장 짧은 iterable까지만 묶는다.
```
x = [10, 20, 30, 40]
y = ['A', 'B']

print(list(zip(x, y)))
# 출력: [(10, 'A'), (20, 'B')]
```

## ✅ for문과 함께 사용
```
names = ["Tom", "Jane", "Mike"]
scores = [95, 88, 76]

for name, score in zip(names, scores):
    print(f"{name}: {score}")

# 출력
# Tom: 95
# Jane: 88
# Mike: 76
```
## ✅ dict()와 함께 사용

두 리스트를 묶어서 딕셔너리 만들기 가능
```
keys = ['name', 'age', 'city']
values = ['Alice', 25, 'Seoul']

person = dict(zip(keys, values))
print(person)
# 출력: {'name': 'Alice', 'age': 25, 'city': 'Seoul'}
```

## ✅ 언패킹(*)과 함께 사용

zip()으로 묶은 것을 다시 풀 수 있다.
```
pairs = [(1, 'a'), (2, 'b'), (3, 'c')]
num, char = zip(*pairs)

print(num)   # (1, 2, 3)
print(char)  # ('a', 'b', 'c')
```
## 📖 요약

zip()은 iterable을 병렬로 묶어준다.

결과는 튜플의 묶음 형태.

가장 짧은 iterable까지만 묶인다.

for문, dict(), 언패킹(*)과 자주 함께 쓰인다.
