public class apples {
    public static void main(String[] args) {
        createFile g = new createFile();
        g.openFile();
        g.addRecords();
        g.closeFile();
    }
}
