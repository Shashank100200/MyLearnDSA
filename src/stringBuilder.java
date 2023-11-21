import java.util.*;
public class stringBuilder {
    public static void insert(){
        StringBuilder sb = new StringBuilder("Reva");
        sb.insert(0,'S');
        System.out.println(sb);
    }
    public static void charAt(){
        StringBuilder sb = new StringBuilder("Reva");
        sb.setCharAt(0,'S');
        System.out.println(sb);
    }
    public static void delete(){
        StringBuilder sb = new StringBuilder("Reva");
        sb.delete(2,3);
        System.out.println(sb);
    }
    public static void append(){
        StringBuilder sb = new StringBuilder("Reva");
        sb.append(" ");
        sb.append("U");
        sb.append("niversity");
        System.out.println(sb);
        System.out.println(sb.length());
    }
    public static void main(String[] args){
        insert();
        charAt();
        delete();
        append();
    }
}







