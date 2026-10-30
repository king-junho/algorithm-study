import java.util.Scanner;

public class P074 {
    private static int twopoint(int[] numbers, int target) {
        int count = 0;
        long sum = 0;
        int left = 0;
        for (int right = 0; right < numbers.length; right++) {
            sum += numbers[right];
            while (sum >= target) {
                if (sum == target) {
                    count++;
                }
                sum -= numbers[left];
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) numbers[i] = sc.nextInt();
            sb.append("#").append(testCase).append(" ")
                    .append(twopoint(numbers, k)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
