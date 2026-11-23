import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P154 {

    private static long findCase(int[] prices, long limit){
        if(limit<0){
            return 0;
        }
        long count=0;
        long sum=0;
        int left=0;

        for(int right=0; right<prices.length; right++){
            sum+=prices[right];

            while(sum>limit){
                sum-=prices[left];
                left++;
            }

            int length = right-left+1;
            count+=length;
        }

        return count;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.14:20 시작 ~ 14:30
    연속된 구간 조건 맞는 개수 찾기, 투포인터 문제
    left~right까지 R이하인지 여부 확인
     R보다 크다면 left++
    R이하 조건 만족하면 현재 length(right를 마지막으로 하는 조건에 R보다 작은 경우의 수) 구하기

    똑같은 방식으로 L-1 이하인 경우의 수 찾고
    R이하의 경우의 수 - L-1 이하의 겅우의 수는 L이상 R이하의 경우의 수와 같음.

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] prices
    long sum
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            int[] prices = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                prices[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("#").append(test_case).append(" ")
                    .append(findCase(prices,r)-findCase(prices,l-1)).append("\n");
        }
        System.out.print(sb.toString());
  }
}
