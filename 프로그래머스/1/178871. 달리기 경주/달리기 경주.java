import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            rank.put(players[i],i);
        }
        
        for(String calling : callings){
            int index = rank.get(calling);
            String front = players[index-1];
            
            players[index-1]=calling;
            players[index]=front;
            
            rank.put(calling,index-1);
            rank.put(front,index);
        }
        return players;
    }
}