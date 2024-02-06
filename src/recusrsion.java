//public class recusrsion {
//    public static void printNum(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    public static void main(String[] args){
//        printNum(5);
//    }
//}

public class recusrsion {
    public static void printNum(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args){
        printNum(1);
    }
}
