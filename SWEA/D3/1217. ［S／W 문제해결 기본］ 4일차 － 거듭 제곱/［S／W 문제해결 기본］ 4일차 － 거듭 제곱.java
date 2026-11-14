import java.util.Scanner;

class Solution {
  public static int square(int num, int count) {
    if (count == 1) {
      return num;
    }
    return num * square(num, count - 1);
  }

  public static void main(String[] args) throws Exception {
    /*
    1. 21:20 시작 ~ 18:25 종 료
    재귀함수 이용해서 구현
    square(int num, int count){
      if(count==0)
        return num;
      return num*square(num,count-1);
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+M)
    공간 복잡도 : O(N+M*y)

    3. 자료구조
    LinkedList<Integer>
    */

    Scanner sc = new Scanner(System.in);

    for (int test_case = 1; test_case <= 10; test_case++) {
      int t = sc.nextInt();
      int num = sc.nextInt();
      int power = sc.nextInt();

      System.out.println("#" + test_case + " " + square(num, power));
    }
  }
}

