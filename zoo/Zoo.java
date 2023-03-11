package zoo;

import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;


public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.lionCage = lionCage;
        this.snakeCage = snakeCage;
    }

    public Lion remooveLionFromZoo() {
        return this.lionCage.remuveAnimal();
    }

    public void insertLionToZoo() {

        this.lionCage.addAnimal(new Lion(2010, 50, 4, 30));

    }
}
