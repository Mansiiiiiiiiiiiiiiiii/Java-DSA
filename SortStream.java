import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortStream {
     public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,9,6,2,8);
        Stream<Integer> data = nums.stream();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n-> System.out.println(n));
    }
}
