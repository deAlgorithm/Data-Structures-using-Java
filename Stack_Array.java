public class Stack_Array {

    int[] stack;  // Array to store stack elements
    int top;      // Index of the top element

    // Constructor to initialize stack size and top pointer
    public Stack_Array(int size) {
        stack = new int[size];
        top = -1; // -1 means the stack is empty
    }

    // Push element onto the stack
    void push(int element) {
        if (top == stack.length - 1) { // Stack is full
            System.out.println("Stack Overflow, can't push " + element);
        } else {
            top++;
            stack[top] = element;
            System.out.println("Pushed " + element);
        }
    }

    // Pop element from the stack
    void pop() {
        if (top == -1) { // Stack is empty
            System.out.println("Stack underflow. Stack is empty");
        } else {
            System.out.println("Popped " + stack[top]);
            top--;
        }
    }

    // View the top element without removing it
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("The top of the stack is " + stack[top]);
        }
    }

    // Display all stack elements from bottom to top
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack_Array mystack = new Stack_Array(5);

        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.push(6);
        mystack.display();

        mystack.pop();
        mystack.pop();
        mystack.peek();
        mystack.display();

        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.display();

        System.out.println("Program is running...");
    }
}
