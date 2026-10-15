import java.util.*;
public class P002Check {
  static int count;
  static void check(int[] input, int[] expected) {
    int[] before = input.clone();
    int[] actual = new P002().solution(input);
    if (!Arrays.equals(actual, expected)) throw new AssertionError("Unexpected output");
    if (!Arrays.equals(input, before)) throw new AssertionError("Input modified");
    count++;
  }
  public static void main(String[] args) {
    check(new int[]{1,1,3,3,0,1,1}, new int[]{1,3,0,1});
    check(new int[]{4,4,4,3,3}, new int[]{4,3});
    check(new int[]{1,1,1,1}, new int[]{1});
    check(new int[]{1}, new int[]{1});
    check(new int[]{0}, new int[]{0});
    check(new int[]{0,0,9,9,0}, new int[]{0,9,0});
    check(new int[]{9,0,9,0}, new int[]{9,0,9,0});
    int[] same = new int[1_000_000];
    check(same, new int[]{0});
    int[] alternating = new int[1_000_000];
    for(int i=0;i<alternating.length;i++) alternating[i]=i%2;
    check(alternating, alternating);
    Random random = new Random(12906);
    for(int trial=0;trial<1000;trial++) {
      int[] input=new int[1+random.nextInt(1000)];
      for(int i=0;i<input.length;i++) input[i]=random.nextInt(10);
      int[] expected=new int[input.length]; int k=0;
      for(int i=0;i<input.length;i++) if(i==0 || input[i]!=input[i-1]) expected[k++]=input[i];
      check(input,Arrays.copyOf(expected,k));
    }
    System.out.println("PASS: "+count+" cases; includes two length-1,000,000 cases and 1,000 seeded random cases");
  }
}
