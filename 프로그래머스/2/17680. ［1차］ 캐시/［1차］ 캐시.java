import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
    int answer = 0;
    List<String> cashList = new ArrayList<>();
    int index;

    if (cacheSize == 0){
      return cities.length*5;
    }

    for(String city : cities){
      city=city.toLowerCase();
      index = cashList.indexOf(city);

      if(index == -1){
        answer+=5;

        if(cashList.size()==cacheSize){
          cashList.removeFirst();
        }
        cashList.add(city);
      }
      else{
        answer++;
        cashList.remove(index);
        cashList.add(city);
      }
    }

    return answer;
  }
}