package logic.commands;

import logic.Product;
import logic.interfaces.Command;

import java.util.*;

public class ReplaceCommand implements Command {
    @Override
    public void satisfy(String[] args, List<Product> arr) {

        Collections.replaceAll(arr, new Product(args[0]), new Product(args[1]));
    }
}


