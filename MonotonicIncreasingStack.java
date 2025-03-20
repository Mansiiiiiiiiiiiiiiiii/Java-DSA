import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicIncreasingStack {
    public static int[] monotonicIncreasing(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse Array
        for (int num : nums) {
            // While stack is not empty AND top of stack is more than the current element
            while (!stack.isEmpty() && stack.peekLast() > num) {
                // Pop all the other elements
                stack.pollLast();
            }
            // Push the current element
            stack.offerLast(num);
        }

        // Construct the result array from the stack
        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index++] = stack.pollFirst();  // Pop from the front to maintain order
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] result = monotonicIncreasing(num);  // Pass 'num' instead of 'nums'

        System.out.print("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
