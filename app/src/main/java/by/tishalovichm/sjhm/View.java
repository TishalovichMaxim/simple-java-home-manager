package by.tishalovichm.sjhm;

import java.util.List;
import java.util.stream.IntStream;

public class View {

    public void showJdksList(List<String> jdks) {
        IntStream.range(0, jdks.size())
            .mapToObj(i -> (i + 1) + " - " + jdks.get(i))
            .forEach(System.out::println);
    }

}
