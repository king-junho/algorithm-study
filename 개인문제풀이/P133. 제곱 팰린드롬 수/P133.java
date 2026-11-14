import java.util.Scanner;

class Solution {
    private static boolean isPalindrome(int n) {
        String num = String.valueOf(n);
        StringBuilder reverseNum = new StringBuilder(num).reverse();
        if (num.equals(reverseNum.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = 0;

            for (int i = start; i <= end; i++) {
                double sqrtNum = Math.sqrt(i);
                if (sqrtNum % 1.0 == 0) {
                    if (isPalindrome(i) && isPalindrome((int) sqrtNum)) {
                        count++;
                    }
                }
            }

            sb.append("#").append(test_case).append(" ").append(count).append("\n");
        }
        System.out.print(sb.toString());
    }
}
