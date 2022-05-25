package src.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "aa", "b"));
        Stream<String> stream = list.stream();


    }

}
