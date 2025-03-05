import java.util.*;

class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data = new_data;
        this.next = null;
    }
}
class Stack{
    //head of the linked list
    Node head;

    //constructor to initialize the stack
    Stack(){
        this.head = null;
    }
    //Fuction to check if the stack is empty
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    //push the element onto the stack
    void push(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
        System.out.println(new_data+" pushed to stack");
    }
    //Function to remove the top element from the stack
    void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(head.data+" popped from stack");
        head = head.next;
    }
    //Function to return the top element of the stack
    int peek(){
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

}

public class StackUsingList {
    public static void main(String args[]){
        Stack st = new Stack();

        //push elements onto
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        //print elements from stack
        System.out.println("Peek : "+st.peek());

        //removing 2 elements from stack
        st.pop();
        st.pop();
        
        //print top elemets of stack
        System.out.println("Top element is : "+st.peek());
    }
}
