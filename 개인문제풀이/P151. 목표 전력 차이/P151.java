import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P151 {
    public static void main(String[] args) throws Exception {
    /*
    1.12:20 시작 ~ 12:36
    연속된 구간에서 특정 값 찾기
    연속된 누적 합 - (앞에서 나온 누적합의 경우) = k가 되면 됨
    반대로 앞에서 나온 누적합의 경우 = 연속된 누적합 - k이면 된다.
    앞에서부터 처례대로 (누적합, 나온 횟수) 기록
    각 누적합마다 누적합의 경우의 수가 있다면 누적

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(?) :

    3. 자료구조
    Map<Long, Integer> map<누적합, 나온 횟수>
    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            long k = sc.nextLong();
            Map<Long, Long> map = new HashMap<>();

            map.put(0L,1L);

            long sum=0;
            long count=0;

            for(int i=0; i<n; i++){
                sum+=sc.nextInt();

                count+=map.getOrDefault(sum-k,0L);
                map.put(sum, map.getOrDefault(sum,0L)+1);
            }

            sb.append("#").append(test_case).append(" ")
                    .append(count).append(" ").append("\n");
        }
        System.out.print(sb.toString());
  }
}
