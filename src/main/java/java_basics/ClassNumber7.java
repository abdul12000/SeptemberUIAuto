package java_basics;

public class ClassNumber7 {
    public static void main(String[] args) {
        //while loop
        //print out numbers from 1 to 10
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }


        //do while loop
        //print out numbers from 21 to 30
        int p = 21;
        do {
            System.out.println("Value of p is : "+p);
            ++p;
        }
        while(p<=30);

        //Using decrement
        //print out numbers from 50 to 40 in descending order
        int k = 50;
        while (k>39){
            System.out.println("the value of k "+ k);
            --k;
        }

    }
}
