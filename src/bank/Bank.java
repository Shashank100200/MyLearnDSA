package bank;

class Account{
    int empId;      //Default parameter
    protected String email;

    private String name;    //Can only accessed within the class

    //private class can be accessed by another class by using getter and setter method

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
public class Bank {
    public String name;        //Public parameter

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.empId = 12;
        acc1.email = "revabank@gmail.com";

        acc1.setName("Reva");                   //By using setName func we set the name of private variable
        System.out.println(acc1.getName());     //And by accecing get we print the name of it
    }
}

