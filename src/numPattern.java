import java.util.*;
//public class numPattern {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        short n = sc.nextShort();
//        for(short i=1;i<=n;i++){
//            for(short j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//inverted Pyramid
//public class numPattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        short n = sc.nextShort();
//        In this pyramid number starts from 1-n
//        for (short i=n; i>=1; i--) {
//            for (short j=1; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

public class numPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        short n = sc.nextShort();
        for (short i=1; i<=n; i++) {
            //it starts number from n-1
            for (short j=n; j>=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



