import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        /*
         * 9:40 시작 ~ 9:45 종료
         * 짝수와 홀수의 합을 각각 구한다.
         * 제출 설명에는 짝수합 - 홀수합이라고 적었으나 코드는 홀수합 - 짝수합을 계산한다.
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }

            sb.append("#").append(testCase).append(" ")
                    .append(oddSum - evenSum).append("\n");
        }
        System.out.print(sb.toString());
    }
}
