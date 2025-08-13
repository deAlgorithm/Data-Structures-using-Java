public class Stack_LinkedList {
    private Node top; // points to the top of the stack

    public Stack_LinkedList() {
        this.top = null;
    }

    // Push element onto stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top; // link new node to previous top
        top = newNode;      // update top to new node
        System.out.println(value + " pushed to stack");
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        int poppedValue = top.data;
        top = top.next; // move top to next node
        return poppedValue;
    }

    // Peek at top element without removing
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print the stack
    public void printStack() {
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Stack_LinkedList stack = new Stack_LinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack(); // Stack: 30 → 20 → 10 → null

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top: " + stack.peek());   // 20
        stack.printStack(); // Stack: 20 → 10 → null
    }
}
