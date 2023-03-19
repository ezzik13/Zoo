package cage;

import animals.Animal;
import animals.Lion;
import animals.Snake;
import animals.Wolf;

import java.util.ArrayList;

public class SnakeCage<T extends Snake> implements AnimalCage {

    private int clean;
    private ArrayList<T> snakes;

    public SnakeCage(ArrayList<T> snakes) {
        this.clean = 0;
        this.snakes = snakes;
    }

    @Override
    public int addAnimal(Animal addAnimal) {
        snakes.add((T) addAnimal);
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
    public Snake remuveAnimal() {
        if (snakes.isEmpty()) {
            System.out.println("Животных в клетке нет");
            return null;
        } else {
            int randomSnakeToGet = (int) (Math.random() * (this.snakes.size()));
            Snake randomSnake = this.snakes.get(randomSnakeToGet);
            this.snakes.remove(randomSnake);
            return randomSnake;
        }


    }

    @Override
    public String toString() {
        return "\nSnakeCage:   " +
                "clean=" + clean +
                ", snakes: " + snakes;
    }
}
