class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int i,j;

        for(int[] query : queries) {
            i=query[0];
            j=query[1];
            swap(arr,i,j);
        }
        
        return arr;
    }
    
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}