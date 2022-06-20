package lab_09;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract int getSpeed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}

