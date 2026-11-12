# P111. 비밀번호

- D3 · SWEA 공개 연습 · 유형 비공개
- 권장 시간 15분
- 확인일 2026-11-12 · [SWEA 1234](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14_DEKAJcCFAYD)

## 문제

숫자 문자열에서 같은 숫자가 이웃하면 두 문자를 함께 지운다. 삭제로 새로 이웃한 숫자도 같으면 지울 수 있다. 더 이상 지울 쌍이 없을 때 남은 문자열을 구한다.

## 입출력

Java `Solution.main`으로 구현한다. 테스트 케이스는 10개로 고정이며 별도의 T는 없다. 각 케이스는 길이 N과 0~9로 이루어진 문자열이 공백으로 구분되어 한 줄에 주어진다. 10 ≤ N ≤ 100이다. 각 답을 `#케이스번호 비밀번호` 형식으로 출력한다.

## 자체 예시

한 케이스만 발췌했다.

```text
10 1221344556
```

```text
#1 36
```

22를 지우면 11이 붙고, 이어 11, 44, 55를 지우면 36이 남는다.

## 제출 및 개선

- 최초 제출 20분, 통과 88점. 원본 제출은 P111.java에 보관했다.
- 제출 코드는 삭제 후 처음부터 다시 확인한다. 삭제는 최대 N/2번이고 매번 순회·문자열 이동·복사에 O(N)이 걸려 최악 시간 O(N²), 보조 공간 O(N)이다.
- 개선안은 스택의 원리로 처리한 문자를 저장한다. 새 문자가 마지막 문자와 같으면 마지막 문자를 지우고, 다르면 뒤에 붙인다. 각 문자가 한 번 추가되고 최대 한 번 삭제되어 시간 O(N), 공간 O(N)이다.
- Java 로컬에서 제출 및 개선안을 각각 200개 검증해 모두 실패 0개였다. SWEA 공식 채점은 미확인이다.

### 개선 코드

```java
import java.util.Scanner;

class Solution {
    private static String findPassword(String word) {
        StringBuilder remaining = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int length = remaining.length();

            if (length > 0 && remaining.charAt(length - 1) == current) {
                remaining.deleteCharAt(length - 1);
            } else {
                remaining.append(current);
            }
        }

        return remaining.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = sc.nextInt();
            String word = sc.next();

            output.append("#").append(testCase).append(" ")
                    .append(findPassword(word)).append("\n");
        }

        System.out.print(output);
    }
}

```
