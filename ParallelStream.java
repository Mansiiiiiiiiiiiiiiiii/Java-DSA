import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(6,5,2,8,1,7);
        int result = nums.parallelStream()
            .filter(n->n%2 == 1)
            .map(n->n*2)
            .reduce(0, (c,e)->c+e);
            System.out.println(result);
    }
}
