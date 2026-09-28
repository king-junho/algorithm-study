class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int index=0;
        
        for(String s : strArr){
            if(index%2==0){
                answer[index]=s.toLowerCase();
            }else{
                answer[index]=s.toUpperCase();
            }
            index++;
        }
        return answer;
    }
}