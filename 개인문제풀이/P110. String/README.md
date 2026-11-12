# P110. String

- D3 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 15분
- 확인일 2026-11-12 · [SWEA 1213](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14P0c6AAUCFAYi)

## 문제

본문에서 찾을 문자열이 등장하는 횟수를 구한다. 시작 위치가 다르면 서로 겹치는 등장도 각각 센다.

## 입출력

Java `Solution.main`으로 구현한다. 테스트 케이스는 10개이며 첫 줄에 별도의 T가 없다. 각 케이스에는 케이스 번호, 찾을 문자열, 본문이 각각 한 줄에 주어진다. 찾을 문자열은 최대 10자, 본문은 최대 1,000자다. 결과는 `#케이스번호 등장횟수` 형식으로 출력한다.

## 자체 예시

한 케이스만 발췌한 형식이다.

```text
1
aba
ababa
```

```text
#1 2
```

첫 번째와 세 번째 문자에서 시작하는 `aba`를 각각 센다.
