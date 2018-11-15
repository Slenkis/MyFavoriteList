package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCreator {

    private List<String> listWithNewProducts = new ArrayList<>();

    public List<String> addWhile() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Что хотите добавить?");
            String in = sc.nextLine().trim();
            if (!in.equals("")) {
                this.listWithNewProducts.add(in);
            } else {
                break;
            }
        }
        return this.listWithNewProducts;
    }

    public List<String> getArrayList() {
        return this.listWithNewProducts;
    }
}
