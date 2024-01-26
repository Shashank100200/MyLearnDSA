//Get bit operator
public class BitManupulation {
    public static void main(String[] args){
        int num = 6;
        int pos = 1 << 2;

        if((pos & num)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
}

