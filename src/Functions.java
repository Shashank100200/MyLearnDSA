import java.util.*;
//public class Functions {
//    public static void funcall(){
//        System.out.println("Shashank"); // function defined
//        return;
//    }
//    public static void main(String[] args){
//        funcall();
//        funcall();
//        funcall(); //function called
//    }
//}

//public class Functions{
//    public static void myName(String name){
//        System.out.println("Hello " + name);
//        System.out.println("Bonjore " + name);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name :");
//        String myNam = sc.nextLine();
//
//        myName(myNam); //Fun call 1
//        myName(myNam +" How are you"); //Fun call 2
//    }
//}

//Sum using Function
public class Functions {
    public static int addTwoNum(int a,int b){
        int sum  = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value :");
        short a = sc.nextShort();
        System.out.println("Enter the b value :");
        short b = sc.nextShort();

        int add = addTwoNum(a,b); // Fun Call
        System.out.println("Sum of two numbers is :"+add);

    }
}

