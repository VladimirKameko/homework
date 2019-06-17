package Concurrent.hw1.Ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownlaunderTest {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new Downlaunder("https://dropmefiles.com/Rr3We"));
        ex.execute(new Downlaunder("https://dropmefiles.com/T2V1U"));
        ex.execute(new Downlaunder("https://dropmefiles.com/J0gxm"));

    }
}
