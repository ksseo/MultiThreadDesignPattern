import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<char[]> exchanger = new Exchanger<char[]>();
        char[] buffer1 = new char[5];
        char[] buffer2 = new char[5];
        new ProducerThread(exchanger, buffer1, 392010).start();
        new ConsumerThread(exchanger, buffer2, 230492).start();
    }
}
