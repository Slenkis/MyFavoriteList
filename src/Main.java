import logic.InputCreator;
import logic.Parser;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> mainList = new ArrayList<>();
        boolean wh = true;
//
//        InputCreator p = new InputCreator();
//
//
//        System.out.println(p.getArrayList());
        while (wh) {
            System.out.println("Для добавления введите new продукт \n"+
                    "Для изменения введите rp старый : новый \n" +
                    "Для удаления введите rm продукт \n");
            Parser p2 = new Parser(sc.nextLine().trim(), mainList);
        }
    }
}

