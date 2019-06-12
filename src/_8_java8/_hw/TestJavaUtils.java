package _8_java8._hw;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestJavaUtils {

    private static List<String> words = Arrays.asList("dafdadfad","sdfsd","kladjfaqerqerqerqewr", "asdfeewrwerq");
    private static Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

    public static void main(String[] args) {
        Optional<String> optional = JavaUtils.getMaxString(words);
        optional.ifPresent(System.out::println);
        System.out.println(JavaUtils.getWordsAmount(names));
    }
}
