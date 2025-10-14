
# 📊 Python `Counter` & `count()` 학습 정리

## 🧩 1. `count()` 함수란?

###  개요
- 리스트(list)나 문자열(str)에서 특정 요소가 몇 번 등장하는지를 세는 함수
- 리스트 전체를 순회하기 때문에 시간복잡도는 O(n)

### 📘 예제
```python
numbers = [1, 2, 2, 3, 3, 3]
print(numbers.count(2))  # 출력: 2
print(numbers.count(3))  # 출력: 3
````

### ⚠️ 특징

* 한 번에 **하나의 값**만 셀 수 있습니다.
* 여러 값의 빈도를 모두 세려면 루프나 다른 도구가 필요합니다.

---

## ⚙️ 2. `collections.Counter` 클래스란?

### ✅ 개요

* 파이썬 표준 라이브러리 `collections` 모듈에 포함된 클래스입니다.
* **리스트, 튜플, 문자열 등**의 각 요소가 **몇 번 등장했는지 자동으로 세어주는 딕셔너리 형태의 객체**입니다.
* 내부적으로 **해시 기반**이므로 탐색과 빈도 계산이 매우 빠릅니다.

### 📘 기본 사용법

```python
from collections import Counter

numbers = [1, 2, 2, 3, 3, 3]
counter = Counter(numbers)
print(counter)
# 출력: Counter({3: 3, 2: 2, 1: 1})
```

---

## 🧩 3. 주요 메서드 정리

### 1️⃣ `most_common([n])`

* 가장 많이 등장한 항목을 내림차순으로 반환합니다.
* 인자 `n`을 주면 상위 `n개`만 반환합니다.

```python
counter.most_common()
# 출력: [(3, 3), (2, 2), (1, 1)]

counter.most_common(1)
# 출력: [(3, 3)]   ← 최빈값 1개만
```

> ✅ `counter.most_common(1)[0][0]` → 최빈값
> ✅ `counter.most_common(1)[0][1]` → 최빈값의 등장 횟수
> 여기서 `(1)`은 상위 1개의 항목만 반환하겠다는 의미입니다.

---

### 2️⃣ `elements()`

* 각 요소를 등장 횟수만큼 반복하는 **이터레이터(iterator)**를 반환합니다.

```python
list(counter.elements())
# 출력: [1, 2, 2, 3, 3, 3]
```

---

### 3️⃣ `keys()`, `values()`, `items()`

```python
print(counter.keys())    # dict_keys([1, 2, 3])
print(counter.values())  # dict_values([1, 2, 3])
print(counter.items())   # dict_items([(1, 1), (2, 2), (3, 3)])
```

---

## 🧠 4. `count()` vs `Counter` 비교 요약

| 항목            | `count()`  | `collections.Counter`           |
| ------------- | ---------- | ------------------------------- |
| 반환 형태         | 정수(int)    | Counter 객체(딕셔너리 유사)             |
| 한 번에 셀 수 있는 값 | 1개         | 여러 개                            |
| 시간 복잡도        | O(n)       | O(n) 한 번으로 전체 계산                |
| 반복 필요 여부      | 여러 번 호출 필요 | 한 번에 전체 빈도 계산                   |
| 추가 기능         | 없음         | `most_common()`, `elements()` 등 |

---

## 🧩 5. 예제 — 최빈값 구하기

```python
from collections import Counter

numbers = [1, 3, 8, -2, 2, 3, 3, 2, 1]

counter = Counter(numbers)
print(counter)
# Counter({3: 3, 2: 2, 1: 2, 8: 1, -2: 1})

# 최빈값 (가장 많이 등장한 값)
mode_value = counter.most_common(1)[0][0]
mode_count = counter.most_common(1)[0][1]

print(f"최빈값: {mode_value}, 등장 횟수: {mode_count}")
# 출력: 최빈값: 3, 등장 횟수: 3
```

---

## 🧮 6. 백준 2108번 — 통계학 문제 예시

```python
import sys
from collections import Counter

n = int(sys.stdin.readline().strip())
numbers = [int(sys.stdin.readline().strip()) for _ in range(n)]

# 1. 산술평균
mean = round(sum(numbers) / n)

# 2. 중앙값
numbers.sort()
median = numbers[n // 2]

# 3. 최빈값
counter = Counter(numbers)
common = counter.most_common()
max_freq = common[0][1]

# 최빈값 후보만 필터링
modes = [num for num, freq in common if freq == max_freq]
modes.sort()
mode = modes[0] if len(modes) == 1 else modes[1]

# 4. 범위
range_value = numbers[-1] - numbers[0]

print(mean)
print(median)
print(mode)
print(range_value)
```

---

## 🏁 7. 정리

* 단순히 한 값만 세려면 ➜ `count()`
* 전체 데이터의 빈도나 최빈값을 구하려면 ➜ `Counter`
* `Counter.most_common(n)`은 통계 문제에서 자주 사용
