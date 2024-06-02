/*import java.util.Scanner;*/

public class methods {
    static void myMethod() {
        System.out.println("I just got executed");
    }
    static void newMethod(String name){
        System.out.println("My name is " + name);
    }

    static void thisMethod(String name, int age) {
        System.out.println(name + " and age is " + age);
    }

    static void ageCheck(int year){
        if (year<=18){
            System.out.println("He is below 18");

        }else{
            System.out.println("He is above 18");
        }
    }
    public static void main(String[] args){
       myMethod();
       myMethod();
       newMethod("Uday");
       newMethod("Hero");
       thisMethod("Kailash",24);
/*
       Scanner myObj = new Scanner(System.in);
       System.out.println("Enter the age :");

       int a = myObj.nextLine();*/
       ageCheck(23);

    }
}
