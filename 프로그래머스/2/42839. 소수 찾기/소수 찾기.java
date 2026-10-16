import java.util.*;

class Solution {
    public int solution(String numbers) {
    char[] digits = numbers.toCharArray();
    boolean[] used = new boolean[digits.length];
    Set<Integer> candidates = new HashSet<>();

    generate(digits,used,0,candidates);

    int answer=0;

    for(int candidate:candidates){
      if(isPrime(candidate)){
        answer++;
      }
    }
    return answer;
  }

  private boolean isPrime(int candidate) {
    if(candidate < 2) return false;

    for(int divisor =2; divisor*divisor <= candidate; divisor++){
      if(candidate % divisor == 0) return false;

    }
    return true;
  }
  private void generate(char[] digits, boolean[] used, int current, Set<Integer> candidates) {
    for(int i=0; i<digits.length; i++){
      if(used[i]){
        continue;
      }
      used[i]=true;
      int next = current*10+(digits[i]-'0');
      candidates.add(next);

      generate(digits,used,next,candidates);

      used[i]=false;
    }
  }
}