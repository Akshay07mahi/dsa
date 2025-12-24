
public class Main {
    static int[] arr = new int[10];
    static int front = -1;
    static int rear = -1;

    public static boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[rear] = data;
            return true;
        }

        rear = (rear + 1) % 10;
        arr[rear] = data;
        return true;
    }

    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        int val = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % 10;
        }

        return val;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return arr[front];
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return !isEmpty() && ((rear + 1) % 10 == front);
    }

    public static int size() {
        if (isEmpty()) return 0;
        if (rear >= front) return rear - front + 1;
        return (10 - front) + (rear + 1);
    }

    public static void showAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements (front -> rear): ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showAll();
        enqueue(3);
        enqueue(5);
        enqueue(7);
        showAll(); 

        System.out.println("Dequeued: " + dequeue()); 
        showAll(); 

        System.out.println("Peek: " + peek()); 
        System.out.println("Size: " + size());

        for (int i = 0; i < 10; i++) enqueue(i * 10);
        showAll();
        System.out.println("Is Full: " + isFull());
    }
}
