import java.util.*;


public class P156 {

  private static void findPeriod(int[] products,int k, StringBuilder sb){
    int minLength=Integer.MAX_VALUE;
    int start=0;
    int left=0;
    Set<Integer> set = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();

    for(int right=0; right<products.length; right++){
      int num = products[right];

      set.add(num);
      map.put(num, map.getOrDefault(num,0)+1);

      while(set.size()==k){
        int length = right-left+1;
        if(length<minLength){
          minLength=length;
          start=left;
        }

        int removeNum = products[left];
        int remain = map.put(removeNum, map.get(removeNum)-1);
        if(remain==1){
          set.remove(removeNum);
        }
        left++;
      }
    }

    if(minLength==Integer.MAX_VALUE){
      sb.append("-1").append("\n");
    }else{
      sb.append(start+1).append(" ").append(minLength).append("\n");
    }

  }
  public static void main(String[] args) throws Exception {
    /*
    1.15:45 시작 ~ 16:10
    HashSet으로 중복 검사, Map으로 개수 체크
    투포인터를 이용한 연속된 최수 길이 탐색
    for(int i=0; i<n; i++){
      set.add(numbers[i]);

      while(set.size()==k){
        int length=right-left+1;
        minLength=Math.min(minLength,length);

        map에서 numbers[left] 개수 하나씩 차감하고
        개수가 0이 되면 해당 숫자 set에서 삭제
        left++;
      }
    }
    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N) :
    공간 복잡도 : O(N) :

    3. 자료구조
    Map<Integer,Integer> map (숫자, 나온 횟수)
    Set<Integer> set : 나왔는지 확인
    int[] products
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t= sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n =sc.nextInt();
      int k =sc.nextInt();
      int[] products = new int[n];

      for(int i=0; i<n; i++){
        products[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ");
      findPeriod(products,k,sb);
    }
    System.out.print(sb.toString());

  }
}
