package java_basics;

public class ClassNumber2 {
    public  Integer additionMethod(int a, int b){
        return (a+b);
    }

    public  Integer subtractionMethod(int a, int b){
        return (a-b);
    }
    public  Integer multiplicationMethod(int a, int b){
        return (a*b);
    }
    public  Integer divisionMethod(int a, int b){
        return (a/b);
    }
    public  Integer moduloMethod(int a, int b){
        return (a%b);
    }

    public static void main(String[] args) {
        ClassNumber2 classNumber2 = new ClassNumber2();
        System.out.println(classNumber2.additionMethod(10, 10));

        System.out.println(classNumber2.subtractionMethod(300, 80));

        System.out.println(classNumber2.divisionMethod(40,2));
    }
}
