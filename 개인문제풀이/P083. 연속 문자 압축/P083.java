import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class P083 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            String line = sc.next();
            Character lastChar = line.charAt(0);
            int count = 1;

            sb.append("#").append(testCase).append(" ");

            for (int i = 1; i < line.length(); i++) {
                if (lastChar == line.charAt(i)) {
                    count++;
                } else {
                    sb.append(lastChar);
                    if (count > 1) {
                        sb.append(count);
                    }
                    count = 1;
                    lastChar = line.charAt(i);
                }
            }

            sb.append(lastChar);
            if (count > 1) {
                sb.append(count);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
