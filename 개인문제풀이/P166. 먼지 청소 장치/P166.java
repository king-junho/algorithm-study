import java.util.*;

public class P166 {
    private static final int[] dr = {-1,1,0,0};
    private static final int[] dc = {0,0,-1,1};
    public static void main(String[] args) throws Exception {
    /*
    1.01:10 시작 ~ 01:34
    시뮬레이션 문제
    for(int day=1 day<=n; day++)
        (1) 먼지 확산
            -각 칸의 먼지량을 5로 나눈 value(몫) 구하고
            -동서남북 유효한 칸에 value(먼지) 더하기, 유효한 칸수 구하고
            -현재 칸에 유효한 칸*value만큼 먼지 빼기

        (2) 청소기 청소
            -청소기 있는 칸 먼지량 totalAmount에 누적합


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(H*W*D) :
    공간 복잡도 : O(H*W) :

    3. 자료구조
    long rooms[]
    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++) {
            int h =  sc.nextInt();
            int w = sc.nextInt();
            int d = sc.nextInt();
            int r = sc.nextInt()-1;
            int c =  sc.nextInt()-1;

            long[][] map = new long[h][w];
            long[][] next = new long[h][w];

            long totalClean=0;

            for(int row=0; row<h; row++) {
                for(int col=0; col<w; col++) {
                    map[row][col] = sc.nextInt();
                }
            }

            for(int day=1; day<=d; day++){
                for(int row=0; row<h; row++) {
                    for(int col=0; col<w; col++) {
                        if(map[row][col] == -1){
                            continue;
                        }
                        long value = map[row][col]/5;
                        int nearCount=0;
                        for(int direction=0; direction<4; direction++){
                            int nr =  row+dr[direction];
                            int nc = col+dc[direction];

                            if(nr<0 || nr>=h || nc<0 || nc>=w || map[nr][nc] == -1) {
                                continue;
                            }
                            nearCount++;
                            next[nr][nc] += value;
                        }
                        map[row][col] -= (nearCount*value);
                    }
                }

                for(int row=0; row<h; row++) {
                    for(int col=0; col<w; col++) {
                        if(map[row][col] == -1){
                            continue;
                        }
                        map[row][col]+=next[row][col];
                        next[row][col] = 0;
                    }
                }

                totalClean+=map[r][c];
                map[r][c] = 0;
            }

            long totalDust=0;
            long maxDust=0;

            for(int row=0; row<h; row++) {
                for(int col=0; col<w; col++) {
                    if(map[row][col] == -1){
                        continue;
                    }
                    totalDust+=map[row][col];
                    maxDust = Math.max(maxDust, map[row][col]);
                }
            }



            sb.append("#").append(test_case).append(" ")
                    .append(totalClean).append(" ")
                    .append(totalDust).append(" ")
                    .append(maxDust).append("\n");
        }
        System.out.print(sb.toString());
  }
}
