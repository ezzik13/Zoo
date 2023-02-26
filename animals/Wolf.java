package animals;

public class Wolf extends Animal{

    protected static final int MAXWEIGHT = 70;
    protected static final String TYPE = "Wolf";

    Wolf(int yearBorn, int weight, int countLimbs) {
        super(yearBorn, weight, countLimbs);
    }
    public Wolf() {
        this.yearBorn = 2019;
        this.weight = 40;
        this.countLimbs = 4;
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
}
