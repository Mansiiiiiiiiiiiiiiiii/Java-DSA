import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(6,5,2,8,1,7);
        nums.stream()
            .filter(n->n%2 != 0)
            .sorted()
            .map(n->n*2)
            .forEach(n->System.out.println(n));
    }
}
