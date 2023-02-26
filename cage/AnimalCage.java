package cage;

import animals.Animal;

public abstract interface AnimalCage{
    int addAnimal(Animal animals);
    int deliverFoodInCage(int foodInCage);
    int cleanCage();
    void remuveAnimal();
}