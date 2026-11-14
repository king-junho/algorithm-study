# P134. 외로운 문자

D3 · SWEA 10912 공개 연습 · 문자열·빈도 · 권장 15분

2026-11-14 확인. [SWEA 문제](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXVJuEvqLAADFASe&categoryId=AXVJuEvqLAADFASe&categoryType=CODE)

알파벳 소문자로 이루어진 문자열 S에서 같은 문자 두 개를 골라 지우는 작업을 가능한 동안 반복한다. 두 문자는 떨어져 있어도 된다. 남은 문자를 알파벳 순서로 출력하고, 모두 지워지면 Good을 출력한다.

Java Solution.main으로 구현한다. 첫 줄에 T, 다음 T줄에 문자열 S가 하나씩 주어진다. 연습용 길이 제한은 1 ≤ |S| ≤ 100이다. 출력은 #케이스번호 결과 형식이다.

```text
3
abacb
zabca
abba
```

```text
#1 c
#2 bcz
#3 Good
```

첫 문자열에서 a 두 개와 b 두 개를 지우면 c가 남는다.

## 제출 결과 및 개선 풀이

19분, 92점. 제출본과 개선본 모두 Java 로컬 테스트 3,785개 중 실패 0개.

문자를 읽을 때마다 해당 문자의 짝이 남았는지 뒤집고, a부터 z 순으로 남은 문자를 모은다.

```java
import java.util.Scanner;

class Solution {
    private static String remainingLetters(String word) {
        boolean[] unpaired = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            unpaired[index] = !unpaired[index];
        }

        StringBuilder remaining = new StringBuilder();
        for (int i = 0; i < unpaired.length; i++) {
            if (unpaired[i]) {
                remaining.append((char) ('a' + i));
            }
        }

        return remaining.length() == 0 ? "Good" : remaining.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            output.append('#').append(tc).append(' ')
                  .append(remainingLetters(sc.next())).append('\n');
        }
        System.out.print(output);
    }
}
```
