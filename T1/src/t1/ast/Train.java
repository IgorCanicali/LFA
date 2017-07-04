package t1.ast;
import java.util.ArrayList;
import javax.print.DocFlavor.STRING;

import t1.ast.Definition;
import t1.ast.TrainPart;

public class Train extends Definition {
    private ArrayList<TrainPart> convoy;
    private String name;

    public Train slpit(int pos) {
        Train t = new Train();
        return t;
    }

    public void append(Train train, String pos) {}

    public void append(TrainPart part, String pos) {}

    public void remove(String pos) {}
}