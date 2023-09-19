public class StackUsingArray_6 {
    private int maxSize;         // Maximum size of the stack
    private int[] stackArray;    // Array to store stack elements
    private int top;             // Index of the top element

    public StackUsingArray_6(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }
    // Push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow - Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow - Cannot pop from an empty stack");
            return -1;  // Return a default value to indicate underflow
        }
        return stackArray[top--];
    }

    // Get the element at the top of the stack without removing it
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;  // Return a default value for an empty stack
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StackUsingArray_6 stack = new StackUsingArray_6(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
