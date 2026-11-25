import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P077 {
    private static int getHouse(int[] hopes, int[] house, int k){
        int count=0;
        int n = hopes.length;
        int peopleIdx=0;

        Arrays.sort(hopes);
        Arrays.sort(house);

        for(int size : house){
            if(peopleIdx==n){
                break;
            }
            if(size<hopes[peopleIdx]-k){
                continue;
            }

            while(peopleIdx<n && size>hopes[peopleIdx]+k){
                peopleIdx++;
            }

            if(peopleIdx==n){
                break;
            }

            if(hopes[peopleIdx]-k <= size && size <= hopes[peopleIdx]+k){
                count++;
                peopleIdx++;
            }
        }


        return count;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.12:10 시작 ~ 12:30분 종료
    투포인터 문제
    희망 집 크기 정렬
    실제 집 크기 정렬
    for(int i=0; i<m && people<n: i++){
        1) 희망크기 -k <= house[i] <= 희망크기 +k -> count++; people++
        2) 집 크기 < 희망크기 -k -> house++;
        3) 집 크기 > 희망크기 +k -> people++;
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(M+N) :
    공간 복잡도 : O(M+N) :

    3. 자료구조
    int hopes []
    int house []
    */
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int test_case=1; test_case<=t; test_case++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int hopes[] = new int[n];
            int house[] = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                hopes[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                house[i] = Integer.parseInt(st.nextToken());
            }
            sb.append("#").append(test_case).append(" ").append(getHouse(hopes,house,k)).append("\n");
        }
        System.out.print(sb.toString());


  }
}
