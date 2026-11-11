import java.util.Scanner;

public class P100 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int firstMonth = sc.nextInt();
            int firstDay = sc.nextInt();
            int secondMonth = sc.nextInt();
            int secondDay = sc.nextInt();
            int result = 0;

            if (firstMonth != secondMonth) {
                result += days[firstMonth] - firstDay + 1;
                for (int month = firstMonth + 1; month < secondMonth; month++) {
                    result += days[month];
                }
                result += secondDay;
            } else {
                result = secondDay - firstDay + 1;
            }

            sb.append("#").append(testCase).append(" ").append(result).append("\n");
        }

        System.out.print(sb.toString());
    }
}
