import java.util.*;

class Solution {
    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        switch(strArr[1]){
            case "+":
                return Integer.valueOf(strArr[0])+Integer.valueOf(strArr[2]);
            case "-":
                return Integer.valueOf(strArr[0])-Integer.valueOf(strArr[2]);
            case "*":
                return Integer.valueOf(strArr[0])*Integer.valueOf(strArr[2]);    
        }
        return 0;
    }
}