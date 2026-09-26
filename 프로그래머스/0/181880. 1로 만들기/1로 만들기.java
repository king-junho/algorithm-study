class Solution {
    public int solution(int[] num_list) {
        int sum=0;
        
        for(int n : num_list){
            sum+=getCount(n);
        }
        return sum;
    }
    
    public int getCount(int n){
        int count=0;
        while(n!=1){
            count++;
            if(n%2==0){
                n/=2;
            }else{
                n=(n-1)/2;
            }
        }
        return count;
    }
}