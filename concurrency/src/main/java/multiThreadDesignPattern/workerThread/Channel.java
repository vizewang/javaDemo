package multithreadDesignPattern.workerThread;


/**
 * Created by weizwang on 2015/12/22.
 */
public class Channel {
    private static final int MAX_REQUEST = 100;
    private final Request[] requestsQueue;
    private int tail;
    private int head;
    private int count;
    private final WorkerThread[] threadPool;

    public Channel(int threads) {
        this.requestsQueue = new Request[MAX_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        threadPool = new WorkerThread[threads];
        for (int i = 0; i < threadPool.length; i++) {
            threadPool[i] = new WorkerThread("Worker-" + i, this);
        }
    }

    public void startWorkers() {
        for (int i = 0; i < threadPool.length; i++) {
            threadPool[i].start();
        }
    }

    public synchronized void putRequest(Request request) {
        while (count >= requestsQueue.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        requestsQueue[tail] = request;
        tail = (tail + 1) % requestsQueue.length;
        count++;
        notifyAll();
    }

    public Request takeRequest() {
        while (count <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Request request = requestsQueue[head];
        head = (head + 1) % requestsQueue.length;
        count--;
        notifyAll();
        return request;
    }
}
