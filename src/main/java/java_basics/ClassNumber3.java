package java_basics;

import java.util.Scanner;

public class ClassNumber3 {
    public static void main(String[] args) {
        System.out.println("What is is your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name);
        System.out.println("Hello " + name);

        //in built java methods .toUpperCase and .toLowercase
        System.out.println("Hello " + name.toUpperCase());
        System.out.println("Hello " + name.toLowerCase());
    }
}
