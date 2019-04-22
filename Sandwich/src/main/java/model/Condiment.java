package model;

import java.util.ArrayList;
import java.util.List;

public class Condiment {
   private static List<String> condiment;

    public static List<String> getCondiment() {
        return condiment;
    }

    public void setCondiment(List<String> condiment) {
        this.condiment = condiment;
    }
}
