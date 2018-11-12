package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCreator {

    private List<Product> preList = new ArrayList<>();

    public void addWhile() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("Что хотите добавить?");
            String inner = sc.nextLine().trim();
            if (!inner.equals("")) {
                this.preList.add(new Product(inner));
            } else {
                break;
            }

        }
    }

    public List<Product> getArrayList() {
        return this.preList;
    }
}
