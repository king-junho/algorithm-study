# P102. Sum

- SWEA 1209 공개 연습 문제다. 2026-11-11에 공식 목록에서 D3를 확인했다. 최초 공개 연도는 확인되지 않았다. [문제 페이지](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13_BWKACUCFAYh) · [공식 D3 목록](https://swexpertacademy.com/main/code/problem/problemList.do?categoryId=&categoryType=&contestProbId=&orderBy=INQUERY_COUNT&pageIndex=1&pageSize=10&problemLevel=3&problemTitle=&select-1=3&selectCodeLang=JAVA)
- 풀이 유형은 비공개다.
- 권장 시간은 20분이다.

100×100 정수 배열이 주어진다. 각 행의 합, 각 열의 합, 배열의 두 모서리 대각선의 합 중 가장 큰 값을 구한다. 최대인 줄이 여러 개여도 값은 한 번 출력한다.

테스트 케이스는 10개로 고정이다. 각 케이스의 첫 줄에 케이스 번호가 주어지고, 다음 100줄에 정수 100개씩 공백으로 구분되어 주어진다. 각 행의 합은 int 범위에 들어간다. 각 케이스마다 `#번호 최댓값`을 출력한다.

동작을 설명하기 위해 배열을 3×3으로 줄인 예시다.

```text
1 2 8
4 7 6
9 3 5
```

오른쪽 위에서 왼쪽 아래로 이어지는 대각선의 합인 8 + 7 + 9 = 24가 최댓값이다. 실제 제출 입력에는 100×100 배열이 주어진다.

Java `Solution.main`으로 작성한다. 풀이 아이디어, 시간·공간 복잡도, 실제 풀이 시간을 함께 확인한다.

## 2026-11-11 — P102 최초 제출

- Java 로컬 테스트 100개 중 50개 실패. 주석의 시작·종료 시각이 역순이라 풀이 시간은 미확인이다.

## 2026-11-11 — P102 두 번째 제출

- Java 로컬 테스트 100개 중 50개 실패.

## 2026-11-11 — P102 세 번째 제출

- Java 로컬 테스트 110개 중 5개 실패.
