import java.util.Arrays;

public class P029 {
    public int[] solution(int[] numbers) {
        int startIdx = 0;
        int endIdx = 0;
        int left = 0;
        int right = numbers.length - 1;
        int sum;
        int value = Integer.MAX_VALUE;
        Arrays.sort(numbers);
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum == 0) {
                return new int[]{numbers[left], numbers[right]};
            }
            if (value > Math.abs(sum)) {
                value = Math.abs(sum);
                startIdx = left;
                endIdx = right;
            }
            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{numbers[startIdx], numbers[endIdx]};
    }
}
