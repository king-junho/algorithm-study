import java.util.Scanner;

class P022ReviewDungeon {
    int need;
    int consume;
    P022ReviewDungeon(int need, int consume) { this.need = need; this.consume = consume; }
}

public class P022Review1 {
    private static int result = 0;
    private static void backtrack(int current, int depth, P022ReviewDungeon[] dungeons, boolean[] visited) {
        if (result == dungeons.length) return;
        result = Math.max(result, depth);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && current >= dungeons[i].need) {
                visited[i] = true;
                backtrack(current - dungeons[i].consume, depth + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            result = 0;
            P022ReviewDungeon[] dungeons = new P022ReviewDungeon[n];
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) dungeons[i] = new P022ReviewDungeon(sc.nextInt(), sc.nextInt());
            backtrack(k, 0, dungeons, visited);
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }
}
