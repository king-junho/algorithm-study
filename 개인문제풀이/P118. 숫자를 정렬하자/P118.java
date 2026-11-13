import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int test_case = 1; test_case <= t; test_case++) {
            int n = sc.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers);

            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < n; i++) {
                sb.append(numbers[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
