import java.util.HashSet;

public class P023 {
  public int[] solution(int n, String[] words) {
    HashSet<String> wordSet = new HashSet<>();
    wordSet.add(words[0]);
    for (int idx = 1; idx < words.length; idx++) {
      if (wordSet.contains(words[idx])) {
        return new int[]{idx % n + 1, idx / n + 1};
      }
      String previous = words[idx - 1];
      char last = previous.charAt(previous.length() - 1);
      char first = words[idx].charAt(0);
      if (last != first) {
        return new int[]{idx % n + 1, idx / n + 1};
      }
      wordSet.add(words[idx]);
    }
    return new int[]{0, 0};
  }
}
