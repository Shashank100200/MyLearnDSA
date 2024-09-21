//In this block we will see initiating class , objects , methods and constructors till line 53

//class Pen{         //creating class -> it is templete of an object
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
//    protected int srn;        //properties of class
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
////        System.out.println(name);
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
////        System.out.println(srn);
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
//        obj2.printInfo();                   //Calling printInfo method by obj2
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
//
//        s1.printInfo(28);
//        s1.printInfo("Lord Rama");
//    }
//}


//  Inheritance -> In which all the properties of one class can be copied to another class
//  5 types in it they are
//  Single Level Inheritance
//  Multi Level Inheritance
//  Hirarcle Inheritance
//  Hybrid Inheritance
//  Muliple Inheritance -> can only achived by interface in java


//          This is Single Level Inheritance
//class Shape{
//    String color;                   //color is the properties of class Shape
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
//public class OOPs {
//    public static void main(String[] args) {
//       Triangle t1 = new Triangle();
//       t1.color = "Blue";           //Color property is extended to class Triangle
//
////        Shape obj = new Triangle();            --> Not Possible
////        obj.area(4,5);
//
//       System.out.println(t1.color);
//       t1.area();
//       t1.area(12,4);
//    }
//}


//          This is Multi Level Inheritance

//class Shape{
//    String color = "Black";    //field name
//
//    public void area(){
//        System.out.println("Displays Area");
//    }
//}
//class Triangle extends Shape{
//    public void area(int l,int h){
//        System.out.println(0.5*l*h);
//        System.out.println("Tri Class");
//    }
//}
//class EqiTriangle extends Triangle{
//    String color = "Green";
//    public void area(int l,int h){
//        System.out.println(0.5*l*h);
//        System.out.println("Eqi class");
//    }
//}
//
////    In Java, fields are not polymorphic. This means that when you access a field, the field value is determined solely by the reference type, not the object type.
//
////    Even though the reference t1 is of type Triangle, the object is an instance of EqiTriangle.
////        When calling t1.area(12, 4), Java looks for the method implementation in the actual object type (EqiTriangle), so it invokes the area method from EqiTriangle.
//public class OOPs {
//    public static void main(String[] args) {
//        Triangle t1 = new EqiTriangle();
//        Triangle t2 =  new Triangle();
//
//        System.out.println(t2.color);
//        t2.area(6,6);                     //-- > here the area method will print from class Triangle but color will be black
////        t1.color = "Blue";
//        System.out.println(t1.color);    // --> here the area method will print from class EquiTriangle because it Overrides the method from class triangle
//        t1.area(12,4);
//    }
//}


//          This is Hirerarcle Inheritance

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
//        Triangle obj1 = new Triangle();
////        Triangle obj = new Shape();           --> It is not possible in java as Super class cannot be used as reference in creating object
//        obj1.Color = "Black";
//        obj1.area(2,4);
//        System.out.println(obj1.Color);
//    }
//}



//              Hierarcle Inheritance

//class Shape{
//    String color;                   //color is the properties of class Shape
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
//class Circle extends Shape{
//    Circle(){
//        System.out.println("2*pai*r");
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//
//        c1.area();
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
//abstract class Animal{          //In this animal class where walk function is not relavent as animals are only considered such as horse or duck etc so we need this animal class to hide from user where we use abstract for it
//    String color;
//    abstract void walk();
//    public void eats(){
//        System.out.println("Animal eats");
//    }
//}
//class horse extends Animal{
//    public void walk(){
//        System.out.println("Walks on 4 Legs");
//    }
//}
//
//class Duck extends Animal{
//    public void walk(){
//        System.out.println("Walks on 2 Legs");
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        horse h1 = new horse();
//        h1.walk();
//        h1.color = "Brown";
//        System.out.println(h1.color);
//        // As animal class is abstract class its cannot be instansiated
//        h1.eats();
//    }
//}


//          Constructer Chaining
//abstract class Animal{
//    abstract void walk();
//    Animal(){                       //Constructor of base class will be called first
//        System.out.println("Animal Created");
//    }
//}
//class horse extends Animal{
//
//    horse(){                        //Constructor of derived class will be called later
//        System.out.println("Animal is horse");
//    }
//    public void walk(){
//        System.out.println("Walks on 4 Legs");
//    }
//}
//
//class duck extends Animal{
//    public void walk(){
//        System.out.println("Walks on 2 Legs");
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        horse h1 = new horse();
//    }
//}


//              Interface -> It is an abstract type and also achived Multiple inheritance in java
//interface Animal{               //interface is an abstract type
//    public void walk();
//}
//
//interface Herbivor{
//
//}
//
//class Horse implements Animal,Herbivor{         //Multiple inheritance
//    public void walk(){
//        System.out.println("Walks on 4 legs");
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        Horse h1 = new Horse();
//        h1.walk();
//    }
//}


//              Static keyword
//class Student{
//    String name;
//    static String school;           //static is the keyword because where school is common for all students
//
//}
//public class OOPs {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student.school = "PPEC";
//        Student.school = "Reva";
//        s1.school = "MCE";
//        s1.name = "Ram";
//
//        System.out.println(s1.school);
//        System.out.println(s1.name);
//        System.out.println(Student.school);
//    }
//}


//class Shape{
//    String Color;
//
//    private void area(){
//        System.out.println("Displays Area");
//    }
//}
//class Triangle extends Shape{
//    protected void area() {
//        System.out.println("Triangle Shape");
//    }
//}
//class Rectangle extends Triangle{
//    public void area(){
//        System.out.println("Rectangle Shape");
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args) {
//        Triangle obj = new Rectangle();
//        obj.area();
//    }
//}

class Shape{
    String Color;

    private void area(){
        System.out.println("Displays Area");
    }
}
final class Triangle extends Shape{                      // Here the final key word let not any other class to inherit
    protected void area() {
        System.out.println("Triangle Shape");
    }
}

public class OOPs {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
    }
}










