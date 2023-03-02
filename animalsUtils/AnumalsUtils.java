package animalsUtils;

import animals.Animal;
import comparators.AnimalsComparator;

import java.util.Collections;
import java.util.List;

public class AnumalsUtils<T> {
    public static  <T extends Animal> List<T> sortAnimals (List<T> animalList) {

        Collections.sort(animalList, new AnimalsComparator<>());
        return animalList;
    }

}
