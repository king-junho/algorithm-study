# P103. 회문1

- SWEA 1215 공개 연습 문제다. 2026-11-11에 공식 목록에서 D3를 확인했다. 최초 공개 연도는 확인되지 않았다. [문제 페이지](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14QpAaAAwCFAYi) · [공식 D3 목록](https://swexpertacademy.com/main/code/problem/problemList.do?categoryId=&categoryType=&contestProbId=&orderBy=INQUERY_COUNT&pageIndex=1&pageSize=10&problemLevel=3&problemTitle=&select-1=3&selectCodeLang=JAVA)
- 풀이 유형은 비공개다.
- 권장 시간은 20분이다.

8×8 글자판에서 가로 또는 세로로 연속된 길이 L의 구간 중 회문의 개수를 구한다. 회문은 앞에서 읽은 문자열과 뒤에서 읽은 문자열이 같다. 같은 문자열도 위치가 다르면 각각 세고, 길이 1은 칸마다 한 번 센다.

테스트 케이스는 10개로 고정이다. 각 케이스의 첫 줄에 찾을 길이 L(1 이상 8 이하)이 주어진다. 다음 8줄에는 A, B, C로 이루어진 8글자가 공백 없이 주어진다. 각 케이스마다 `#번호 개수`를 출력한다. 번호는 1부터 시작한다.

첫 번째 케이스만 보여 주는 자체 예시다.

```text
3
ABCABCAB
ABCABCAB
ABCABCAB
ABCABCAB
ABCABCAB
ABCABCAB
ABCABCAB
ABCABCAB
```

```text
#1 48
```

가로에는 길이 3 회문이 없고, 세로에는 열마다 6개씩 있다.

Java `Solution.main`으로 작성한다. 풀이 아이디어, 시간·공간 복잡도, 실제 풀이 시간을 함께 확인한다.

## 2026-11-11 — P103 최초 제출

- Java 로컬 테스트 160개 중 20개 실패. 풀이 시간 35분.


## 2026-11-11 — P103 수정 후 통과

- 94점. 정확성 40/40, 효율성 19/20, 코드 품질 12/15, 테스트·경계 조건 15/15, 설명 8/10. 최초 35분, 수정 시간 미기재. 오답 후 수정해 복습 대상으로 기록했다.
- 로컬 Java 테스트 160개에서 실패 0개였다. 길이 1~8을 각각 20개씩 검증했다. 가로·세로에서 회문인 좌표 구간을 집합에 넣어 기대값을 구했다. SWEA 공식 채점 결과는 미확인이다.
- 길이 1이면 각 칸을 한 번씩 세어 64를 반환한다. N×N으로 일반화하면 입력 포함 시간 O(N² + N(N-k+1)k), 공간 O(N²), 검사 자체 보조 공간 O(k)다. 공식 판의 크기는 8×8로 고정이다.
