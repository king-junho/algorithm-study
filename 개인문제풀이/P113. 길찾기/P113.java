import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    private static final int VERTEX_COUNT = 100;
    private static final int START = 0;
    private static final int TARGET = 99;
    private static final int TEST_CASES = 10;

    private static int findRoute(List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new ArrayDeque<>();
        visited[START] = true;
        queue.offer(START);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == TARGET) {
                return 1;
            }

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < TEST_CASES; i++) {
            int caseNumber = sc.nextInt();
            int edgeCount = sc.nextInt();
            List<List<Integer>> graph = new ArrayList<>(VERTEX_COUNT);
            for (int vertex = 0; vertex < VERTEX_COUNT; vertex++) {
                graph.add(new ArrayList<>());
            }

            for (int edge = 0; edge < edgeCount; edge++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                graph.get(from).add(to);
            }

            output.append('#').append(caseNumber).append(' ')
                    .append(findRoute(graph)).append('\n');
        }
        System.out.print(output);
    }
}
