import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P149 {

    private static long findCase(int[] prices, long limit){
        if(limit<0){
            return 0;
        }
        Arrays.sort(prices);

        long count=0;
        int right=prices.length-1;

        for(int left=0; left<right; left++){
            while(left<right && prices[left]+prices[right]>limit){
                right--;
            }
            count+=right-left;
        }

        return count;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.14:35 시작 ~ 14:50
    연속된 구간 조건 맞는 개수 찾기, 투포인터 문제
    배열 오름차순으로 정렬 한 다음
    left=0 , right = weights.length-1;
    while(left<right){
        while(왼쪽, 오른쪽의 합>limit){
            right--;
        }
        조건 만족하면
        현재 구간이 왼쪽을 기준으로 만들 수 있는 쌍의 경우의 수와 같음
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] prices
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int[] weights = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                weights[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("#").append(test_case).append(" ")
                    .append(findCase(weights,r)-findCase(weights,l-1)).append("\n");
        }
        System.out.print(sb.toString());
  }
}
