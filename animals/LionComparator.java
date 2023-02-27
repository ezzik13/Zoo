package animals;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion> {


    @Override
    public int compare(Lion o1, Lion o2) {
        if (o1.maneVollum > o2.maneVollum) {
            return 1;
        }
        else if (o1.maneVollum < o2.maneVollum) {
            return -1;
        }
        return 0;
    }
}
