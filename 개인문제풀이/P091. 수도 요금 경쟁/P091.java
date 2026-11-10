import java.util.*;

public class P091 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();

            int a = p * w;
            int b = w > r ? q + (w - r) * s : q;
            int result = Math.min(a, b);
            sb.append("#").append(testCase).append(" ").append(result).append("\n");
        }

        System.out.print(sb.toString());
    }
}
