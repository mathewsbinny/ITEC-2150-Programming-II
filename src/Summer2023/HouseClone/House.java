package HouseClone;

import java.util.Comparator;
import java.util.Date;
import java.util.Clonea

public class House implements Cloneable, Comparator<House> {
    private int id;
    private double area;
    private Date whenbuilt;
}
