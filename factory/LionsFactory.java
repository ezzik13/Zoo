package factory;

import animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {

    static public ArrayList<Lion> createLions (int lionCount){
    ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            int a = new Random().nextInt(80,120);
            int y = new Random().nextInt(2010, 2020);
            int m = new Random().nextInt(15, 25);
            Lion lion = new Lion(y, a, 4, m);
            lionInCage.add(lion);

        }

        return lionInCage;
    }


}