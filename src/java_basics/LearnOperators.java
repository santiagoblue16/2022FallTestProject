package java_basics;

public class LearnOperators {

    /*
    1. Arithmetic Operators
    2. Assignment Operators
    3. Comparison Operators
    4. Logical Operators
     */

    public static void main(String[] args) {
        //Arithmetic
          //  System.out.println(5 + 4); //9
         //   System.out.println(5 - 4); //1
         //   System.out.println(5 * 4); //20
          //  System.out.println(4 / 5); //0.80
         //   System.out.println(12 % 9); //3 Modulous Operator. Gives us the remainder

            //Assignment Operators
            int x = 10; //the value of the right sign of the equal sign is being stored or assigned to the variable on the left
            //System.out.println(x); //10
            //int x = 20;
            //System.out.println(x); //20
            //int x = 30;
            //System.out.println(x); //30

            //Incremental
           // int x = 10;
           // x += 1; // x = x + 1 is the same as this
           // System.out.println(x); //11

           // x -= 1; // x = x - 1
            //System.out.println(x); //10

            //x *= 5; // x = x * 5
            //System.out.println(x); //50

            //x /= 5; // x = x / 5
           // System.out.println(x); //10

            //x %= 8; // x = x % 8
            //System.out.println(x); //2 (because that is the remainder)

            //Comparison Operators
            //int y = 5;
            //System.out.println(x == y); //"Is x the same as y" the answer is FALSE

            //int y = 10;
            //System.out.println(x == y);// Here the answer is TRUE because the values for x and y are the same
            //System.out.println(x != y); // ! is a logical 'not' . Not Equal
            //System.out.println(x > y); //EXCLUSIVE "find me even numbers between 1 and 100. last number would be 98
            //System.out.println(x >= y); //INCLUSIVE "Find me even numbers between 1 to 100. last number would be 100
            //System.out.println(x <= y); //x is less than OR equal to y. INCLUSIVE

            //Logical Operators
            int a = 10;
            int b = 35;
            int c = 75;
                        //logical And
            System.out.println(a < b && c > b); //both a < b and c > b have to be true to print a True
            System.out.println(a < b && c < b); //answer is FALSE because one of the statements is not true

                        //logical Or
            System.out.println(a > b || c > b); //one of the conditions is satisfied at least so it is true
           // System.out.println(a ! b); //exclamation point is a logical 'not'. a is not equal to b



    }
}
