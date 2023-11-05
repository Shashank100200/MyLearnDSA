import java.util.*;
//public class twoDarray {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int[][] array = new int[row][col];
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                array[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.println(array[i][j] + " ");
//            }
//        }
//    }
//}

public class twoDarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m value :");
        int m = sc.nextInt();
        System.out.println("Enter n value :");
        int n = sc.nextInt();

        int[][] array = new int[m][n];

        System.out.println("Enter the Values :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the search value :");
        int s = sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;i<n;i++){
                if(array[i][j] == s){
                    System.out.println(i + ","+ j);
                }
            }
        }
    }
}
