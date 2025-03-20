import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DoubleStream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,9,6,2,8);
        Stream<Integer> data = nums.stream();
        Stream<Integer> mappedData = data.map(n->n*2);
        mappedData.forEach(n->System.out.println(n));
    }
}
