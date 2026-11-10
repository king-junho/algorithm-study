# P088. 초심자의 회문 검사

- 출처는 SWEA 1989 공개 연습 문제다. 2026-11-10에 공식 목록에서 D2를 확인했다. 최초 공개 연도는 확인되지 않았다. [문제 페이지](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PyTLqAf4DFAUq) · [공식 D2 목록](https://swexpertacademy.com/main/code/problem/problemList.do?orderBy=PASS_RATE&pageIndex=1&pageSize=10&problemLevel=2&select-1=2&selectCodeLang=JAVA)
- 유형은 풀이 전 비공개다.
- 권장 시간은 10분이다.

## 문제

주어진 단어를 거꾸로 읽어도 원래 단어와 같으면 1을, 다르면 0을 출력한다.

## 입출력과 제한

첫 줄에 테스트 케이스 수 T가 주어진다. 이후 각 줄에 길이 3 이상 10 이하의 단어 하나가 주어진다. 케이스마다 `#번호 결과`를 한 줄에 출력한다. 번호는 1부터 시작한다.

## 자체 예시

입력

```text
3
level
abba
abca
```

출력

```text
#1 1
#2 1
#3 0
```

`level`과 `abba`는 거꾸로 읽어도 같고, `abca`는 `acba`가 된다.

Java `Solution.main`으로 작성한다. 풀이 아이디어, 시간·공간 복잡도, 실제 풀이 시간을 함께 확인한다.


## 2026-11-10 — P088 최초 제출 통과

- 4분(13:03~13:07), 96점. 정확성 40/40, 효율성 19/20, 코드 품질 13/15, 테스트·경계 조건 15/15, 설명 9/10.
- Java 21에서 자체 예시, 길이 3~10의 a/b 문자열 전수, 고정 시드 무작위 단어를 포함해 2,343개를 실행했고 모두 일치했다. 좌우 대칭 문자를 직접 비교해 기대값을 만들었다. SWEA 채점기는 실행하지 않았다.
- 단어 길이 L 기준 시간 O(L), 뒤집은 문자열을 만드는 보조 공간 O(L), 전체 출력 버퍼 별도다. 사용하지 않는 이전 문제의 maxValue 메서드는 제거할 수 있다.
