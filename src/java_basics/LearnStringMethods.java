package java_basics;

public class LearnStringMethods {

    static String student = "Humama"; //student is a variable inside of String.java (class) that we have access to

    public static void main(String[] args) {
        int length = student.length();
        System.out.println(length); // 6. This is the length of the String varible "Humama" which has 6 characters in her name

        int x = 5;

        System.out.println(x > student.length()); //length starts at 1! 123456
        //or

        String stu = student.toLowerCase(); // a different scenario of using different methods
        System.out.println(stu);

        System.out.println(student.toLowerCase());  //better way to do it
        System.out.println(student.toUpperCase());
        System.out.println(student.substring(3)); //answer is ama
        System.out.println(student.substring(3, 5)); //am, ama   // Index ALWAYS starts with 0!!!! 012345
        System.out.println(student.substring(3, 6)); //answer is ama because you are telling it to not include the 6th index
        //System.out.println(student.substring(3, 7)); //returns error Out of Bounds because there is no 7th index
        System.out.println(student.startsWith("h")); //prints false because Humama does not start with a lowercase h
        System.out.println(student.startsWith("H")); //True
        System.out.println(student.toLowerCase().startsWith("h")); //first method returns a string, therefore you can continue using string methods such as in this case. MUST BE THE SAME TYPE
        System.out.println(student.equals(student)); //would be true because Humama equals Humama
        // example of using ==

    }

}
