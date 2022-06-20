package lab_07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Animal dog = new Dog("Dog");
        Animal horse = new Horse("Horse");
        Animal tiger = new Tiger("Tiger");

        System.out.println("Animal win is: " + racingAnimal(Arrays.asList(dog,horse,tiger)));
    }
}

