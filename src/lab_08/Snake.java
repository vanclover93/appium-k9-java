package lab_08;

public class Snake extends Animal {
    public static int maxSpeedSnake = 2;

    public Snake(String name,boolean flyable){
        super(name, maxSpeedSnake, flyable);
    }
}