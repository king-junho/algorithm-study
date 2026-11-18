# P142. 러시아 국기 같은 깃발

D4 · SWEA 공개 연습 · 권장 25분 · 로컬 통과 · 복습 대상

2026-11-16 확인. [SWEA 4613 공식 문제](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWQl9TIK8qoDFAXj&categoryId=AWQl9TIK8qoDFAXj&categoryType=CODE)

N×M 깃발을 위에서부터 흰색, 파란색, 빨간색의 세 연속된 가로 띠로 바꾼다. 각 띠는 한 행 이상이며 한 행은 모두 같은 색이어야 한다. 다시 칠할 칸의 최소 개수를 구한다.

첫 줄에 T, 각 케이스의 첫 줄에 N과 M(3~50), 이어서 W, B, R로 구성된 길이 M의 문자열 N줄이 주어진다. 출력은 `#케이스번호 최소변경수` 형식이다.

3×3에서 행이 WWW, BWB, RRR이면 가운데 칸 한 곳을 바꿔 `#1 1`을 출력한다.

## 제출 기록

35분(15:15~15:50). Java 21 로컬 100개 통과. SWEA 공식 채점 미확인. 시간 O(NM+N³), 입력을 포함한 케이스당 공간 O(NM).
