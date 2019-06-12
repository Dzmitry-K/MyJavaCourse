package _8_java8._hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestJavaUtils {

    private static List<String> words = new ArrayList<>();

    private static Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

    public static void main(String[] args) {
        words.add("dafdadfad sdfsd Kladjfaqerqerqerqewr asdfeewrwerq");
        words.add("www Dfsd erqerqerqewr afeewrwerq");
        words.add("Tsdfsdfafdadfad Sdfsdfsdfsd kladjsdfsdfsfaqerqerqerqewr asdfeewrwerq");
        words.add("d Sd jfaqerqerqerqewr q");
        Optional<String> optional = JavaUtils.getMaxString(words);
        optional.ifPresent(System.out::println);
        System.out.println(JavaUtils.getWordsAmount(names));
    }
}
