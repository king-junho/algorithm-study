# P112. 퍼펙트 셔플

- D3 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 15분
- 확인일 2026-11-12 · [SWEA 3499](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWGsRbk6AQIDFAVW)

카드 덱을 앞 묶음과 뒤 묶음으로 나눈다. 앞 묶음부터 시작해 두 묶음에서 한 장씩 번갈아 뽑는다. 각 묶음 안의 순서는 유지한다. N이 홀수면 앞 묶음에 한 장을 더 배정한다. 섞은 카드의 순서를 출력한다.

Java `Solution.main`으로 구현한다. 첫 줄에 테스트 케이스 수 T가 주어진다. 각 케이스에는 카드 수 N과 카드 이름 N개가 각각 한 줄에 주어진다. 1 ≤ N ≤ 1,000이며 카드 이름은 대문자와 하이픈으로 구성되고 길이는 최대 80자다. 각 케이스는 `#케이스번호` 뒤에 카드 이름을 공백으로 구분해 한 줄에 출력한다.

## 자체 예시

```text
2
5
SUN MOON STAR CLOUD RAIN
4
RED BLUE GREEN GOLD
```

```text
#1 SUN CLOUD MOON RAIN STAR
#2 RED GREEN BLUE GOLD
```

첫 케이스는 앞 묶음 세 장과 뒤 묶음 두 장을 번갈아 뽑아 마지막에 STAR가 나온다. 둘째 케이스는 양쪽에 두 장씩 들어간다.
