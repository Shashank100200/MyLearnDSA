import java.util.*;

//      Same as HashSet it not contains duplicate values
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("India",122);
        map.put("Chaina",130);
        map.put("USA",32);
        map.put("UK",45);
        map.put("India",122);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Chaina"));

        //Searching in Map

        if(map.containsKey("India")){
            System.out.println("Contains");
        }else{
            System.out.println("Not contains");
        }

    }
}
