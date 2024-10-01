package D2LTracer;

public class Joining
{
    public static int g(int x, int y)
    {
        System.out.print("g" + x + "-" + y);
        x = x + y;
        System.out.print("g" + x + "-" + y);
        return x;
    }

    public static int f(int x, int y)
    {
        System.out.print("f" + x + "-" + y);
        int z = g(y + x, x - y);
        System.out.print("f" + z);
        System.out.print("f" + x + "-" + y);
        return x;
    }
    public static void main(String[] args) {
        int z = f(5, 2);
        System.out.print("m" + z);
    }
}