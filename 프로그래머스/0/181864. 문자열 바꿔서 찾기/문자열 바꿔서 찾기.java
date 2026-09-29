class Solution {
    public int solution(String myString, String pat) {
        myString=myString.replaceAll("A","_").replaceAll("B","A").replaceAll("_","B");
        
        return myString.contains(pat)?1:0;
    }
}