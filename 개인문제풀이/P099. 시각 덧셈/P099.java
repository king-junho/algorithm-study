import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P099 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int firstHour = sc.nextInt();
            int firstMinute = sc.nextInt();
            int secondHour = sc.nextInt();
            int secondMinute = sc.nextInt();

            int totalTime = (firstHour * 60 + firstMinute) + (secondHour * 60 + secondMinute);
            sb.append("#").append(testCase).append(" ")
              .append(((totalTime / 60) - 1) % 12 + 1).append(" ")
              .append((totalTime % 60) % 60).append("\n");
        }

        System.out.print(sb.toString());
    }
}
