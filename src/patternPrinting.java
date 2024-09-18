import java.util.*;

//                                                *
//                                                **
//                                                ***
//                                                ****
//                                                *****
//public class patternPrinting {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//                                                        *****
//                                                        ****
//                                                        ***
//                                                        **
//                                                        *


//public class patternPrinting {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=i;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//OR

//public class patternPrinting {
//    public static void main(String[] args) {
//        for(int i=5;i>=0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//                                                             *
//                                                            **
//                                                           ***
//                                                          ****
//                                                         *****

public class patternPrinting {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


















