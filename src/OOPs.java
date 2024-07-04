import java.util.*;
//In this block we will see initiating class , objects , methods and constructors till line 53

//class Pen{         //creating class
//    String color;  //properties of class or called as objects
//    String type;   //properties of class
//
//    public void write(){       //Method named write
//        System.out.println("Writing something");
//    }
//    public void printColor(){
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


// Implementation of Parameterised Constructor

//class Student{      //class
//    String name;    //properties
//    int srn;
//
//    public void printInfo(){            //method named printInfo
//        System.out.println(this.name);
//        System.out.println(this.srn);
//    }
//    Student(String name,int srn){       //Parameterised constructors
//        this.name = name;
//        this.srn = srn;
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Student obj = new Student("King Mike",38);      //implementing object for class Student
//
//        obj.printInfo();                //Calling printInfo method
//    }
//}

//In java there is no distructor as there is garbage collector in java it helps to delete the variables,objects which are not in use automatically
//Implementation of Copy Constructor

//class Student{      //class
//    String name;    //properties
//    int srn;
//
//    public void printInfo(){            //method named printInfo
//        System.out.println(this.name);
//        System.out.println(this.srn);
//    }
//    Student(Student s2){                //Parameterised constructors
//        this.name = s2.name;
//        this.srn = s2.srn;
//    }
//
//    Student(){                          //Default constructor
//
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Student obj1 = new Student();        //implementing object for class Student
//        obj1.name = "King";
//        obj1.srn = 12;
//
//        Student obj2 = new Student(obj1);   //here obj2(in which properties are not defined) copies the properties of obj1
//        obj1.printInfo();                   //Calling printInfo method by obj2
//    }
//}



//  Polymorphism -> Poly(many) Morphism(forms)
//  2 Types in Polymorphism -> 1)Function Overloading (Compile time polymorphism)  2)Function Overriding (Run time polymorphism)

//  Function Overloading -> Calling functions of same name with different parameters in same class
//class Student{      //class
//    String name;    //properties
//    int srn;
//
//    public void printInfo(String name){  //Function names printInfo
//        System.out.println(name);
//    }
//
//    public void printInfo(int srn){      //Function names printInfo with different parameters
//        System.out.println(srn);
//    }
//
//    public void printInfo(String name,int srn){
//        System.out.println(name+" "+srn);
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Lord Krishna";
//        s1.srn = 21;
//
//        s1.printInfo(s1.name);
//        s1.printInfo(s1.srn);
//        s1.printInfo(s1.name,s1.srn);
//    }
//}


//  Inheritance -> In which all the properties of one class can be copied to another class
//  4 types in it they are
//  Single Level Inheritance
//  Multi Level Inheritance
//  Hirarcle Inheritance
//  Hybrid Inheritance


//          This is Single Level Inheritance

//class Shape{
//    String color;
//
//    public void area(){
//        System.out.println("Displays Area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int l,int h){
//        System.out.println(0.5*l*h);
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//       Triangle t1 = new Triangle();
//       t1.color = "Blue";
//
//       t1.area(12,4);
//    }
//}


//          This is Multi Level Inheritance

//class Shape{
//    String color;
//
//    public void area(){
//        System.out.println("Displays Area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int l,int h){
//        System.out.println(0.5*l*h);
//    }
//}
//class EqiTriangle extends Triangle{
//    public void area(int l,int h){
//        System.out.println(0.5*l*h);
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        Triangle t1 = new Triangle();
//        t1.color = "Blue";
//
//        t1.area(12,4);
//    }
//}


//          This is Multi Level Inheritance

//class Shape{
//    String Color;
//
//    public void area(){
//        System.out.println("Displays Area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int l,int h) {
//        System.out.println(0.5*l*h);
//    }
//}
//class Rectangle extends Shape{
//    public void area(int l,int b){
//        System.out.println(l*b);
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        Rectangle obj1 = new Rectangle();
//
//        obj1.area(2,4);
//    }
//}


//          Packages in java -> How to import packages of different file to current class

//import bank.Bank;       //importing packages from pakage bank
//public class OOPs {
//    public static void main(String[] args) {
//        Bank acc1 = new Bank();
//        acc1.name="SBI";                    // Use 'name' from pakage bank
//
//        System.out.println("Bank name: " + acc1.name);  // Use getter method to get 'name'
//    }
//}


//      Encapsulation -> Combining data and its functions to one unit() for example combining class and its properties to another class
//      And also used to hide the sensitive datas from the users


//          Abstraction -> where it used to hide unwanted data from users
abstract class Animal{          //In this animal class where walk function is not relavent as animals are only considered such as horse or duck etc so we need this animal class to hide from user where we use abstract for it
    abstract void walk();
}
class horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}

class duck extends Animal{
    public void walk(){
        System.out.println("Walks on 2 Legs");
    }
}

public class OOPs {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
    }
}











