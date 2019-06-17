package Concurrent.Ex1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;

public class Downlaunder implements Runnable {
    private String url;

    public Downlaunder(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        downloader();
    }

    private synchronized void downloader() {
        try (BufferedInputStream downlaund = new BufferedInputStream(new URL(url).openStream())) {
            downlaund.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
