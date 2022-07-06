package lab_07;
import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;

    public Animal(String name, int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed);
        this.name = name;
    }

    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

