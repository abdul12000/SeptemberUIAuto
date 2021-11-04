package java_basics;

import org.junit.jupiter.api.Test;

public class ClassNumber1 {
    //creating a main method
//    public static void main(String[] args) {

    @Test
    public void usingJUnitTest(){
        System.out.println("Hello World"); //This will printout "Hello world in the console.
        System.out.println("This is my first java programme");

        /*
        Keywords in Java: Keywords or Reserved words are the words in a language that are used for some internal process
        or represent some predefined actions. These words are therefore not allowed to use as variable names or objects.
                Doing this will result in a compile-time error. Eg, if,  try, static, double,  int, else, char, catch,
        interface, private, public, final, implements, extends, this, while etc
*/

//        int A = 5;
        int A;
        A=5;
        System.out.println("The value of A is : " + A);
        int B = 100;
        System.out.println("The value of B is : " + B);

        //Addition
        int C = A + B;

        System.out.println(C);

        //Subtraction
        int D = B - A;
        System.out.println("Subtraction of A from B:" + D);

        //multiplication
        int E = B*A;
        System.out.println("Multiplying A and B : " + E);

        //Division
        System.out.println("Dividing A by B :" + B/A);

        //Modulo or Remainder
        int F = B % A;
        System.out.println("The remainder of B % A is : " + F);

        int G = 100 % 11;
        System.out.println("The remainder of B % A is : + " + G);

        int L = 200 % 11;
        System.out.println("The remainder of B % A is : + " + L);

        int M = 50 % 11;
        System.out.println("The remainder of B % A is : + " + M);
    }
}
