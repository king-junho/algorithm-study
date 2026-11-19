import java.util.Scanner;

public class P158 {
    private static int findMax(int[] frequency){
        for(int i=100; i>=0; i--){
            if(frequency[i]>0){
                return i;
            }
        }
        return -1;
    }
    private static int findMin(int[] frequency){
        for(int i=0; i<=100; i++){
            if(frequency[i]>0){
                return i;
            }
        }
        return -1;
    }
    private static void findPeriod(int[] temperatures, int k, StringBuilder sb){
        int[] frequency = new int[101];
        int left=0;
        int bestLength=0;
        int bestStart=0;

        for(int right=0; right<temperatures.length; right++){
            frequency[temperatures[right]]++;

            while(findMax(frequency)-findMin(frequency)>k){
                frequency[temperatures[left]]--;
                left++;
            }

            int length = right-left+1;
            if(length>bestLength){
                bestLength=length;
                bestStart=left;
            }

        }

        sb.append(bestStart+1).append(" ").append(bestLength).append("\n");
    }
    public static void main(String[] args) throws Exception {
    /*
    1.19:17 시작 ~ 17:00
    연속된 구간 조건에 맞는 최대-최소값의 개수 구하기
    right에 있는 값 계속 더하다가
    최대값-최소값이 >k 보다 크면
    left이동하면서 값 줄이기
    온도는 0~100까지의 값이니
    각 온도의 등장횟수를 담은 배열 만들고 각 구간마다 등장한 횟수별로 최대값 최소값 구하기

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] frequency : 각 온도별 등장
    int[] temperatures : 구간별 온도
    */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t= sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] temperatures = new int[n];

            for(int i=0; i<n; i++){
                temperatures[i] = sc.nextInt();
            }

            sb.append("#").append(test_case).append(" ");
            findPeriod(temperatures,k,sb);
        }
        System.out.print(sb.toString());

  }
}
