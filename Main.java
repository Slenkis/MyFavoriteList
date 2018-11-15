import logic.Parser;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> mainList = new ArrayList<>();
        boolean wh = true;

        while (wh) {
            System.out.println("For add write new %product% \n"+
                    "For repalce write rp %old_product% : %new_product% \n" +
                    "For remove write rm %product% \n");
            Parser p2 = new Parser(sc.nextLine().trim(), mainList);
            System.out.println();
        }
    }
}

