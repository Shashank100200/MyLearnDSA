import java.util.*;
//
//      Same as HashSet it not contains duplicate values
//public class hashMap {
//    public static void main(String[] args) {
//        HashMap<String,Integer> map = new HashMap<>();
//
//        map.put("India",122);
//        map.put("Chaina",130);
//        map.put("USA",32);
//        map.put("UK",45);
//        map.put("India",122);
//
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get("Chaina"));
//
//        //Searching in Map
//
//        if(map.containsKey("India")){
//            System.out.println("Contains");
//        }else{
//            System.out.println("Not contains");
//        }
//
//        //Iteration in HashMap
//        //for(int val : arr)  -> Same as this where Map.Entry<String,Integer> is data type and e is variable
//        for(Map.Entry<String,Integer> e : map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        for(String key : keys){
//            System.out.println(key +" "+map.get(key));
//        }
//    }
//}

//public class hashMap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1,2,3,1,4,3,2};
//        int max = 0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        int[] hash = new int[max+1];
//
//        for(int i=0;i<arr.length;i++){
//            hash[arr[i]] += 1;
//        }
//
//        int q = 3;
//        while(q-- != 0){
//            int num = sc.nextInt();
//
//            if(num <= max){
//                System.out.println(hash[num]);
//            }
//        }
//    }
//}

public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdabehf";

        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a'] += 1;
        }

        int q = 3;
        while(q-- > 0){
            char let;
            let = sc.next().charAt(0);

            System.out.println(hash[let - 'a']);
        }
    }
}


//public class hashMap {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 1, 2, 3, 4};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int key = arr[i];
//            // Fetch the current frequency, if the key exists, or default to 0
//            int freq = map.getOrDefault(key, 0);
//            // Increment frequency and update the map
//            map.put(key, freq + 1);
//        }
//
//        int q = sc.nextInt(); // Number of queries
//
//        while (q-- > 0) {
//            int num = sc.nextInt(); // Query number
//            // Fetch and print the frequency from the map, or 0 if not found
//            System.out.println(map.getOrDefault(num, 0));
//        }
//
//        sc.close(); // Close the scanner to avoid resource leaks
//    }
//}












