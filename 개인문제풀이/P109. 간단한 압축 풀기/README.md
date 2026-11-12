# P109. 간단한 압축 풀기

- D2 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 10분
- 확인일 2026-11-12 · [SWEA 1946](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PmkDKAOMDFAUq)

## 문제

대문자 C와 개수 K의 쌍이 주어진다. 각 쌍을 C가 K번 연속되는 문자열로 복원하고, 입력 순서대로 이어 붙인 결과를 한 줄에 10자씩 출력한다. 마지막 줄에 남은 문자가 10자 미만이면 남은 만큼 출력한다.

## 입출력

Java `Solution.main`으로 구현한다. 첫 줄에 테스트 케이스 수 T가 주어진다. 각 케이스에서 쌍의 수 N을 읽고, 다음 N줄에서 C와 K를 읽는다. 1 ≤ N ≤ 10, 1 ≤ K ≤ 20, C는 A~Z다. 케이스마다 `#케이스번호`를 한 줄에 출력한 뒤 다음 줄부터 복원한 문서를 출력한다.

## 자체 예시

```text
1
3
X 6
Y 6
Z 3
```

```text
#1
XXXXXXYYYY
YYZZZ
```

Y 6개 중 처음 4개가 첫 줄에 들어가고, 나머지 2개는 둘째 줄에서 Z 3개와 이어진다.
