package animals;

import java.util.Random;

public class Snake extends Animal {
    protected float bodyLength;
    protected static final int MAXWEIGHT = 50;
    protected static final String TYPE = "Snake";

    public Snake(int yearBorn, int weight, int limbs, float bodyLength) {

        super(yearBorn, weight, limbs);
        this.bodyLength = bodyLength;
    }
    @Override
    public String getType() {
        return TYPE;
    }

    public Snake() {
        this.weight = new Random().nextInt(1,40);
        this.yearBorn = new Random().nextInt(2015,2022);
        this.bodyLength = (float) ((new Random().nextInt(10,40))*(0.1));
        this.countLimbs = 0;
    }

    public float getBodyLength() {

        return bodyLength;
    }

    @Override
    public String toString() {
        return "\nSnake(" +
                "bodyLength=" + bodyLength +
                ", yearBorn=" + yearBorn +
                ", weight=" + weight +
                ", countLimbs=" + countLimbs +
                ')';
    }

    public void setBodyLength(int bodyLength) {

        this.bodyLength = bodyLength;
    }

    @Override
    public int getMaxWeight() {
        return MAXWEIGHT;
    }

}