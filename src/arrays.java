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

//user input[size] using array
//public class arrays{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array :");
//        int size = sc.nextInt();
//        int marks[] = new int[size];
//        for(int i=0;i<size;i++){
//            System.out.println(marks[i]);
//        }
//    }
//}

//user input using array
//public class arrays{
//    public static void userprint(int[] marks,int size){
//        System.out.println("Printing the array values :");
//        for(int i=0;i<size;i++){
//            System.out.println(marks[i]);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array :");
//        int size = sc.nextInt();
//
//        //creating array
//        int marks[] = new int[size];
//
//        //getting values
//        System.out.println("Enter value :");
//        for(int i=0;i<size;i++){
//            marks[i] = sc.nextInt();
//        }
//        userprint(marks,size );
//    }
//}

//linear search
//public class arrays{
//    public static void userprint(){
//
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size :");
//        int size = sc.nextInt();
//
//        //Array declair
//        int array[] = new int[size];
//
//        //Storing values in array
//        System.out.println("Enter the values :");
//        for(int i=0;i<size;i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        for(int i=0;i<array.length;i++){
//            if(num == array[i]){
//                System.out.println("Index of the number :" +i);
//            }
//        }
//        userprint();
//    }
//}

//Arrays
public class arrays {
    public static void stringarr(String[] names){
        System.out.println("Entered names are :");
        for(int i=0;i<3;i++){
            System.out.println(names[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String names[] = new String[3];

        System.out.println("Enter the names :");
        for(int i=0;i<3;i++){
            names[i] = sc.next();
        }
        stringarr(names);
    }
}

