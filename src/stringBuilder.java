import java.util.*;
//public class stringBuilder {
//    public static void insert(){
//        StringBuilder sb = new StringBuilder("Reva");
//        sb.insert(0,'S');
//        System.out.println(sb);
//    }
//    public static void charAt(){
//        StringBuilder sb = new StringBuilder("Reva");
//        sb.setCharAt(0,'S');
//        System.out.println(sb);
//    }
//    public static void delete(){
//        StringBuilder sb = new StringBuilder("Reva");
//        sb.delete(2,3);
//        System.out.println(sb);
//    }
//    public static void append(){
//        StringBuilder sb = new StringBuilder("Reva");
//        sb.append(" ");
//        sb.append("U");
//        sb.append("niversity");
//        System.out.println(sb);
//        System.out.println(sb.length());
//    }
//    public static void main(String[] args){
//        insert();
//        charAt();
//        delete();
//        append();
//    }
//}

public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("shank");

        for(int i=0;i<=sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i; // 5(length)-1-0 --> 4

            char frontChar = sb.charAt(front);// it sets all the front character to front
            char backChar = sb.charAt(back);//sets back character(after middle of string) to back

            sb.setCharAt(front,backChar);//sets front index back character
            sb.setCharAt(back,frontChar);//sets back index front character
        }
        System.out.print(sb);
    }
}







