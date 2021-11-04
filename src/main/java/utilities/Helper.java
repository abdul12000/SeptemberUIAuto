package utilities;

import java.util.Random;

public class Helper {
    public static int generate5RandonNumbers(){
        Random random = new Random();
        return random.nextInt(99999);
    }
}
