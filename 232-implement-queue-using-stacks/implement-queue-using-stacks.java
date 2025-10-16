import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue
    public int pop() {
        move();
        return stack2.pop();
    }

    // Get the front element
    public int peek() {
        move();
        return stack2.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Helper function: move elements only when needed
    private void move() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
