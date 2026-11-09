import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P082 {
    private static int[] findGrade(int[] scores) {
        int n = scores.length;
        int[] grades = new int[n];
        int[] sortedScores = Arrays.copyOf(scores, n);
        HashMap<Integer, Integer> gradesMap = new HashMap();
        Arrays.sort(sortedScores);

        for (int i = n - 1; i >= 0; i--) {
            if (!gradesMap.containsKey(sortedScores[i])) {
                gradesMap.put(sortedScores[i], n - i);
            }
        }

        for (int i = 0; i < n; i++) {
            grades[i] = gradesMap.get(scores[i]);
        }
        return grades;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int[] scores = new int[n];
            int[] grades = new int[n];

            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            grades = findGrade(scores);

            sb.append("#").append(testCase).append(" ");
            for (int grade : grades) {
                sb.append(grade).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
