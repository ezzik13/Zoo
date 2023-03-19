import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import factory.LionsFactory;
import terminal.CommandExecutableFactoryImpl;
import terminal.CommandParser;
import terminal.TerminalReader;
import zoo.Zoo;
import java.util.ArrayList;
import java.util.Random;

public class Mane {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(2);
        LionCage lionsInCage = new LionCage(lions);
        ;
        ArrayList<Wolf> wolfArrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            wolfArrayList.add(new Wolf());
        }
        WolfCage wolfCage = new WolfCage(wolfArrayList);
        ArrayList<Snake> snakes = new ArrayList<>();
        SnakeCage snakeCage = new SnakeCage(snakes);
        for (int i = 0; i < 2; i++) {
            snakes.add(new Snake());
        }

        Zoo zoo = new Zoo(wolfCage, lionsInCage, snakeCage);
        System.out.println(zoo);
        CommandExecutableFactoryImpl commandExecutableFactory = new CommandExecutableFactoryImpl(zoo);
        TerminalReader terminalReader = new TerminalReader(commandExecutableFactory);
        terminalReader.endless();
    }
}
