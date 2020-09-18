public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 31415).start();
        new MakerThread("MakerThread-2", table, 92653).start();
        new MakerThread("MakerThread-3", table, 75862).start();
        new EaterThread("EaterThread-1", table, 15985).start();
        new EaterThread("EaterThread-2", table, 46526).start();
        new EaterThread("EaterThread-3", table, 88996).start();
    }
}
