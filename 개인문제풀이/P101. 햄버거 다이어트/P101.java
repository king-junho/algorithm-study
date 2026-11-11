import java.util.Scanner;

class Hambuger {
    public int score;
    public int calrorie;

    public Hambuger(int score, int calrorie) {
        this.score = score;
        this.calrorie = calrorie;
    }
}

public class P101 {
    private static int bestScore(Hambuger[] hambugers, int startIdx, int remain) {
        int best = 0;
        int n = hambugers.length;

        for (int i = startIdx; i < n; i++) {
            if (remain < hambugers[i].calrorie) {
                continue;
            }
            int result = hambugers[i].score;
            result += bestScore(hambugers, i + 1, remain - hambugers[i].calrorie);
            best = Math.max(result, best);
        }

        return best;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            Hambuger[] hambugers = new Hambuger[n];

            for (int i = 0; i < n; i++) {
                int score = sc.nextInt();
                int calrorie = sc.nextInt();
                hambugers[i] = new Hambuger(score, calrorie);
            }

            sb.append("#").append(testCase).append(" ").append(bestScore(hambugers, 0, l)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
