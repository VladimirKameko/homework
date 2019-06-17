package Concurrent.hw2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        LinkedList<Integer>  links = new LinkedList<>();
        ex.submit(new NumberStore(links)::produce);
        ex.submit(new NumberStore(links)::consume);


    }
}
