package terminal.executable;
import terminal.CommandExecutable;
import zoo.Zoo;

public class PrintZoo  implements CommandExecutable{

    private Zoo zoo;

    public PrintZoo(Zoo zoo) {
        this.zoo = zoo;
        System.out.println(zoo);
    }

    @Override
    public void execut() {
        System.out.println("");

    }
}