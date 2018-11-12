package logic.commands;

import logic.interfaces.Command;

import java.util.Arrays;
import java.util.List;

public class AddCommand implements Command {

    @Override
    public void satisfy(String[] args, List<String> arr) {
        arr.addAll(Arrays.asList(args));
    }
}
