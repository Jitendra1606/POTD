//we implemented it using circular queue
class myQueue {

    private int[] arr;
    private int start;
    private int end;
    private int size;
    private int capacity;

    public myQueue(int n) {
        arr = new int[n];
        capacity = n;
        start = 0;
        end = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int x) {
        if (isFull()) {
            return;
        }
        end = (end + 1) % capacity;
        arr[end] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        start = (start + 1) % capacity;
        size--;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[start];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[end];
    }
}
