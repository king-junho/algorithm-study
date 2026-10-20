public class P021 {
  public int answer;

  private void backtrack(int[] numbers, int depth, int target, int sum) {
    if (depth == numbers.length) {
      if (target == sum) {
        answer++;
      }
      return;
    }
    sum += numbers[depth];
    backtrack(numbers, depth + 1, target, sum);
    sum -= numbers[depth];
    sum -= numbers[depth];
    backtrack(numbers, depth + 1, target, sum);
    sum += numbers[depth];
  }

  public int solution(int[] numbers, int target) {
    answer = 0;
    backtrack(numbers, 0, target, 0);
    return answer;
  }
}
