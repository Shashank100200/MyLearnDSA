import java.util.*;
//Pyramid Pattern
//public class pyramidPatt {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        short n = sc.nextShort();
//        for(short i=1;i<=n;i++){
//            for(short j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Inverted pyramid
//public class pyramidPatt {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        short n = sc.nextShort();
//        for(short i=1;i<=n;i++){
//            for(short j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//reverse pyramid
public class pyramidPatt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        short n = sc.nextShort();
        //outer loop
        for(short i=1;i<=n;i++) {
            //Inner loop -> space print
            for (short j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //Inner loop -> star print
            for (short j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
