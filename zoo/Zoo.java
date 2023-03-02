package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;


public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;
    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage){
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeCage;
    }

    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeCage() {
        return snakeCage;
    }

    public void setSnakeCage(AnimalCage<Snake> snakeCage) {
        this.snakeCage = snakeCage;
    }
}
