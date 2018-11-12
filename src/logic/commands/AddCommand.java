package logic.commands;

import logic.Product;
import logic.interfaces.Command;

import java.util.Arrays;
import java.util.List;

public class AddCommand implements Command {

    @Override
    public void satisfy(String[] args, List<Product> arr) {
        for (String arg : args) {
            arr.add((new Product(arg)));
        }
    }

}
