package lab_08;
import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal(String name, int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed);
        this.name = name;
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
        private String name;
        private int speed;
        private boolean flyable;

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


