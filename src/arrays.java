import java.util.*;
//public class arrays {
//    public static void printarr(){
////        int[] marks = new int[3];
////        marks[0] = 35;
////        marks[1] = 38;
////        marks[2] = 40;
//        int marks[] = {35,38,40};
//        for(int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }
//    }
//    public static void main(String[] args){
//        printarr();
//    }
//}

//user input using array
public class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
