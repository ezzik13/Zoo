package cage;

import animals.Animal;
import animals.Lion;

import java.util.ArrayList;

public class LionCage implements AnimalCage {

    private int clean;
    private ArrayList lions;

    public LionCage(ArrayList<Lion> lions){
       this.lions = lions;
    }
    public LionCage(){
        this.lions = new ArrayList<>();
    }
    @Override
    public int addAnimal(Animal animals) {
        lions.add((Lion) animals);
        return lions.size();
    }

    @Override
    public int deliverFoodInCage(int foodInCage) {
        clean = clean + foodInCage/10;
        return foodInCage/lions.size();
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return clean;
    }

    @Override
    public void remuveAnimal() {
        if (lions.isEmpty() ){
            System.out.println("Животных в клетке нет");
        }
        else {
            lions.remove(lions.size()-1);
        }
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "clean=" + clean +
                ", lions=" + lions +
                '}';
    }
}