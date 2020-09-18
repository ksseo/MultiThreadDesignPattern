import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class RequestQueue {
    private final BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();
//    public synchronized Request getRequest() {
//        while (queue.peek() == null) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//
//            }
//        }
//        return queue.remove();
    public Request getRequest() {
        Request req = null;
        try {
            req = queue.take();
        } catch (InterruptedException e) {

        }
        return req;
    }
//    public synchronized void putRequest(Request request) {
    public void putRequest(Request request) {
        try {
            queue.put(request);
        } catch (InterruptedException e) {

        }
//        queue.offer(request);
//        notifyAll();
    }
}
