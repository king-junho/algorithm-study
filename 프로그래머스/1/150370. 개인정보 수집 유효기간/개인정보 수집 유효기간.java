import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        today = today.replace(".","");
        List<Integer> list = new ArrayList<>();

        //약관 종류 map에 저장
        for(String term : terms){
            String[] termSplit = term.split(" ");
            String type = termSplit[0];
            int value = Integer.parseInt(termSplit[1]);

            map.put(type,value);
        }


        int i=1;
        for(String privacy : privacies){
            String[] privacySplit = privacy.split(" ");
            String collectionDate = privacySplit[0];
            String type = privacySplit[1];

            String[] collectionDateSplit = collectionDate.split("\\.");
            int expirationYear = Integer.parseInt(collectionDateSplit[0]);
            int expirationMonth = Integer.parseInt(collectionDateSplit[1])-1;
            int expirationDay = Integer.parseInt(collectionDateSplit[2]);

            expirationMonth= expirationMonth + map.get(type);
            if(expirationMonth >= 12) {
                expirationYear += (expirationMonth/12);

            }
            expirationMonth = expirationMonth % 12 + 1;

            int expirationPeriod = Integer.parseInt(expirationYear+""+String.format("%02d",expirationMonth)+""+String.format("%02d",expirationDay));
            int todayPeriod = Integer.parseInt(today);

            if(expirationPeriod<=todayPeriod){
                list.add(i);
            }
            i++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}