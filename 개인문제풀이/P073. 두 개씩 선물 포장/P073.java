import java.util.Arrays;
import java.util.Scanner;
public class P073 {
    private static int twopoint(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int count = 0;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum <= target) {
                count++;
                left++;
                right--;
            } else {
                right--;
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
            int l = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) numbers[i] = sc.nextInt();
            Arrays.sort(numbers);
            sb.append("#").append(testCase).append(" ")
                    .append(twopoint(numbers, l)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
