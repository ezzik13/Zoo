package cage;

import animals.Animal;
import animals.Lion;
import animals.Wolf;

import java.util.ArrayList;

public class WolfCage implements AnimalCage{

    private int clean;
    private ArrayList wolfs;

    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }
    public WolfCage(){
        this.wolfs = new ArrayList<>();
    }

    @Override
    public int addAnimal(Animal animals) {
        wolfs.add((Wolf) animals);
        return wolfs.size();
    }


    @Override
    public int deliverFoodInCage(int foodInCage) {
        clean = clean + 1;
        return (int) (foodInCage*0.9)/wolfs.size();
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return clean;
    }

    @Override
    public void remuveAnimal() {
        if (wolfs.isEmpty() ){
            System.out.println("Животных в клетке нет");
        }
        else {
            wolfs.remove(wolfs.size()-1);
        }
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "clean=" + clean +
                ", wolfs=" + wolfs +
                '}';
    }
}
