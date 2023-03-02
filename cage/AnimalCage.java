package cage;

import animals.Animal;

import java.util.Collections;
import java.util.List;

public abstract interface AnimalCage<T extends Animal>{
    int addAnimal(T addAnimal);
    int deliverFoodInCage(int foodInCage);
    int cleanCage();
    Animal remuveAnimal();
//    void yearBornSort();

}