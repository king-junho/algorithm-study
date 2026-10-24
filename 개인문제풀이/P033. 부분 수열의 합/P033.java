import java.util.Scanner;
public class P033 {
    public static int count;
    public static int sum;
    public static void backtrack(int startIdx, boolean[] visited, int[] numbers, int k) {
        if (sum >= k) {
            if (sum == k) count++;
            return;
        }
        for (int i = startIdx; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum += numbers[i];
                backtrack(i + 1, visited, numbers, k);
                visited[i] = false;
                sum -= numbers[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            boolean[] visited = new boolean[N];
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) numbers[i] = sc.nextInt();
            sum = 0;
            count = 0;
            backtrack(0, visited, numbers, K);
            System.out.println("#" + testCase + " " + count);
        }
    }
}
