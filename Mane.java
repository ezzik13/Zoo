import animals.Lion;
import animals.Wolf;
import animals.WolfCompararor;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;

import java.util.ArrayList;
import java.util.Random;

public class Mane {
    public static void main(String[] args) {
//        ArrayList<Lion> lions = LionsFactory.createLions(5);
//        LionCage lionsInCage = new LionCage(lions);
//        System.out.println(lionsInCage);
//        for (int i = 0; i < lions.size(); i++) {
//            lions.get(i).feed(lionsInCage.deliverFoodInCage(50));
//        }
//        System.out.println(lionsInCage);
//        lionsInCage.sortLionsManeVollum();
//        System.out.println(lionsInCage);
        ArrayList<Wolf> wolfArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = new Random().nextInt(2010,2020);
            int w = new Random().nextInt(30,50);
            wolfArrayList.add(new Wolf(a, w, 4));
        }
        WolfCage wolfCage = new WolfCage(wolfArrayList);
//        System.out.println(wolfCage);
//        wolfCage.remuveAnimal();
//        System.out.println(wolfCage);
//        for (int i = 0; i < wolfArrayList.size(); i++) {
//            wolfArrayList.get(i).feed(wolfCage.deliverFoodInCage(30));
//        }
//        System.out.println(wolfCage);
//        wolfCage.cleanCage();
        for (Wolf wolf:wolfCage) {
            System.out.println(wolf);
        }
        System.out.println();
        wolfCage.sortWolfsByWeightAndAge();
        for (Wolf wolf:wolfCage) {
            System.out.println(wolf);
        }
    }
}
