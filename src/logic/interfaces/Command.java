package logic.interfaces;

import logic.Product;

import java.util.List;

public interface Command {

    void satisfy(String[] args, List<Product> arr);

}
