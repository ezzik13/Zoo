package animals;

public abstract class Animal {
    protected int yearBorn;
    protected int weight;
    protected int countLimbs;

    public Animal(int yearBorn, int weight, int countLimbs) {
        this.yearBorn = yearBorn;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }

    protected Animal() {
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountLimbs() {
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs) {
        this.countLimbs = countLimbs;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight = weight + foodWeight;
        } else {
            System.out.println("Превышен максимальный вес!");
        }
    }

    public  abstract  int getMaxWeight();

    public abstract String getType();
}