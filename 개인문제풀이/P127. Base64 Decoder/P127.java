import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        StringBuilder result = new StringBuilder();

        for (int test_case = 1; test_case <= t; test_case++) {
            System.out.print("#" + test_case + " ");
            result = new StringBuilder();
            String line = sc.next();

            for (int i = 0; i < line.length(); i += 4) {
                String input = line.substring(i, i + 4);
                String totalBits = "";

                for (int j = 0; j < input.length(); j++) {
                    String bits = Integer.toBinaryString(base64.indexOf(input.charAt(j)));
                    bits = String.format("%6s", bits).replace(' ', '0');
                    totalBits += bits;
                }

                for (int j = 0; j < totalBits.length(); j += 8) {
                    int value = Integer.parseInt(totalBits.substring(j, j + 8), 2);
                    char letter = (char) value;
                    System.out.print(letter);
                }
            }
            System.out.println();
        }
    }
}
