import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Solution {
    private static String findGrade(double[] scores, int k) {
        String[] grades = new String[]{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        List<Double> sortedScores = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            sortedScores.add(scores[i]);
        }
        sortedScores.sort(Comparator.reverseOrder());

        return grades[sortedScores.indexOf(scores[k - 1]) / (scores.length / 10)];
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            double[] scores = new double[n];

            for (int i = 0; i < n; i++) {
                double middleScore = (sc.nextDouble() * 35) / 100;
                double finalScore = (sc.nextDouble() * 45) / 100;
                double subjectScore = (sc.nextDouble() * 20) / 100;

                scores[i] = middleScore + finalScore + subjectScore;
            }

            sb.append("#").append(testCase).append(" ").append(findGrade(scores, k)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
