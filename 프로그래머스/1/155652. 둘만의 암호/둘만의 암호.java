import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 1);

        for(int i=0; i<skip.length(); i++){
            alphabet[skip.charAt(i)-'a']--;
        }

        for(int i=0; i<s.length(); i++){
            sb.append(changeAlphabet(alphabet,s.charAt(i),index));
        }
        return sb.toString();
    }

    public char changeAlphabet(int[] alphabet, char ch, int index){
        int n =0;
        int i=1;

        while(n!=index){
            n+=alphabet[((ch-'a'+i)%26)];
            i=(i+1)%26;
        }
        return (char)(((ch-'a'+i-1)%26)+'a');
    }
}