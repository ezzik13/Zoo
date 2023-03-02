package cage;

import animals.Animal;
import animals.Snake;

public class SnakeCage implements AnimalCage<Snake> {
    @Override
    public int addAnimal(Snake addAnimal) {
        return 0;
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
    public Animal remuveAnimal() {
        return null;
    }


}
