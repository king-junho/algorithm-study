# P127. Base64 Decoder

- D2 · SWEA 공개 연습 · 문자열·비트 연산
- 권장 시간 15분
- 확인일 2026-11-14 · [SWEA 1928](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PR4DKAG0DFAUq)

Base64로 인코딩된 문자열을 원문으로 복원한다. 인코딩은 원문 3바이트를 24비트로 이어 붙인 뒤, 앞에서부터 6비트씩 나누어 값 0~63을 아래 순서의 문자에 대응시키는 방식이다.

```text
ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/
```

Java `Solution.main`으로 구현한다. 첫 줄에는 테스트 케이스 수 T가 주어진다. 다음 T줄에는 인코딩된 문자열이 하나씩 주어진다. 각 문자열 길이는 4의 배수이며 최대 100,000자다. 각 결과를 `#케이스번호 원문` 형식으로 출력한다. 원문에 포함된 공백도 유지한다.

## 자체 예시

```text
2
Q09ERVIh
R08gTk9X
```

```text
#1 CODER!
#2 GO NOW
```

첫 문자열은 8글자에서 원문 6바이트로 복원된다. 둘째 원문의 중간에는 공백이 있다.

## 개선 풀이

6비트 값 네 개를 왼쪽부터 정수에 쌓고, 상위 바이트부터 꺼낸다. 시간 O(L), 출력 문자열을 포함한 공간 O(L)이다. 블록 계산에 필요한 추가 공간은 O(1)이다.

```java
import java.util.Scanner;

class Solution {
    private static final String ALPHABET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private static String decode(String encoded) {
        StringBuilder decoded = new StringBuilder(encoded.length() / 4 * 3);

        for (int i = 0; i < encoded.length(); i += 4) {
            int bits = 0;
            for (int j = 0; j < 4; j++) {
                int value = ALPHABET.indexOf(encoded.charAt(i + j));
                bits = (bits << 6) | value;
            }

            decoded.append((char) ((bits >>> 16) & 0xFF));
            decoded.append((char) ((bits >>> 8) & 0xFF));
            decoded.append((char) (bits & 0xFF));
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            System.out.println("#" + testCase + " " + decode(sc.next()));
        }
    }
}
```
