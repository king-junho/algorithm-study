class Solution {
    public int[] solution(int[] sequence, int k) {
    /*
    1. 아이디어
    이중 for문 사용시 시간 초과하므로 투포인터 이용
    left, right, sum 각각 0으로 시작
    while(left<n)일 때까지 반복
      sum==k && right-left가 작다면 startIdx, endIdx 같 변경

      sum>= k 라면 left값 빼고 left++
      sum<k라면 right값 넣고 right++
    2. 시간복잡도
    시간복잡도 : sequence의 크기 N이라면 O(N)
    공간복잡도 : O(1)

    3. 자료구조
     */

    int startIdx=0, endIdx=0;
    int left=0;
    int right=0;
    int sum=sequence[right];
    int length=Integer.MAX_VALUE;

    while(left<sequence.length){
      if(sum==k&&length>right-left){
        startIdx=left;
        endIdx=right;
        length=right-left;
      }

      if(sum>=k){
        sum-=sequence[left];
        left++;
      }

      else{
        if(right>=sequence.length-1){
          break;
        }
        right++;
        sum+=sequence[right];
      }

    }

    return new int[]{startIdx,endIdx};
  }
}