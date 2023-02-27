package animals;

public class Lion extends Animal implements Comparable<Lion> {
    protected int maneVollum;
    protected static final int MAXWEIGHT = 150;
    protected static final String TYPE = "Lion";


    public Lion(int yearBorn, int weight, int countLimbs, int maneVollum) {
        super(yearBorn, weight, countLimbs);
        this.maneVollum = maneVollum;
    }


    public Lion(int yearBorn, int weight, int countLimbs) {
        super(yearBorn, weight, countLimbs);
    }

    public int getManeVollum() {

        return maneVollum;
    }

    public void setManeVollum(int maneVollum) {

        this.maneVollum = maneVollum;
    }

    @Override
    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= MAXWEIGHT) {
            this.weight = weight + foodWeight;
        } else {
            System.out.println("Превышен максимальный вес!");
        }
    }

    @Override
    public int getMaxWeight() {
        return MAXWEIGHT;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "maneVollum=" + maneVollum +
                ", yearBorn=" + yearBorn +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                '}';
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int compareTo(Lion o) {
        if (this.yearBorn < o.yearBorn) {
            return 1;
        } else if (this.yearBorn > o.yearBorn) {
            return -1;
        }
        return 0;
    }



}