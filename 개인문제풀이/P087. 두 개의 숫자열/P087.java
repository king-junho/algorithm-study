import java.util.*;

public class P087 {
    private static int maxValue(int[] longNums, int[] shortNums) {
        int result = Integer.MIN_VALUE;
        int longLength = longNums.length;
        int shortLength = shortNums.length;

        for (int i = 0; i <= longLength - shortLength; i++) {
            int sum = 0;
            for (int j = 0; j < shortLength; j++) {
                sum += longNums[i + j] * shortNums[j];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int result = n >= m ? maxValue(a, b) : maxValue(b, a);
            sb.append("#").append(testCase).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }
}
