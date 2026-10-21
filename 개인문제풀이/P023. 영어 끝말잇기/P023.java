import java.util.ArrayList;
import java.util.List;

public class P023 {
  public int[] solution(int n, String[] words) {
    List<String> wordList = new ArrayList<>();
    for (int idx = 0; idx < words.length; idx++) {
      if (wordList.contains(words[idx])) {
        return new int[]{idx % n + 1, idx / n + 1};
      }
      if (!wordList.isEmpty() && !words[idx].startsWith(
          wordList.getLast().substring(wordList.getLast().length() - 1))) {
        return new int[]{idx % n + 1, idx / n + 1};
      }
      wordList.add(words[idx]);
    }
    return new int[]{0, 0};
  }
}
