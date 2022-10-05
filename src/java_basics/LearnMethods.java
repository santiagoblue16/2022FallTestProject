package java_basics;

public class LearnMethods {

    /*
    Types of Methods
        1. Action
        2. Action + Return
     */

    //public static void main(String[] args) {
        //System.out.println(addition(5, 50)); //this is called a method call. Method name is given
    //    int x = addition(5, 50);
     //   System.out.println(x);
    //}

    //public static int addition(int a, int b) {
     //   return a + b;
    //}
    public static void main(String[] args) { //type 'main' for shortcut
        System.out.println(doAddition(5, 10));//doAddition(); //anything with paranthesis after is a method
        System.out.println(doMultiplicationThenAddition(10, 20)); //int x = 50 + doAddition();
        //System.out.println(x);
    }                   //this expression equals to 600
    //public static void doAddition() {
    public static int doAddition() {
        //protected static void doAddition() {
        //private static void doAddition() {
        int x = 5;
        int y = 10;

        // return 5; //cannot return a value as long as return type is still void

        //System.out.println(a + b);
        return x + y; //now we can return a statement because we told the method that it has to return an int YOU HAVE TO
    }
    //or

    //static int doAddition(int x, int y) { //same way to write the above
        //return x + y
    //}
    //naming convention for a method is camelCase
    //void doSubtraction(){
    static boolean isLarger(){ //naming makes sense to the reader
        int x = 5;
        int y = 6;

        return x > y;
    }

    static int doAnotherAddition() {
        int x = 500;
        int y = 600;

        return x;
    }

    static int doAnotherAnotherAddition() {
        int x = 500;
        int y = 600;

        return y;

    }

    static int doAddition(int chair, int flower) {
        System.out.println(chair);
        System.out.println(flower);

        return chair + flower;
    }

    static int doMultiplicationThenAddition(int num1, int num2) {
        return doMultiplication(num1, num2) + num1 + num2; //nested method. calling a method within another method
    }
    static int doMultiplication(int num1, int num2) {
        return num1 * num2;
    }
}

//This is a single line comment

/*
Type anything inside for multilength comments
 */

/**
 * This is a doc-string. It helps devs understand what a function or method does.
 * It provides documentation that is easily viewable when hovering over a method invocation
 * @param a The first parameter
 * @param b The second parameter
 */

//CTRL + / while text is highlighted will comment out everything that is highlighted
//hold CTRL and hover over text to see more information on everything