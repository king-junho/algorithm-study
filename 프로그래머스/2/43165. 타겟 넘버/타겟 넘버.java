class Solution {
    public int answer;

  private void backtrack(int[] numbers, int depth, int startIdx, int target, int sum){
    if (depth == numbers.length){
      if(target==sum){
        answer++;
      }
      return;
    }

    for(int number = startIdx; number < numbers.length; number++){
      sum+=numbers[number];
      backtrack(numbers, depth+1, number+1, target, sum);
      sum-=numbers[number];

      sum-=numbers[number];
      backtrack(numbers, depth+1, number+1, target, sum);
      sum+=numbers[number];
    }
  }

  public int solution(int[] numbers, int target){
    /*
    1. 아이디어
    제일 첫 번째 값부터 백트레킹 시작 중복되지 않는 조합
    if(depth==path.length) 이면 target과 현재 sum값이 같은지 확인 후 같으면 answer++ 아니면 그냥 return
      for반복 현재 start값부터 시작해서 lastCandidate까지 반복 이때 +일때랑 -일 때 둘 다 진행해줘야 함
        +진행 끝나고는 다시 sum값 조정 필요하고 -진행 끝나고도 동일 path는 어차피 덮어 씌우는거이기도 하고 sum 값을 위한 거니깐 굳이 필요 없겠다

    2. 시간복잡도
    시간복잡도 : K는 2^N 각 O(K)
    공간복잡도 : 스택 생성 만 O(N+1)
    3. 자료구조

     */

    answer=0;
    backtrack(numbers, 0, 0,target,0);

    return answer;
  }
}