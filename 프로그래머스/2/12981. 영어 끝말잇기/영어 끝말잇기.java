import java.util.*;

class Solution {
    public int[] solution(int n, String[] words){
    /*
    1. 아이디어
    for문으로 0~word.length까지 반복
    List에 나왔던 단어들 넣고 만약 contains 나온 단어면 현재 {i%n, i/n+1} 반환

    2. 시간복잡도
    시간복잡도 : O(n)
    공간복잡도 : O(n)

    3. 자료구조
    나온 단어들을 담을 List : ArrayList
     */

    List<String> wordList = new ArrayList<>();

    for(int idx=0; idx<words.length; idx++){
      if(wordList.contains(words[idx])){
        return new int[]{idx%n+1, idx/n+1};
      }

      if(!wordList.isEmpty() && !words[idx].startsWith(wordList.getLast().substring(wordList.getLast().length()-1))){
        return new int[]{idx%n+1, idx/n+1};
      }

      wordList.add(words[idx]);
    }

    return new int[]{0,0};
  }
}