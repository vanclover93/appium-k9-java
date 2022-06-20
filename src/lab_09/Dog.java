package lab_09;
import java.security.SecureRandom;

public class Dog extends Animal {
    public static int maxSpeedDog = 60;

    public Dog(String name){
        super(name);
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(maxSpeedDog);
    }
}

