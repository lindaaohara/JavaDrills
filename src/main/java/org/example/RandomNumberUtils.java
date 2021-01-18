package org.example;

import java.util.Random;

public class RandomNumberUtils {
    private  static final Random random;
    static {
        random = new Random();
    }

    public static  Double getRandomNumber(){
        return random.nextDouble();
    }
}
