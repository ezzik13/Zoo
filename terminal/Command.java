package terminal;

public class Command {

    private String action;
    //    = "Создать";
    private String animal;
//    = "Удалить льва";
//    private String crW = "Создать волка";
//    private String delW = "Удалить волка";
//    private String crS = "Создать змею";
//    private String delS = "Удалить змею";


    public Command(String action, String animal) {
        this.action = action;
        this.animal = animal;
    }


    public boolean isCreateLion() {

        return action.equals("Создать") && animal.equals("льва");
    }
    public boolean isPrint(){
        return action.equals("Печать")&& animal.equals("всех");
    }

    public boolean isDeleteLion() {
        return action.equals("Удалить") && animal.equals("льва");
    }
    public boolean isCreateWolfe() {

        return action.equals("Создать") && animal.equals("волка");
    }

    public boolean isDeleteWolfe() {
        return action.equals("Удалить") && animal.equals("волка");
    }
    public boolean isCreateSnake() {

        return action.equals("Создать") && animal.equals("змею");
    }

    public boolean isDeleteSnake() {
        return action.equals("Удалить") && animal.equals("змею");
    }

}
