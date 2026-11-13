import java.util.HashSet;
import java.util.Scanner;

class Solution {
  private static int findMultiple(int n){
    int multiple = 1;
    HashSet<Integer> set = new HashSet<>();

    while(true){
      long sheep = (long)n*multiple;
      while(sheep>0){
        set.add((int)sheep%10);
        if(set.size()==10){
          return n*multiple;
        }
        sheep/=10;
      }
      multiple++;
    }
  }

  public static void main(String[] args) throws Exception {
    /*
    1. 13:45 시작 ~ 13:47 종 료
    문자열 마지막부터 대칭 문자열 출력

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L)
    공간 복잡도 : O(L)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      String line = sc.next();

      sb.append("#").append(test_case).append(" ");

      for(int i= line.length()-1; i>=0; i--){
        char c = line.charAt(i);

        switch(c){
          case 'b':
            sb.append('d');
            break;
          case 'd':
            sb.append('b');
            break;
          case 'p':
            sb.append('q');
            break;
          case 'q':
            sb.append('p');
            break;
        }
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }

}

