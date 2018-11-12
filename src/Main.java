import logic.InputCreator;
import logic.commands.ReplaceCommand;

public class Main {
    public static void main(String[] args) {
        InputCreator p = new InputCreator();
        String[] arr = {"Оливки", "маслины"};
        p.addWhile();
        ReplaceCommand rp = new ReplaceCommand();
        rp.satisfy(arr,p.getArrayList());
        System.out.println(p.getArrayList());
    }
}

