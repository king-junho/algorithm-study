class Solution {
    public int[] solution(String[] wallpaper) {
        int lux=Integer.MAX_VALUE;
        int luy=Integer.MAX_VALUE;
        int rdx=Integer.MIN_VALUE;
        int rdy=Integer.MIN_VALUE;
        String row;
        
        for(int i=0;i<wallpaper.length;i++){
            row=wallpaper[i];
            if(row.contains("#")){
                lux=Math.min(lux,i);
                rdx=Math.max(rdx,i+1);
                luy=Math.min(luy,row.indexOf("#"));
                rdy=Math.max(rdy,row.lastIndexOf("#")+1);
            }
        }
        return new int[]{lux,luy,rdx,rdy};
    }
}