package cage;

import animals.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WolfCage implements AnimalCage, Iterable<Wolf>{

    private int clean;
    private ArrayList<Wolf> wolfs;

    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }
    public WolfCage(){
        this.wolfs = new ArrayList<>();
    }

    @Override
    public int addAnimal(Animal animal) {
        if (animal.getType().equals("Wolf")) {
            wolfs.add((Wolf) animal);
        }
        return wolfs.size();
    }


    @Override
    public int deliverFoodInCage(int foodInCage) {
        if (wolfs.size() == 0){
            clean = clean + foodInCage;
            return foodInCage;
        }
        else {
            clean = clean + (int) (foodInCage * 0.1) / wolfs.size();
            return (int) ((foodInCage / wolfs.size()) * 0.9);
        }
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return clean;
    }

    @Override
    public Wolf remuveAnimal() {
        if (wolfs.isEmpty() ){
            System.out.println("Животных в клетке нет");
            return null;
        }
        else {
            int randomWolfToGet = (int) (Math.random() * (this.wolfs.size()));
            Wolf randomWolf = this.wolfs.get(randomWolfToGet);
            this.wolfs.remove(randomWolf);
            return randomWolf;
        }

    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "clean=" + clean +
                ", wolfs=" + wolfs +
                '}';
    }
    public void sortWolf(){
        Collections.sort(wolfs);
    }
    public void sortWolfsByWeightAndAge(){
        Collections.sort(wolfs, new WolfCompararor());
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }
}
