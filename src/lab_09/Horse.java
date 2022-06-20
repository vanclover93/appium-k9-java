package lab_09;

import java.security.SecureRandom;

public class Horse extends Animal {
    public static int maxSpeedHorse = 75;

    public Horse(String name){
        super(name);
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(maxSpeedHorse);
    }
}

