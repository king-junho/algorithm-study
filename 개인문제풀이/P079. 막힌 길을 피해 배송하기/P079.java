import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P079 {
    private static final int DIVISOR = 1000000007;

    private static int findCase(char[][] map){
        int n = map.length-1;

        if(map[1][1]=='*'||map[n][n]=='*'){
            return 0;
        }

        int[][] dp = new int[n+1][n+1];
        dp[1][1]=1;

        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row==1&&col==1){
                    continue;
                }

                if(map[row][col]=='*'){
                    continue;
                }

                dp[row][col]=(dp[row-1][col]+dp[row][col-1])%DIVISOR;
            }
        }

        return dp[n][n];
    }
    public static void main(String[] args) throws Exception {
    /*
    1.13:40 시작 ~ 14:00분 종료
    dp 문제
    첫 번째 칸이나, 마지막 칸이 *이면 0 반환 아니라면
    dp[1][1] = 1로 놓고
    for(int row=1; row<=n; row++){
        for(int col=1; col<=n; col++){
            만약 현재 값이 *아면 패스
            자신의 위치에서 왼쪽 위쪽의 합을 현재 값으로 갱신
        }
    }
    return dp[n][n];

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N*N) :
    공간 복잡도 : O(N*N) :

    3. 자료구조
    char[][] map
    int[][] dp 이동 경로를 DIVISOR로 나눈 값으로 넣어서 int 범위 유지
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++){
            int n = Integer.parseInt(br.readLine());
            char[][] map = new char[n+1][n+1];

            for(int row=1; row<=n; row++){
                String line = br.readLine();
                for(int col=1; col<=n; col++){
                    map[row][col]=line.charAt(col-1);
                }
            }

            sb.append("#").append(test_case).append(" ")
                    .append(findCase(map)).append("\n");
        }
        System.out.print(sb.toString());

  }
}
