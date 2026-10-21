import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves){
    /*
    만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.
    위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.

    1. 아이디어
    for(int col : moves)로 반복문 인형뽑기 시작
      해당 col에서 row=0부터 N까지 0이 안나올 떄까지 아래로 내려가며 탐색 0이 아니면 해당 값 stack에 저장 -> stack저장 시 제일 위에 값 확인하고 같으면 위에 값 지우고 cnt+=2, 다르면 stack에 넣기

    2. 시간복잡도
    시간복잡도 : 명령 크기 C 가로,세로 크기 N이라 할 때 명령 하나당 N 조회이므로 O(CN)
    공간복잡도 : 스택 만드는 것 O(C)

    3. 자료구조
    바구니를 표현할 스택
     */

    Stack<Integer> basket = new Stack<>();
    int N = board.length;
    int cnt=0;

    for(int col : moves){
      //해당 열 제일 위에서부터 인형 있는지 확인
      for(int row=0; row<N; row++){
        int doll = board[row][col-1];
        //인형 없으면 넘기고
        if(doll==0){
          continue;
        }

        board[row][col-1]=0;

        //인형 있다면 바구니 제일 위에 값 확인하고 같으면 cnt+=2 없으면 그냥 넣기
        if(!basket.empty() && basket.peek()==doll){
          basket.pop();
          cnt+=2;
          break;
        }
        basket.push(doll);
        break;
      }
    }

    return cnt;
    }
}