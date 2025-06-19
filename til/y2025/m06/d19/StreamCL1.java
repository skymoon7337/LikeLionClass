package til.y2025.m06.d19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCL1 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        numbers.stream().filter(n->n%2==0);

    }
}
