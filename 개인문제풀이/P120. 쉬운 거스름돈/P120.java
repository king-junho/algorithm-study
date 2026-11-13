import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int test_case = 1; test_case <= t; test_case++) {
            int money = sc.nextInt();

            sb.append("#").append(test_case).append("\n");
            for (int i = 0; i < unit.length; i++) {
                sb.append(money / unit[i]).append(" ");
                money %= unit[i];
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
