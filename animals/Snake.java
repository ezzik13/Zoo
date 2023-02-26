package animals;

public class Snake extends Animal {
    protected int bodyLength;
    protected static final int MAXWEIGHT = 50;
    protected static final String TYPE = "Snake";

    Snake(int yearBorn, int weight, int limbs) {

        super(yearBorn, weight, limbs);
    }
    @Override
    public String getType() {
        return TYPE;
    }

    public int getBodyLength() {

        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {

        this.bodyLength = bodyLength;
    }

    @Override
    public int getMaxWeight() {
        return MAXWEIGHT;
    }

}