import java.util.Scanner;

class Solution {
  private static String inOrder(int n, int currentIdx, String[] words){
    String result="";
    if(currentIdx*2>n){
      if(currentIdx<=n){
        return words[currentIdx];
      }
      return "";
    }

    result+=inOrder(n,currentIdx*2,words);
    result+=words[currentIdx];
    result+=inOrder(n,currentIdx*2+1,words);

    return result;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 22:20 시작 ~ 22:06 종 료
    중위순회 문제 재귀함수 이용
    inOrder(크기, 현재 idx, 자료 담은 배열 words,sb){
      자식이 없으면(본인 *2 >n) return sb.append(현재 단어)

      왼쪽 자식으로 이동 inOrder(크기, idx*2, words, sb)
      sb.append(현재값)
      오른쪽 자식으로 이동 inOrder(크기, idx*2+1, words,sb)
    }


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(logN)
    공간 복잡도 : O(N)

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++){
      int n = sc.nextInt();
      sc.nextLine();
      String[] words = new String[n+1];

      for(int i=0; i<n; i++){
        String line = sc.nextLine();
        String[] input = line.split(" ");

        int index = Integer.parseInt(input[0]);
        String letter = input[1];

        words[index] = letter;
      }

      sb.append("#").append(test_case).append(" ")
              .append(inOrder(n,1,words)).append("\n");
    }
    System.out.print(sb.toString());
  }
}

