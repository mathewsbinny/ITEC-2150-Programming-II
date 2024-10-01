package Pastry;

public class Cake extends Pastry{
    private String flavor;
    private String size;

    public Cake(String name, String flavor, String size) {
        super(name);
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
