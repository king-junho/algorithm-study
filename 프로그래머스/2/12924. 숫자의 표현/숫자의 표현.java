class Solution {
    public int solution(int n) {
        int left=1;
    int right=1;
    int sum=1;
    int result=0;

    while(left<=n){
      if(sum==n){
        result++;
      }

      if(sum>=n){
        sum-=left;
        left++;
      }else{
        if(right<=n){
          right++;
          sum+=right;
        }

      }

    }
    return result;
    }
}