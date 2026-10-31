import java.util.Arrays;
import java.util.Scanner;

class P055ReviewEvent implements Comparable<P055ReviewEvent> {
    int start;
    int end;
    P055ReviewEvent(int start, int end) { this.start = start; this.end = end; }
    @Override
    public int compareTo(P055ReviewEvent other) {
        int first = Integer.compare(this.end, other.end);
        if (first != 0) return first;
        return Integer.compare(this.start, other.start);
    }
}

public class P055Review1 {
    private static int greedy(P055ReviewEvent[] events, int n) {
        int count = 0;
        int endTime = 0;
        for (int i = 0; i < n; i++) {
            if (endTime <= events[i].start) {
                count++;
                endTime = events[i].end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            P055ReviewEvent[] events = new P055ReviewEvent[n];
            for (int i = 0; i < n; i++) events[i] = new P055ReviewEvent(sc.nextInt(), sc.nextInt());
            Arrays.sort(events);
            sb.append("#").append(tc).append(" ").append(greedy(events, n)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
