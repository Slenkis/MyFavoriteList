package logic.interfaces;

import java.util.List;

public interface Command {

    void satisfy(String[] args, List<String> arr);

}
