//public class recusrsion {
//    public static void printNum(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    public static void main(String[] args){
//        printNum(5);
//    }
//}

//public class recusrsion {
//    public static void printNum(int n){
//        if(n > 5){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }
//    public static void main(String[] args){
//        printNum(1);
//    }
//}

//public class recusrsion {
//    public static void printNum(int i,int n,int sum){
//        if(i == n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printNum(i+1,n,sum);
//    }
//    public static void main(String[] args){
//        printNum(1,5,0);
//    }
//}

//public class recusrsion {
//    public static void printNum(int n,int i,int fact){
//        if(i == n){
//            fact = fact*i;
//            System.out.println(fact);
//            return;
//        }
//        fact = fact*i;
//        printNum(n,i+1,fact);
//    }
//    public static void main(String[] args){
//        printNum(5,1,1);
//    }
//}

//public class recusrsion {
//    public static void printFib(int a,int b,int n){
//        if(n == 0){
//            return;
//        }
//       int c = a+b;
//       System.out.println(c);
//       printFib(b,c,n-1);
//    }
//    public static void main(String[] args){
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 8;
//        printFib(a,b,n-2);
//    }
//}

//public class recusrsion {
//    public static int calPow(int x,int n){
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//       int pownm1 = calPow(x,n-1);
//       int pown = x * pownm1;
//       return pown;
//    }
//    public static void main(String[] args){
//        int x = 2,n = 5;
//        int inp = calPow(x,n);
//        System.out.println(inp);
//    }
//}

//1. Write a Java program to calculate the factorial of a number using recursion.
//public class recusrsion{
//    static int fact(int n){
//        if(n ==  0){
//            return 1;
//        }
//        int parans = fact(n-1);
//        return parans * n;
//    }
//    public static void main(String[] args){
//       int ans = fact(5);
//       System.out.println(ans);
//    }
//}


//program to find sum of n number
//public class recusrsion {
//    static int sumOfn(int n){
//        if(n == 1){
//            return 1;
//        }
//        int sum = sumOfn(n-1);
//        return n + sum;
//    }
//
//    public static void main(String[] args) {
//        int ans = sumOfn(5);
//        System.out.println(ans);
//    }
//}

//Fibonacchi of a nth number
public class recusrsion {
    static int fib(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        int fibans1 = fib(n-1);
        int fibans2 = fib(n-2);
        return fibans1 + fibans2;
    }

    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
}






