package Questions;

import java.util.Stack;

public class StackToQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public StackToQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }

    public static void main(String[] args) {
        StackToQueue test = new StackToQueue();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.empty());
    }
}
