package comparators;

import animals.Wolf;

import java.util.Comparator;

public class WolfCompararor implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {

        if (o1.getYearBorn()> o2.getYearBorn()) {
            return 1;
        } else if (o1.getYearBorn() < o2.getYearBorn()) {
            return -1;
        } else if (o1.getYearBorn() == o2.getYearBorn()) {
            if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else if (o1.getWeight() < o2.getWeight()) {
                return -1;
            }
        }
        return 0;

    }
}
