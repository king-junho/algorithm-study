class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int index=0;
        for(char c: my_string.toCharArray()){
            if(Character.isUpperCase(c)){
                index = c-'A';
            }else{
                index = (c-'a')+26;
            }

            answer[index]+=1;
        }

        
        return answer;
    }
}