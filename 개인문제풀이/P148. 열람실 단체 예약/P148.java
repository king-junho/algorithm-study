import java.util.Scanner;

public class P148 {
  private static void cProcess(int[] seats, int id){
    for(int i=1; i<seats.length; i++){
      if(seats[i]==id){
        seats[i]=0;
      }
    }
  }

  private static boolean aProcess(int[] seats, int id, int size){
    int n =seats.length;
    int startIdx=1;
    int left=1;
    int right=1;

    int minLength=Integer.MAX_VALUE;

    for(int i=1; i<n; i++){
      if(seats[i]==id){
        return false;
      }
    }

    while(right<n){
      while(left<n&&seats[left]!=0){
        left++;
      }
      right=left;
      while(right<n && seats[right]==0){
        right++;
      }

      int length = right-left;
      if(length<minLength&&length>=size){
        startIdx=left;
        minLength=length;
      }
      left=right;
    }
    if(minLength==Integer.MAX_VALUE){
      return false;
    }

    for(int i=startIdx; i<startIdx+size; i++){
      seats[i]=id;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    /*
    1.
    시뮬레이션 문제
    (1) 명령 수행
    A이면 좌석 배치
      1- 최소 구간 배치
      2- 기존에 값이 있으면 실패 처리
    C이면 좌석 해제

    (2) 좌석 배치
    포인터 이용
    while(right<n){
      left 0이 될때까지 left++
      right=left부터
      0이 아닐때까지 right++
      length = right-left;
      if(length<minLength && length>=size){
        minLength = length;
        startIdx = left;
      }
      left=right;
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    int[] seats = new int[n+1]
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] seats = new int[n+1];

      int refuseCount=0;
      int bookedCount=0;

      sc.nextLine();
      for(int i=0; i<q; i++){
        String line = sc.nextLine();
        String input[] = line.split(" ");

        switch(input[0]){
          case "A":
            if(!aProcess(seats, Integer.parseInt(input[1]), Integer.parseInt(input[2]))){
              refuseCount++;
            }
            break;
          case "C":
            cProcess(seats, Integer.parseInt(input[1]));
            break;
        }
      }

      for(int i=1; i<seats.length; i++){
        if(seats[i]!=0){
          bookedCount++;
        }
      }

      sb.append("#").append(test_case).append(" ").append(refuseCount).append(" ").append(bookedCount).append("\n");
    }

    System.out.print(sb.toString());

  }
}
