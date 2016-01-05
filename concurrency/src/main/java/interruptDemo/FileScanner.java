package interruptDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created by weizwang on 2016/1/4.
 */
public class FileScanner {
    private static void listFile(File f) throws InterruptedException {
        if (f == null) {
            throw new IllegalArgumentException();
        }
        if (f.isFile()) {
            System.out.println(f);
            return;
        }
        File[] allFiles = f.listFiles();
        if (Thread.interrupted()) {
            throw new InterruptedException("文件扫描任务被中断");
        }
        for (File file : allFiles) {
            //还可以将中断检测放到这里
            listFile(file);
        }
    }

    public static String readFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static class sleepTest extends Thread {
        private final BlockingQueue<String> qs = new ArrayBlockingQueue<String>(20);

        public void run() {
            try {
                System.out.println("start take");
                qs.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void stopWork() {
            interrupt();
        }
    }

    public static void main(String[] args) throws Exception {
        final sleepTest fileIteratorThread = new sleepTest();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    fileIteratorThread.stopWork();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        fileIteratorThread.start();
    }
}
