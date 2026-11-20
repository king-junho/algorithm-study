import java.util.*;

public class P161 {
    private static final long INF = 1000000000000L;
    public static void main(String[] args) throws Exception {
    /*
    1.15:35 시작 ~ 16:10
    다익스트라 특정 위치에서 다른 위치까지의 최소거리

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N^3) :
    공간 복잡도 : O(N*N) :

    3. 자료구조

    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] dist = new long[n+1][n+1];

            for(int row=1; row<=n; row++){
                Arrays.fill(dist[row], INF);
                dist[row][row]=0;
            }

            for(int i=0; i<m; i++){
                int from = sc.nextInt();
                int to = sc.nextInt();
                int weight = sc.nextInt();

                dist[from][to]=Math.min(dist[from][to], weight);
            }

            for(int k=1; k<=n; k++){
                for(int row=1; row<=n; row++){
                    for(int col=1; col<=n; col++){

                        if(dist[row][col]>dist[row][k]+dist[k][col]){
                            dist[row][col] = dist[row][k]+dist[k][col];
                        }
                    }
                }
            }

            sb.append("#").append(test_case).append("\n");
            for(int row=1; row<=n; row++){
                for(int col=1; col<=n; col++){
                    if(dist[row][col]==INF){
                        sb.append("-1 ");
                    }else{
                        sb.append(dist[row][col]).append(" ");
                    }

                }
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
  }
}
