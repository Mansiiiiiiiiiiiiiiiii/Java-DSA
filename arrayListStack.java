
import java.util.ArrayList;

public class arrayListStack {
    public class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.isEmpty();
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        

    }   

    public static void main(String[] args) {
        Stack s = new arrayListStack().new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek()); // Should print 30
        System.out.println(s.pop());  // Should print 30
        System.out.println(s.peek()); // Should print 20
    }
}
