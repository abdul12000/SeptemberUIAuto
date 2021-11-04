package java_basics;

public class ClassNumber9 {

        enum PhoneType{
            SAMSUNG,
            IPHONE,
            HTC,
            NOKIA,
            MOTOROLA,
            LG;
        }
        public static void main(String[] args) {
            System.out.println(PhoneType.HTC);   //This will printout “IPHONE”
            System.out.println(PhoneType.IPHONE);
            System.out.println(PhoneType.SAMSUNG);
            System.out.println("------------------------------------------------------------");


            PhoneType phoneType = PhoneType.MOTOROLA;
            switch(phoneType){
                case IPHONE:
                    System.out.println("This is the best");
                    break;
                case NOKIA:
                    System.out.println("This is the old school");
                    break;
                case MOTOROLA:
                    System.out.println("This is the outdated");
                    break;
                case SAMSUNG:
                    System.out.println("This is the trending");
                    break;
                default:
                    System.out.println("select a phone");
            }
        }

    }
