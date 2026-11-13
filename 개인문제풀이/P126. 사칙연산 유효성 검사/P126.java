import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {
    private static int isCalculate(String[] lines) {
        for (String line : lines) {
            String[] input = line.split(" ");
            char node = input[1].charAt(0);

            if (input.length == 4) {
                if (node == '+' || node == '-' || node == '*' || node == '/') {
                    continue;
                } else {
                    return 0;
                }
            } else if (input.length == 2) {
                if (node == '+' || node == '-' || node == '*' || node == '/') {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = sc.nextInt();
            String[] lines = new String[n];
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                lines[i] = sc.nextLine();
            }
            sb.append("#").append(test_case).append(" ")
                    .append(isCalculate(lines)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
