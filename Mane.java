import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;

import java.util.ArrayList;

public class Mane {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);
        for (int i = 0; i < lions.size(); i++) {
            lions.get(i).feed(lionsInCage.deliverFoodInCage(50));
        }
        System.out.println(lionsInCage);
        ArrayList<Wolf> wolfArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            wolfArrayList.add(new Wolf());
        }
        WolfCage wolfCage = new WolfCage(wolfArrayList);
        System.out.println(wolfCage);
        wolfCage.remuveAnimal();
        for (int i = 0; i < wolfArrayList.size(); i++) {
            wolfArrayList.get(i).feed(wolfCage.deliverFoodInCage(20));
        }
        System.out.println(wolfCage);
        wolfCage.cleanCage();
        System.out.println(wolfCage);
    }
}
