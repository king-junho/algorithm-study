import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P142 {
    private static final int INF = 1000000;
    public static void main(String[] args) throws Exception {
    /*
    1.14:55 시작 ~ 15:20
    dp 연속 누적합
    첫 번째 행에 필요한 W값 계싼
    2행부터 H행까지 누적합 계산
    빨간색 -> 파란색 -> 흰색 순으로 하나씩 쌓기
    빨간색 -> (이전칸의 빨간색, 이전칸 파란색)의 최소값에다가 현재 빨간색 더하기 *파란색과 빨간색 중 최소값 (이때 파란색은 흰색과의 최소값을 반영한 값)
    파란색 -> (이전칸의 흰색, 이전칸 파란색)의 최소값에다가 현재 파란색 더하기 *흰색과 파란색 중 최소값
    흰색 -> 이전 값에다가 누적 흰색값 * 흰색으로만 칠한 경우

    마지막 H행은 빨간색으로 끝나야 하므로 빨간색 더한 값으로 반환

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N*M) :
    공간 복잡도 : O(N*M) :

    3. 자료구조
    char[] flags
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int wCount=0;
            int bCount=INF;
            int rCount=INF;

            String line = br.readLine();
            for(int col=0; col<line.length(); col++) {
                if(line.charAt(col)!='W') {
                    wCount++;
                }

            }


            for(int row=1; row<n; row++) {
                int w=0;
                int b=0;
                int r=0;
                line = br.readLine();
                for(int col=0; col<m; col++) {
                    char c = line.charAt(col);

                    switch(c){
                        case 'W'->{
                            b++;
                            r++;
                        }
                        case 'B'->{
                            w++;
                            r++;
                        }
                        case 'R'->{
                            w++;
                            b++;
                        }
                    }
                }
                rCount = Math.min(rCount,bCount)+r;
                bCount = Math.min(wCount,bCount)+b;
                wCount += w;
            }

            sb.append("#").append(test_case).append(" ")
                    .append(rCount).append("\n");
        }
        System.out.print(sb.toString());
  }
}
