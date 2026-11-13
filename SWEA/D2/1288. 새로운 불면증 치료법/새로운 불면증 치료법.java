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
    1. 13:05 시작 ~ 13:23 종 료
    int multiple = 1
    HashSet<Integer> set;
    while(true){
      long sheep = n*multiple
      while(sheep>0){
        set.add(sheep%10);
        if(set.size()==10){
          return multiple;
        }
        sheep/=10;
      }
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(?)
    공간 복잡도 : O(1)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();

      sb.append("#").append(test_case).append(" ")
              .append(findMultiple(n)).append("\n");

    }
    System.out.print(sb.toString());
  }

}

