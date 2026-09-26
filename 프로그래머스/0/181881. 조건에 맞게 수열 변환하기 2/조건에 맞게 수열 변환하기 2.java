class Solution {
    public int solution(int[] arr) {
        int index=-1;
        boolean change;
        do{
            change=false;

            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] /= 2;
                    change=true;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i]=(arr[i]*2)+1;
                    change=true;
                }
            }
            index++;
        }while(change==true);
        return index;
    }
}