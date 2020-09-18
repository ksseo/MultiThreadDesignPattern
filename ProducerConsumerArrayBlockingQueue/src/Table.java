import java.util.concurrent.ArrayBlockingQueue;

public class Table extends ArrayBlockingQueue<String> {

    public Table(int count) {
        super(count);
    }

//    public synchronized void put(String cake) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName() + " puts " + cake);
//        while (count >= buffer.length) {
//            wait();
//        }
//        buffer[tail] = cake;
//        tail = (tail + 1) % buffer.length;
//        count++;
//        notifyAll();
//    }
    public void put(String cake) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " puts " + cake);
        super.put(cake);
    }

//    public synchronized String take() throws InterruptedException {
//        while (count <= 0) {
//            wait();
//        }
//        String cake = buffer[head];
//        head = (head + 1) % buffer.length;
//        count--;
//        notifyAll();
//        System.out.println(Thread.currentThread().getName() + " takes " + cake);
//        return cake;
//    }
    public synchronized String take() throws InterruptedException {
        String cake = super.take();
        System.out.println(Thread.currentThread().getName() + " takes " + cake);
        return cake;
    }
}
