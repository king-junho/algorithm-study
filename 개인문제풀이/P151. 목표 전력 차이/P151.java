import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P151 {
    private static long findCase(int[] usage, long k){
        long count=0;
        long sum=0;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L,1);

        for(int i=0; i<usage.length; i++){
            sum+=usage[i];
            count+=map.getOrDefault(sum-k,0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.15:25 시작 ~ 15:40
    현재 구간합 - (이전 구간합) = k를 만족하는
    이전 구간합의 개수들의 총합

    map에다가 (현재 구간합, 나온 횟수) 저장
    (0,1L)로 시작, 구간합이 = k인 경우 체크하기 위함

    왼쪽부터 하나씩 늘려가며
    (1) k-현재 구간합이 나온 횟수 추가
    (2) 현재 구간합 횟수 추가

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] usage
    long sum
    Map<Long, Integer>
    */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int test_case=1; test_case<=t; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            int[] usage = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                usage[i] = Integer.parseInt(st.nextToken());
            }


            sb.append("#").append(test_case).append(" ")
                    .append(findCase(usage,k)).append("\n");
        }
        System.out.print(sb.toString());
  }
}
