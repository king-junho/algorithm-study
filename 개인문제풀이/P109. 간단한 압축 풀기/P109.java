import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();

            sb.append("#").append(test_case);
            int length = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int count = sc.nextInt();

                while (count > 0) {
                    if (length % 10 == 0) {
                        sb.append("\n");
                    }
                    sb.append(s);
                    length++;
                    count--;
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
