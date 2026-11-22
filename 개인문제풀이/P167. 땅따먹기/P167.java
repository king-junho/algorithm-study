import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P167 {
    int findMax(int row, int col, int[][] land){
        int max=0;

        for(int c=0; c<4; c++){
            if(c==col){
                continue;
            }
            max=Math.max(max, land[row][c]);
        }
        return max;
    }
    public int solution(int[][] land){
        int answer =0;
        int[][] dp = new int[land.length][4];
        for(int col=0; col<4; col++){
            dp[0][col] = land[0][col];
        }

        for(int row=1; row<land.length; row++){
            for(int col=0; col<4; col++){
                dp[row][col] = land[row][col]+findMax(row-1,col,dp);
            }
        }

        for(int col=0; col<4; col++){
            answer = Math.max(answer,dp[land.length-1][col]);
        }
        return answer;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.20:10 시작 ~ 20:25
    dp문제 이전까지의 최소 누적합 계산 후
    각 행마다 반복하면서 칸 선택
    현재 열 제외하고 최대값+현재값 합산 dp에 저장

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[][] land
    */

        Solution s = new Solution();

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(s.solution(land));
  }
}
