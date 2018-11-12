package logic;

import logic.commands.AddCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCreator {

    private List<String> preList = new ArrayList<>();

    public void addWhile() {
        AddCommand adC = new AddCommand();
        List<String> innerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("Что хотите добавить?");
            inner.add(sc.nextLine().trim());
            if (!inner.equals("")) {
                innerList.add()
                adC.satisfy(inner, preList);
            } else {
                break;
            }

        }
    }

    public List<String> getArrayList() {
        return this.preList;
    }
}
