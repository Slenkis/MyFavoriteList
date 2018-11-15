package logic;

import ru.lanwen.verbalregex.VerbalExpression;

import java.util.List;

public class Parser {
    public Parser(String in, List<String> man) {
        VerbalExpression replaceV = VerbalExpression.regex()
                .startOfLine()
                .then("rp")
                .then(" ")
                .capture()
                .anything()
                .endCapture()
                .then(":")
                .capture()
                .anything()
                .endCapture()
                .endOfLine()
                .build();

        VerbalExpression newV = VerbalExpression.regex()
                .startOfLine()
                .then("new")
                .then(" ")
                .capture()
                .anything()
                .endCapture()
                .endOfLine()
                .build();
        VerbalExpression removeV = VerbalExpression.regex()
                .startOfLine()
                .then("rm")
                .then(" ")
                .capture()
                .anything()
                .endCapture()
                .endOfLine()
                .build();

        if (newV.test(in)) {
            sout("new command");                          // debug
            sout(newV.getText(in, 1));                // debug
            man.add(newV.getText(in, 1));
            sout(String.valueOf(man));                      // debug
        } else if (replaceV.test(in)) {
            sout("replace command");                      // debug
            sout(replaceV.getText(in, 1));            // debug
            sout(replaceV.getText(in, 2));            // debug
            man.set(man.indexOf(replaceV.getText(in, 1).trim()), replaceV.getText(in, 2).trim());
            sout(String.valueOf(man));                      // debug
        } else if (removeV.test(in)) {
            sout("remove command");                      // debug
            sout(newV.getText(in, 1));               // debug
            man.remove(in);
            sout(String.valueOf(man));                     // debug
        } else {
            sout("invalid command");                    // debug
        }
    }

    private void sout(String s) {
        System.out.println(s);
    }
}
