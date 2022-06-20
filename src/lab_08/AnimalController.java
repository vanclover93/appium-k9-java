package lab_08;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static lab_08.Animal.Builder;

public class AnimalController {

    public static Animal racingAnimal(List<Animal> animalList){
        Animal animalWin = animalList.get(0);
        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getSpeed() > animalWin.getSpeed()){
                animalWin = animalList.get(i);
            }
        }
        return animalWin;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        Animal snake = builder
                .withWings(false)
                .setName("Snake")
                .setSpeed(60)
                .build();
        Animal eagle = builder
                .withWings(true)
                .setName("Eagle")
                .setSpeed(75)
                .build();
        Animal tiger = builder
                .withWings(false)
                .setName("Tiger")
                .setSpeed(100)
                .build();
        System.out.println("Animal win is: " + racingAnimal(Arrays.asList(snake,eagle,tiger)));
    }
}


