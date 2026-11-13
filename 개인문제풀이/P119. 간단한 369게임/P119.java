import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        boolean isTarget = false;

        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            isTarget = false;
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
                    sb.append("-");
                    isTarget = true;
                }
            }
            if (!isTarget) {
                sb.append(num);
            }
            sb.append(" ");
        }
        System.out.print(sb.toString());
    }
}
