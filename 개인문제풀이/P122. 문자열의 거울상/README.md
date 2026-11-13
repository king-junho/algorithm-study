# P122. 문자열의 거울상

- D3 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 10분
- 확인일 2026-11-13 · [SWEA 10804](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXTC0x16D8EDFASe)

문자열의 좌우 거울상을 구한다. 거울에서는 문자 순서가 반대가 되고, 각 문자는 b ↔ d, p ↔ q로 바뀐다.

Java `Solution.main`으로 구현한다. 첫 줄에 테스트 케이스 수 T, 다음 T줄에 b, d, p, q로 이루어진 문자열이 하나씩 주어진다. 각 케이스마다 `#케이스번호 거울상`을 출력한다.

## 자체 예시

```text
2
bdpp
q
```

```text
#1 qqbd
#2 p
```

첫 문자열의 오른쪽 끝에 있는 두 p는 거울상에서 왼쪽 끝의 두 q가 된다.
