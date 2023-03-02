package comparators;

import animals.Animal;

import java.util.Comparator;

public class AnimalsComparator<T> implements Comparator<Animal> {
    public int compare(Animal o1, Animal o2){
        return Integer.compare(o1.getYearBorn(), o2.getYearBorn());
    }
}
