import java.util.*;
//for loop
//public class loops{
//    public static void main(String[] args){
//        for(byte i =0;i<=10;i++){
//            System.out.println("Reva University");
//        }
//    }
//}

public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n = sc.nextInt();
        int sum = 0;
        for(short i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

