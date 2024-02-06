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

//public class recusrsion {
//    public static void printNum(int n){
//        if(n > 5){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }
//    public static void main(String[] args){
//        printNum(1);
//    }
//}

public class recusrsion {
    public static void printNum(int i,int n,int sum){
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printNum(i+1,n,sum);
    }
    public static void main(String[] args){
        printNum(1,5,0);
    }
}


