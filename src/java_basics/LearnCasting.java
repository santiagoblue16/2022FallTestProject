package java_basics;

public class LearnCasting { //changing one data type to another
    public static void main(String[] args) {
        int myInt = 10;
        short myShort = 5;
        long myLong = 1023452L;
        float myFloat = 5.5f;
        double myDouble = 6.80544363245;
        String strNumber = "5";

        System.out.println((float) (myDouble));

        System.out.println(myInt + strNumber); //concatenation
        System.out.println(myFloat + strNumber);

        System.out.println(String.valueOf(myFloat));

        //Integer,Short, Long, float, have their own built-in classes
        //these are called wrapper classes

        //System.out.println(Float.parseFloat());
    }
}
