import java.util.*;
//                                   Strings are immutable --> they cannot modify once they are into memory
//public class string {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = "Tony Stark";
//
//        for(int i=0;i<name.length();i++){
//            System.out.println(name.charAt(i));
//        }
//    }
//}

//using compare to function

//public class string{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name1 = "Tony Stark";
//        String name2 = "Tony Stark";
//
//        //s1 > s2 --> +ve
//        //s1 == s2 --> 0
//        //s1 < s2 --> -ve
//
//        if(name1.compareTo(name2) == 0){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }
//
//        if(new String("Tomy") == new String("Tomy")){
//            System.out.println("Strings are equal");                // here it shows not equal because-> In java even though the content are same but the objects store in two different memory they will be having different memory address therefore they state different
//        }else{
//            System.out.println("Strings are not equal");
//        }
//
//        if(new String("Tomy").equals(new String("Tomy"))){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }
//    }
//}

//          String indexing
//public class string {
//    public static void main(String[] args){
//        String name = "Pavitra Prabakar";
//        String n = name.substring(0,name.length());
//        System.out.println(n);
//        String l = name.substring(8);
//        System.out.println(l);  //gives entire index till end without mentioning the ending index
//        String m = name.substring(2,9);
//        System.out.println(m);   //prints till 2 to 8
//    }
//}

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
//public class string {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size :");
//        int size = sc.nextInt();
//
//        String[] array = new String[size];
//
//        int len = 0;
//        System.out.println("Enter the names :");
//        for(int i=0;i<size;i++){
//            array[i] = sc.next();
//            len += array[i].length();
//        }
//        System.out.println(len);
//    }
//}

//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//        Example :
//        original = “eabcdef’ ; result = “iabcdif”
//        Original = “xyz” ; result = “xyz”

//public class string {
//    public static void main(String[] args) {
//        String s = "abcedefghi";
//        StringBuilder sb = new StringBuilder(s);
//        String result = "";
//        for(int i=0;i<sb.length();i++){
//            if(sb.charAt(i) != 'e'){
//                result = result + sb.charAt(i);
//            }
//            if(sb.charAt(i) == 'e'){
//                sb.setCharAt(i,'i');
//                result = result+'i';
//            }
//        }
//        System.out.println(result);
//    }
//}

//          Same Same But Diffelent

//public class string {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String name = sc.next();
//        String result = "";
//
//        for(int i=0;i<name.length();i++){
//            if(name.charAt(i) == 'e'){
//                result = result + 'i';
//            }else{
//                result += name.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}


//input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//        Example :
//        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//        email = “helloWorld123@gmail.com”; username = “helloWorld123”

//public class string {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the email :");
//        String mail = sc.next();
//        String result = "";
//
//        for(int i=0;i<mail.length();i++){
//            if(mail.charAt(i) == '@'){
//                break;
//            }else{
//                result += mail.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//}

//public class string {
//    public static void main(String[] args) {
//        String sentence = "WORLD WIDE WEB";
//        int result = findStringCode(sentence);
//        System.out.println(result);  // Output: 402326
//    }
//
//    public static int letterPosition(char letter) {
//        return Character.toUpperCase(letter) - 'A' + 1;
//    }
//
//    public static int findStringCode(String sentence) {
//        String[] words = sentence.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (String word : words) {
//            int wordSum = 0;
//            int length = word.length();
//            for (int i = 0; i < (length + 1) / 2; i++) {
//                char startLetter = word.charAt(i);
//                char endLetter = word.charAt(length - 1 - i);
//                wordSum += Math.abs(letterPosition(startLetter) - letterPosition(endLetter));
//            }
//            result.append(wordSum);
//        }
//
//        return Integer.parseInt(result.toString());
//    }
//}

//public class string {
//    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//
//        s = s.replaceAll("[^a-zA-Z0-9]", " ");
//        s = s.replaceAll("\\s","");
//        s = s.toLowerCase();
//
//        System.out.println(s);
//    }
//}

public class string {
    public static void main(String[] args) {
        int num = 36;
        double sqrt = Math.sqrt(num);
        double prd = sqrt*sqrt;

        if(prd == num){
            System.out.println("T");
        }else{
            System.out.println("F");
        }
    }
}

