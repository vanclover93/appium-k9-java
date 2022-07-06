package lab_08;
import java.security.SecureRandom;

public class Animal {
    private String name = "Tiger";
    private int speed = 1;
    private boolean flyable = false;
            ;

    public Animal(String name, int maxSpeed, boolean flyable){
        this.speed = new SecureRandom().nextInt(maxSpeed);
        this.name = name;
        this.flyable = flyable;
    }

    public Animal() {
    }

    protected Animal(Animal.Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder {
        private String name = "Tiger";
        private int speed = 1;
        private boolean flyable = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}


