import animals.Lion;
import animals.Snake;
import animals.Wolf;
import animals.WolfCompararor;
import animalsUtils.AnumalsUtils;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import factory.LionsFactory;
import terminal.CommandExecutableFactory;
import terminal.TerminalReader;
import zoo.Zoo;

import java.util.ArrayList;
import java.util.Random;

public class Mane {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(5);
        LionCage lionsInCage = new LionCage(lions);
        ;
        ArrayList<Wolf> wolfArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = new Random().nextInt(2010, 2020);
            int w = new Random().nextInt(30, 50);
            wolfArrayList.add(new Wolf(a, w, 4));
        }
        WolfCage wolfCage = new WolfCage(wolfArrayList);
        ArrayList<Snake> snakes = new ArrayList<>();
        SnakeCage snakeCage = new SnakeCage();
        Zoo zoo = new Zoo(wolfCage, lionsInCage, snakeCage);
        CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory(zoo);
        TerminalReader terminalReader = new TerminalReader(commandExecutableFactory);
        terminalReader.endless();
    }
}
