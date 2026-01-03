//this is internal working of stack how these functions work internally
class myStack {
    private int[] arr;
    private int top;
    private int capacity;

    public myStack(int n) {
        arr = new int[n];
        capacity = n;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int x) {
        if (isFull()) {
            return;
        }
        top = top + 1;
        arr[top] = x;
    }

    public void pop() {
        if (isEmpty()) {
            return;
        }
        top--;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}