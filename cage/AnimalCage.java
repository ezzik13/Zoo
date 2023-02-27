package cage;

import animals.Animal;

public abstract interface AnimalCage{
    int addAnimal(Animal animal);
    int deliverFoodInCage(int foodInCage);
    int cleanCage();
    Animal remuveAnimal();
}