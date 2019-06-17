package Java_8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//*     2. Пусть дан поток, элементы которого - слова. Посчитайте, сколько раз встречается каждое слово.
//        *        При следующих исходных данных должен быть возвращен такой объект Мар:[John -> 3, Paul -> 2, George -> 1]:
//        *
//        *        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John")
public class NamesCounter {

    private static Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

    public static Map<String, Integer> countWords(Stream<String> stream) {
        return stream.collect(Collectors.toMap(w -> w, w -> 1, (a, b) -> a + 1));
    }

    public static void main(String[] args) {
        System.out.println(countWords(names));
    }
}
