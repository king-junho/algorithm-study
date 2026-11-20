import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P148 {
    private static boolean aProcess(int[] seats, int id, int k){
        //예약이 이미 있거나 배정할 자리 없으면 실패
        int n =seats.length;
        int left=0;
        int right=0;
        int minLength=Integer.MAX_VALUE;
        int startIdx=0;

        while(left<n){
            while(left<n &&seats[left]!=0){
                if(seats[left]==id){
                    return false;
                }
                left++;
            }

            right=left;

            while(right<n && seats[right]==0){
                if(seats[right]==id){
                    return false;
                }
                right++;
            }
            int length = right-left;
            if(length<minLength && length>=k){
                minLength = length;
                startIdx=left;
            }
            left=right;
        }

        if(minLength==Integer.MAX_VALUE){
            return false;
        }

        for(int i=0; i<k; i++){
            seats[startIdx+i]=id;
        }

        return true;
    }
    private static void cProcess(int[] seats, int id){
        for(int i=0; i<seats.length; i++){
            if(seats[i]==id){
                seats[i]=0;
            }
        }
    }
    public static void main(String[] args) throws Exception {
    /*
    1.13:05 시작 ~ 13:31
    시뮬레이션 문제
    명령은 입력 순서대로 처리, 좌석 번호는 1부터 N까지

    명령
    -A id k : 연속 k인 좌석 id로 예약
    -C id : 해당 팀의 좌석 모두 비우기
    (1) 이미 팀 예약이 있거나 (2) 배정할 곳 없으면 거절

    예약 처리
        최소 구간 & 시작 idx 찾고 해당 구간에 k만큼 배치
        while(left<n){
            구간 시작 지점 찾기
            while(left<n && seats[left] !=0{
                left++
            }

            right=left;
            구간 종료 지점 찾기
            while(right<n && seats[right]==0){
                right++
            }

            구간 길이 구하고 최소 구간인지, 예약 가능한 공간인지 확인
            int length= right-left;
            if(minLength>length && length>=k){
                minLength=length;
                startIdx=left;
             }
             left=right;
        }
        for(int i=0; i<l i++){
            seats[startIdx+i] = id;
        }

    예약 비우기
        seats[i] == id 인 곳 0으로 변경



    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] seats
    */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] seats = new int[n];

            int failCount=0;

            sc.nextLine();
            for(int i=0; i<q; i++){
                String line = sc.nextLine();
                String[] inputs = line.split(" ");

                switch(inputs[0]){
                    case "A" ->{
                        if(!aProcess(seats,Integer.parseInt(inputs[1]),Integer.parseInt(inputs[2]))){
                            failCount++;
                        }
                    }
                    case "C" -> cProcess(seats,Integer.parseInt(inputs[1]));
                }
            }

            int count=0;
            for(int i=0; i<n; i++){
                if(seats[i]!=0){
                    count++;
                }
            }

            sb.append("#").append(test_case).append(" ")
                    .append(failCount).append(" ")
                    .append(count).append("\n");
        }
        System.out.print(sb.toString());
  }
}
