import java.util.Scanner;

public class P071 {
    private static int twopoint(int[] numbers, int b) {
        long sum = 0;
        int end = 0;
        int result = 0;
        int n = numbers.length;

        for (int start = 0; start < n; start++) {
            while (sum < b && end < n) {
                sum += numbers[end];
                end++;
            }

            if (sum <= b) {
                result = Math.max(result, end - start);
            } else {
                result = Math.max(result, end - start - 1);
            }
            sum -= numbers[start];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            sb.append("#").append(testCase).append(" ")
                    .append(twopoint(numbers, b)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
