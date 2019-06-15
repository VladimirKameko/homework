package Collections.hw2.Ex1;

import java.util.Map;
import java.util.TreeMap;

public class TextToTree {
    private String text;

    public TextToTree(String text) {
        this.text = text;
    }

    public void wordCounter() {
        Map<String, Integer> words = new TreeMap<>();
        for (String word : text.split("\\s+")) {
            if (words.get(word)==null){
                words.put(word,1);
            }
            else{
                words.put(word,words.get(word)+1);
            }
        }
        System.out.println(words);
    }
}
