package TXTBK_CH1;

public class SquareTester {
    public static void main(String[] args) {
        Square square1 = new Square();
        square1.setLength(10.5);
        System.out.println(square1);
        System.out.println();

        Square square2 = square1.getSquare();
        System.out.println(square2);
    }
}
