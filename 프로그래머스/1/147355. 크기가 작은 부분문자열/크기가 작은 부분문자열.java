class Solution {
    public int solution(String t, String p) {
        int length=p.length();
        
        int result=0;
        for(int i=0; i<=t.length()-length; i++){
            if(t.substring(i,i+length).compareTo(p)<=0){
                result++;
            }
        }
        return result;
    }
}