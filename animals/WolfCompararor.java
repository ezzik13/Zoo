package animals;

import java.util.Comparator;

public class WolfCompararor implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {

        if (o1.yearBorn > o2.yearBorn) {
            return 1;
        } else if (o1.yearBorn < o2.yearBorn) {
            return -1;
        } else if (o1.yearBorn == o2.yearBorn) {
            if (o1.weight > o2.weight) {
                return 1;
            } else if (o1.weight < o2.weight) {
                return -1;
            }
        }
        return 0;

    }
}
