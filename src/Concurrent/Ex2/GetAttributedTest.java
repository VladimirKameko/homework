package Concurrent.Ex2;

public class GetAttributedTest {
    public static void main(String[] args) throws InterruptedException {
        GetAttributed get = new GetAttributed();
        Thread thread = new Thread(get);
        thread.start();
        Thread.sleep(100);
        thread.setName("Thread!!!!");
        thread.setPriority(2);
    }
}
