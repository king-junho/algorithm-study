import java.util.HashMap;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws Exception {
    /*
    1. 13:50 시작 ~ 13:47 종 료
    HashMap에 길이랑 개수 넣고 개수가 1 혹은 3인 것 출

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1)
    공간 복잡도 : O(1)

    3. 자료구조
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      HashMap<Integer, Integer> map = new HashMap<>();

      for(int i=0; i<3; i++){
        int n = sc.nextInt();
        map.put(n, map.getOrDefault(n,0)+1);
      }

      sb.append("#").append(test_case).append(" ");

      for(int key : map.keySet()){
        if(map.get(key)==1 || map.get(key)==3){
          sb.append(key).append("\n");
          break;
        }
      }
    }
    System.out.print(sb.toString());
  }

}

