package animals;

public class Wolf extends Animal implements Comparable<Wolf>{

    protected static final int MAXWEIGHT = 70;
    protected static final String TYPE = "Wolf";



    public Wolf(int yearBorn, int weight, int countLimbs) {
        super(yearBorn, weight, countLimbs);

    }


    @Override
    public int getMaxWeight() {
        return MAXWEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "yearBorn=" + yearBorn +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                '}';
    }
    @Override
    public int compareTo(Wolf o) {
        if (this.yearBorn < o.yearBorn) {
            return 1;
        } else if (this.yearBorn > o.yearBorn) {
            return -1;
        }
        return 0;
    }
}
