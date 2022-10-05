package java_basics; //package is the 'drawer'
                    //orange colored text represents java keywords
public class LearnJava {

    /*
    2 things inside EVERY class
        1. Attributes/Variables
        2. Functions/Methods
     */
                        String name = "Sami"; //this is an example of a global variable because it is inside the class but outside of any method

                        public void printName() {
                            System.out.println(name); //the benefit of using the variable 'name' is that you would not have to change every instance of when the variable is used
                            System.out.println(name);
                            System.out.println(name);
                            System.out.println(name);
                            // System.out.println("Sami");      //this would be an example of NOT using a variable. Here, if the name "Sami" changes you would have to change each line to reflect this
                            // System.out.println("Sami");
                            // System.out.println("Sami");
                            // System.out.println("Sami");

                            //public void methodOne() {
                            }

                            public void methodTwo() {
                                String name = "Viktoryia"; //this is a local variable because it cannot be used in other Methods, it is inside the class but also specific method (methodTwo)
                            }


                            public void methodThree() { //these methods are
}
}                   //white text is neutral
                    //greyed-out text means that the class is not in use
                    //curly brackets means everything that is inside the class
                    //yellow highlighted text means Compile time warning
                    //red text means error
                    //yellow text means warning