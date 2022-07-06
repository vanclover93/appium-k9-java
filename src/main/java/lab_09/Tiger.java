package lab_09;
import java.security.SecureRandom;

public class Tiger extends Animal {
    public static int maxSpeedTiger = 100;

    public Tiger (String name){
        super(name);
    }

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(maxSpeedTiger);
    }
}

