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

//        Stephan, a vampire, wants to maximize his power before battling his brother Damon. Vampires gain power from human blood,
//        but Stephan wants to minimize the loss of human life while still being more powerful than Damon.
//        Given the power levels of human blood in a town,
//        determine the total max. power Stephan can gather before the battle
//
//        Input Format:
//        The second line contains a Integer Array with n elements, denoting the one-digit power in every blood.
//        Ex
//        :- { 0, 9, 3, 5, 1, 2)
//        Output Format:
//        Output a single integer representing the total miximum power Stephan will gather before the battle

//public class arrays {
//    public static void main(String[] args) {
//        int[] array = {0,9,3,5,1,2};
//        Arrays.sort(array);
//
//        int stephanPow = 0;
//        int demonPow = 0;
//        int i = array.length-1;
//        for(int a:array){
//            demonPow += a;
//        }
//        while(stephanPow < demonPow){
//            demonPow -= array[i];
//            stephanPow += array[i];
//            i--;
//        }
//        System.out.println("Stephan Power :"+stephanPow);
//        System.out.println("Demon Power :"+demonPow);
//    }
//}

//Solve the problem of finding the maximum element in an array.
//public class arrays {
//    public static void main(String[] args) {
//        int[] array = {1,2,4,85,3};
//        int max = 0;
//        for(int i=0;i< array.length;i++){
//            int curr = array[i];
//            if(curr > max){
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//Write a program to remove duplicate elements from an array.
//public class arrays {
//    public static void main(String[] args) {
//        int[] array = {1,2,2,3,4,3,5,1};
//
//        int count = 0;
//        for(int i=0;i< array.length;i++){
//            for(int j=0;j<array.length;j++){
//                if(i != j && array[i] == array[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}



































