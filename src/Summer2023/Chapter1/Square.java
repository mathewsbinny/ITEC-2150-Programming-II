package TXTBK_CH1;

public class Square {
    private double length;

    public Square() {
        length = 0.0;
    }

    public Square(double inLength) {
        length = inLength;
    }

    public void setLength(double inLength) {
        length = inLength;
    }

    public double getLength() {
        return length;
    }

    public double computeArea() {
        return length*length;
    }

    public double computePerimeter(){
        return 4*length;
    }

    public String toString() {
        String result = "Square \nlength: " + length + "\nperimeter: " + computePerimeter() + "\narea: " + computeArea();
        return result;
    }

    public Square getSquare() {
        Square newSquare = new Square(100);
        return newSquare;
    }
}
