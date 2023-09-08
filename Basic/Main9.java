public class Main9 {


    int pop;
    int capacity;
    int[] stack;
    int top;

    Main() {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;

    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        return stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int peak() {
        return stack[top];
    }

    public boolean display() {
        for (int i : stack) {
            System.out.println(i);
        }
        return true;
    }

    public static void main(String[] args) {
        Main9 r = new Main9();
        r.push(10);
        r.push(20);
        r.push(30);
        r.push(40);
       System.out.println(r.isEmpty());
        System.out.println(r.isFull());
        System.out.println(r.display());

         System.out.println(r.capacity);
         System.out.println(r.peak());
         System.out.println(r.pop());


    }
}
