# P123. 직사각형 길이 찾기

- D3 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 10분
- 확인일 2026-11-13 · [SWEA 3456](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWFPmsqqALwDFAV0)

직사각형의 네 변 중 세 변의 길이가 순서 없이 주어진다. 남은 한 변의 길이를 구한다. 정사각형도 주어질 수 있다.

Java `Solution.main`으로 구현한다. 첫 줄에 테스트 케이스 수 T, 다음 T줄에 양의 정수 세 개가 주어진다. 각 결과는 `#케이스번호 길이` 형식으로 출력한다.

## 자체 예시

```text
3
8 3 8
4 9 9
7 7 7
```

```text
#1 3
#2 4
#3 7
```

첫 직사각형의 네 변은 8, 3, 8, 3이다. 세 번째는 네 변 모두 7이다.

## 개선 코드

서로 같은 두 변을 찾으면 나머지 길이가 답이다. 세 변이 모두 같으면 첫 조건에서 같은 길이를 반환한다.

```java
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int testCases = sc.nextInt();

        for (int testCase = 1; testCase <= testCases; testCase++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int missing;
            if (a == b) {
                missing = c;
            } else if (a == c) {
                missing = b;
            } else {
                missing = a;
            }

            output.append('#').append(testCase).append(' ')
                    .append(missing).append('\n');
        }
        System.out.print(output);
    }
}
```
