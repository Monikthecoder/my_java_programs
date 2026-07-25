
import java.util.HashMap;
import java.util.HashSet;

class Pair {
    int user;
    int timeStamp;

    public Pair(int x , int y) {
            user = x;
            timeStamp = y;
    }

    int getFirst() {
        return user;
    }

    int getSecond() {
        return timeStamp;
    }

}

public  class  ActiveUser {
    public static void main(String[] args) {
        
        Pair[] logs  = new Pair[5];

        logs[0] = new Pair(0,5);
        logs[1] = new Pair(1,2);
        logs[2] = new Pair(0,2);
        logs[3] = new Pair(0,5);
        logs[4] = new Pair(1,3);

        HashMap<Integer,HashSet<Integer>>track = new HashMap<>();

        for(Pair log : logs) {
            int id = log.getFirst();
            int timestamp = log.getSecond();

            if(!track.containsKey(id)) {
                track.put(id,new HashSet<>());
            }
            track.get(id).add(timestamp);
        }

        int[] ans = new int[5];

        for(int id : track.keySet()) {
            int uam = track.get(id).size();
            ans[uam - 1]++;
        }

        for(int i=0;i<ans.length;i++) {
            System.out.println(ans[i]);
        }

    }
}