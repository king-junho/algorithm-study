import java.util.*;

public class P163 {
    public static void main(String[] args) throws Exception {
    /*
    1.22:35 시작 ~ 22:45
    오름차순 정렬 후 연속된 구간 최소 합 찾기
    right-left+1==k일 때
        minValue> right-left 값이 이면 갱신
        left++;


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] numbers
    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] numbers = new int[n];

            for(int i=0; i<n; i++){
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers);

            int minValue=Integer.MAX_VALUE;
            int left=0;

            for(int right=0; right<n; right++){
                if(right-left+1==k){
                    minValue = Math.min(minValue,numbers[right]-numbers[left]);
                    left++;
                }
            }
            sb.append("#").append(test_case).append(" ")
                    .append(minValue).append("\n");
        }
        System.out.print(sb.toString());
  }
}
