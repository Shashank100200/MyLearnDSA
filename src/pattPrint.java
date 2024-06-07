import java.util.*;
//public class pattPrint {
//    public static void main(String[] args){
//        for(byte i=1;i<=4;i++){
//            for(byte j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Solid Square
//public class pattPrint{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the m value :");
//        short m = sc.nextShort();
//        System.out.println("Enter the n value :");
//        short n = sc.nextShort();
//        for(short i=1;i<=m;i++){
//            for(short j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Borded Square
//public class pattPrint {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the m value :");
//        short m = sc.nextShort();
//        System.out.println("Enter the n value :");
//        short n = sc.nextShort();
//        for (short i = 1; i <= m; i++) {
//            for (short j = 1; j <= n; j++) {
//                if (i == 1 || j == 1 || i == m || j == n) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//reverse triangle
//public class pattPrint {
//    public static void main(String[] args){
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

public class pattPrint {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}







