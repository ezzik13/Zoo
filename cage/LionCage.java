package cage;

import animals.Animal;
import animals.Lion;
import animals.LionComparator;

import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage {

    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions){
       this.lions = lions;
    }
    public LionCage(){
        this.lions = new ArrayList<>();
    }
    @Override
    public int addAnimal(Animal animal) {
        if (animal.getType().equals("Lion")){
        lions.add((Lion) animal);
        }
        return lions.size();
    }

    @Override
    public int deliverFoodInCage(int foodInCage) {
        if (lions.size() == 0){
            clean = clean + foodInCage;
            return foodInCage;
        }
        else {
            clean = clean + (int) ((foodInCage / lions.size()) * 0.1);
            return (int) ((foodInCage / lions.size()) * 0.9);
        }
    }

    @Override
    public int cleanCage() {
        clean = 0;
        return clean;
    }

    @Override
    public Lion remuveAnimal() {
        if (lions.isEmpty() ){
            System.out.println("Животных в клетке нет");
            return null;
        }
        else {
            int randomLionToGet = (int) (Math.random() * (this.lions.size()));
            Lion randomLion = this.lions.get(randomLionToGet);
            this.lions.remove(randomLion);
            return randomLion;
        }
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "clean=" + clean +
                ", lions=" + lions +
                '}';
    }
    public void  sortLions(){
        Collections.sort(lions);
    }
    public void sortLionsManeVollum(){
        Collections.sort(lions, new LionComparator());
    }
}