package logic.interfaces;

import java.util.List;

public interface Command {

    void satisfy(String[] args, List<String> arr);
    void satisfy(String[] args1, String[] args2, List<String> arr);

}
