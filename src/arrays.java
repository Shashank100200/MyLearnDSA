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

//Arrays using string
//public class arrays {
//    public static void stringarr(String[] names){
//        System.out.println("Entered names are :");
//        for(int i=0;i<3;i++){
//            System.out.println(names[i]);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String names[] = new String[3];
//
//        System.out.println("Enter the names :");
//        for(int i=0;i<3;i++){
//            names[i] = sc.next();
//        }
//        stringarr(names);
//    }
//}

//Finding max and min using array
//public class arrays {
//    public static void minmax(int max,int min){
//        System.out.println("The max number is :"+max);
//        System.out.println("The min number is :"+min);
//    }
//    public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     //Input size
//     System.out.println("Enter the size :");
//     int size = sc.nextInt();
//
//     int array[] = new int[size];
//
//     //input values
//     System.out.println("Enter the values :");
//     for(int i=0;i<array.length;i++){
//         array[i] = sc.nextInt();
//     }
//        int max = Integer.MIN_VALUE; // for max we used MIN integer value
//        int min = Integer.MAX_VALUE;// here we used MAX integer value
//
//     for(int i=0;i<array.length;i++){
//         if(array[i] > max){
//             max = array[i];
//         }
//         if(array[i] < min){
//             min = array[i];
//         }
//     }
//     minmax(min,max);
//    }
//}

//Take an array of numbers as input and check if it is an array sorted in ascending order.
//public class arrays {
//    public static void ascending(){
//
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size :");
//        short size = sc.nextShort();
//
//        //array declairation
//        int array[] = new int[size];
//
//        //input
//        System.out.println("Enter the values :");
//        for(int i=0;i<size;i++){
//            array[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i=0;i<size-1;i++){
//            if(array[i] < array[i+1]){
//                sum++;
//            }
//        }if(sum == size-1){
//            System.out.println("sorted");
//        }else{
//            System.out.println("NS");
//        }
//        ascending();
//    }
//}

//Delition of an element in array
//import java.util.Scanner;
//
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int size = sc.nextInt();
//        int[] array = new int[size];
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the location to delete:");
//        int loc = sc.nextInt();
//
//        // Validate the location
//        if (loc >= 0 && loc < size) {
//            // Shift elements to the left to remove the element at the specified location
//            for (int i = loc; i < size - 1; i++) {
//                array[i] = array[i - 1];
//            }
//            size--; // Decrease the size of the array
//
//            // Print the updated array
//            System.out.println("Array after deletion:");
//            for (int i = 0; i < size; i++) {
//                System.out.print(array[i] + " ");
//            }
//        } else {
//            System.out.println("Invalid location. Please enter a valid location within the array size.");
//        }
//    }
//}































