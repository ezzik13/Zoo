package cage;

import animals.Animal;
import animals.Snake;
import animals.Wolf;

import java.util.ArrayList;

public class SnakeCage<T extends Snake> implements AnimalCage {

    private int clean;
    private ArrayList<T> snakes;

    @Override
    public int addAnimal(Animal addAnimal) {
        return snakes.size();
    }

    @Override
    public int deliverFoodInCage(int foodInCage) {
        return 0;
    }

    @Override
    public int cleanCage() {
        return 0;
    }

    @Override
    public T remuveAnimal() {
        return null;
    }


}
