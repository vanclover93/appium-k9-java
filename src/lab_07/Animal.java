package lab_07;

import java.security.SecureRandom;

public class Animal {
    final int maxhorse = 75;
    final int maxTiger = 100;
    final int maxDog = 60;
    int randomHorseSpeed = new SecureRandom().nextInt(maxhorse);
    int randomTigerSpeed = new SecureRandom().nextInt(maxTiger);
    int randomDogSpeed = new SecureRandom().nextInt(maxDog);

    


}
