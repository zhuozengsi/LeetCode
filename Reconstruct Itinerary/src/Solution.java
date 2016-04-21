import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuozengsi on 4/19/16.
 */
public class Solution {

    private List mList = new ArrayList<>();
    public List<String> findItinerary(String[][] tickets) {


        return mList;
    }

    private String findBestArrival(String[][] tickets, String departure){
        String arrival = "a";
        for(int i = 0; i < tickets.length; i ++){

            if(tickets[i][0].equals(departure)){
                if(tickets[i][1].compareTo(arrival) < 0) {
                    arrival = tickets[i][1];
                }
            }

            if(mList.contains(departure)){

            }
        }
        return arrival;
    }

}
