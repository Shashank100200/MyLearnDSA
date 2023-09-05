import java.util.*;
//public class pattPrint {
//    public static void main(String[] args){
//        for(byte i=1;i<=4;i++){
//            for(byte j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//Solid Square
public class pattPrint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value :");
        short m = sc.nextShort();
        System.out.println("Enter the n value :");
        short n = sc.nextShort();
        for(short i=1;i<=m;i++){
            for(short j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
