import java.util.*;

public class P096 {
    private static int n, m, k;

    private static String order(int[] orders) {
        int people = 0;
        int remain = 0;
        for (int time = 0; time <= 11111; time++) {
            if (time % m == 0 && time != 0) {
                remain += k;
            }
            while (people < n && orders[people] <= time) {
                remain--;
                people++;
            }
            if (remain < 0) {
                return "Impossible";
            }
            if (people == n) {
                break;
            }
        }
        return "Possible";
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            int[] orders = new int[n];
            for (int i = 0; i < n; i++) {
                orders[i] = sc.nextInt();
            }
            Arrays.sort(orders);
            sb.append("#").append(testCase).append(" ").append(order(orders)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
