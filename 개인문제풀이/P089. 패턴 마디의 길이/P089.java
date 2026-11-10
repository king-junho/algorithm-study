import java.util.*;

public class P089 {
    private static int findPattern(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(word.charAt(i));

            if (sb.toString().repeat(30 / sb.length())
                    .equals(word.substring(0, 30 - (30 % sb.length())))) {
                return sb.length();
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            String word = sc.next();
            sb.append("#").append(testCase).append(" ").append(findPattern(word)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
