package java_basics;

public class Task1Solution {

//    1.	Write a java program to take 2 integers (int A and int B) where A =300 and B = 450.
//    Then evaluate the values of A and B, and printout value of A if A is greater than B.
//    Otherwise printout value of B.

    public static void main(String[] args) {
        int A = 300;
        int B = 450;
        if(A>B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }

        //        2.	Write a java program that can print out all even numbers between 1 and 11

        for(int i = 1; i<=11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
// Odd Numbers 1, 3, 5, 7, 9
            for (int j = 1; j <= 11; j++) {
                if (j % 2 != 0) {
                    System.out.println(j);
                }

            }

        }
    }

}
