package Collections.hw2.Ex1;

public class WordCounterTest {
    public static void main(String[] args) {
        String text=new String("Stephen Edwin King (born September 21, 1947) is an American author of horror, supernatural fiction, suspense, science fiction, and fantasy novels. His books have sold more than 350 million copies,[2] many of which have been adapted into feature films, miniseries, television series, and comic books. King has published 58 novels (including seven under the pen name Richard Bachman) and six non-fiction books. He has written approximately 200 short stories,[3][4] most of which have been published in book collections.");
        TextToTree tt = new TextToTree(text);
        tt.wordCounter();
    }
}
