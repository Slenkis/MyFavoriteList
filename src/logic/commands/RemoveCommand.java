package logic.commands;


import logic.interfaces.Command;

import java.util.List;

public class RemoveCommand implements Command {
    @Override
    public void satisfy(String[] args, List<String> arr) {
        for (String a : args) {
            arr.remove(a);
        }

    }

    @Override
    public void satisfy(String[] args1, String[] args2, List<String> arr) {}
}
