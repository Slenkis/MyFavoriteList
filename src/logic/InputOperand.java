package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class InputOperand {

    private ArrayList<String> list = new ArrayList<>();

    public void addToList() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Что хотите добавить?");
            String inner = sc.nextLine().trim();
            if (!inner.equals("")) {
                this.list.add(inner);
            } else {
                break;
            }

        }
    }

    public ArrayList<String> getArrayList() {
        return list;
    }
}
