package java_basics;

public class ClassNumber8 {
    //Arrays
    public static void main(String[] args) {
        String[] languages = {"English", "French", "Spanish", "Russian"};
        System.out.println(languages.length);
        System.out.println(languages[0]);
        System.out.println(languages[1]);
        System.out.println(languages[3]);

        String daysOfTheWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.print(daysOfTheWeek[1] + " ");
        System.out.print(daysOfTheWeek[2] + ", ");
        System.out.println(daysOfTheWeek[3]);
        System.out.println("______________________________________________");
        for (String i: daysOfTheWeek){
            System.out.println(i);

        }

        System.out.println("*************************************************");
        for(int p =1; p<4; p++){
            System.out.println(daysOfTheWeek[p]);
        }

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //int arrays:
        int[] numArrays = {1, 3, 5, 7, 7,7, 9, 11};
        System.out.println(numArrays.length);
        System.out.println(numArrays[3]);
    }
}
