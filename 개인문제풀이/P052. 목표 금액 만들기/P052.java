import java.util.Scanner;
public class P052 {
    private static int N;
    private static long K;
    private static int backtrack(int[] coupons, int currentIdx, long totalPrice) {
        if (totalPrice == K) {
            return 1;
        }
        if (totalPrice > K || currentIdx == N) {
            return 0;
        }
        int caseCount = 0;
        for (int i = currentIdx; i < N; i++) {
            caseCount += backtrack(coupons, i + 1, totalPrice + coupons[i]);
        }
        return caseCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            K = sc.nextLong();
            int[] coupons = new int[N];
            for (int i = 0; i < N; i++) {
                coupons[i] = sc.nextInt();
            }
            System.out.println("#" + test_case + " " + backtrack(coupons, 0, 0));
        }
    }
}
