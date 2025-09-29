# itertools.combinations 학습 정리

## 📌 1. 개요

`itertools.combinations(iterable, r)` 함수는 **순서를 고려하지 않고** iterable에서 `r`개의 원소를 뽑아 **모든 조합을 생성**하는 함수이다.

* **반환값**: 제너레이터(iterator) → 필요할 때마다 조합 생성
* **중복 허용 여부**: ❌ 중복 허용 안 함
* **정렬 여부**: 입력 iterable의 순서를 유지한 조합 반환

---

## 📌 2. 기본 사용법

```python
from itertools import combinations

data = [1, 2, 3, 4]
result = combinations(data, 2)

for comb in result:
    print(comb)
```

**출력**

```
(1, 2)
(1, 3)
(1, 4)
(2, 3)
(2, 4)
(3, 4)
```

* `[1, 2, 3, 4]`에서 2개씩 뽑는 모든 조합을 출력한다.

---

## 📌 3. list로 변환하기

```python
pairs = list(combinations(['a', 'b', 'c'], 2))
print(pairs)
```

**출력**

```
[('a', 'b'), ('a', 'c'), ('b', 'c')]
```

---

## 📌 4. 응용 예시

### ✅ 4-1. 블랙잭 문제 (N장 중 3장 뽑아 M과 가까운 합 구하기)

```python
from itertools import combinations

N, M = 5, 21
cards = [5, 6, 7, 8, 9]
result = 0

for comb in combinations(cards, 3):
    s = sum(comb)
    if s <= M and result < s:
        result = s

print(result)  # 출력: 21
```

---

### ✅ 4-2. 비밀번호 만들기 (문자열 조합)

```python
from itertools import combinations

chars = ['a', 'b', 'c', 'd']
for comb in combinations(chars, 3):
    print("".join(comb))
```

**출력**

```
abc
abd
acd
bcd
```

---

## 📌 5. 성능 비교 (브루트포스 vs combinations)

### 브루트포스 (3중 for문)

```python
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            card_sum = cards[i] + cards[j] + cards[k]
```

* **시간복잡도**: O(N³)
* **메모리**: 추가 사용 없음
* **장점**: 빠름, 오버헤드 적음
* **단점**: 코드 길고 가독성 낮음

### combinations 사용

```python
from itertools import combinations

for comb in combinations(cards, 3):
    card_sum = sum(comb)
```

* **시간복잡도**: O(N³)
* **메모리**: 제너레이터 사용 시 효율적
* **장점**: 코드 간결, 가독성 좋음
* **단점**: 내부 함수 호출 오버헤드로 약간 느릴 수 있음

---

## 📌 6. 결론

* **작은 입력(N ≤ 100)**: 두 방법 성능 차이 없음 → 가독성 좋은 `combinations` 권장
* **큰 입력(N > 1000)**: 성능 최적화 필요 → 브루트포스가 더 빠를 수 있음
* **실무/알고리즘 대회**: 코드 가독성이 중요하다면 `combinations`, 성능이 절대적이면 브루트포스 고려

---
