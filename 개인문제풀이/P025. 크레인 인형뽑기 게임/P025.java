import java.util.Stack;

public class P025 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int N = board.length;
        int cnt = 0;
        for (int col : moves) {
            for (int row = 0; row < N; row++) {
                int doll = board[row][col - 1];
                if (doll == 0) {
                    continue;
                }
                board[row][col - 1] = 0;
                if (!basket.empty() && basket.peek() == doll) {
                    basket.pop();
                    cnt += 2;
                    break;
                }
                basket.push(doll);
                break;
            }
        }
        return cnt;
    }
}
