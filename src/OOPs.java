//In this block we will see initiating class , objects , methods and constructors till line 53

//class Pen{         //creating class
//    String color;  //properties of class
//    String type;   //properties of class
//
//    public void write(){       //Method named write
//        System.out.println("Writing something");
//    }
//    public void printColor(){;
//        System.out.println(this.color);    //this -> it is the keyword where it prints according which object is called
//    }
//}
//
//class Student{     //creating Student class
//    String name;    //properties of class
//    int srn;        //properties of class
//
//    public void printInfo(){                //Method named printInfo
//        System.out.println(this.name);
//        System.out.println(this.srn);
//    }
//    // Print the name and srn properties to the console
//    // Initially, these will be null and 0, respectively, because they have not been initialized yet
//    Student(){
//        System.out.println(this.name);      //this will be null
//        System.out.println(this.srn);       //this will be 0
//        System.out.println("Constructor called");
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Pen pen1 = new Pen();    //Create an object of the Pen class named pen1
//        pen1.color = "Black";
//        pen1.type = "Gel";
//
//        Pen pen2 = new Pen();    //Create an object of the Pen class named pen2
//        pen2.color = "Blue";
//        pen2.type = "Bal";
//
//        pen1.write();            //calling write method
//        pen1.printColor();
//        pen2.printColor();
//
//        Student obj = new Student();    //Create an object of the Student class named obj
//        obj.name = "King Mike";         // Set the name and srn properties of obj
//        obj.srn = 38;
//
//        obj.printInfo();                //calling printInfo method
//
//
//    }
//}


//

class Student{
    String name;
    int srn;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.srn);
    }
    Student(String name,int srn){
        this.name = name;
        this.srn = srn;
    }
}
public class OOPs {
    public static void main(String[] args) {
        Student obj = new Student("King Mike",38);

        obj.printInfo();
    }
}


