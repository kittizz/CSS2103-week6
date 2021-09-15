public class StackQustion {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(3);
        s.push(7);
        s.push(2);
        s.push(3);
        s.push(5);

        while (!s.isEmpty()) {
            int item = s.pop();
            System.out.print(item + " ");
        }
    }
}

class Stack {
    private int[] stackData;
    private int stackTop;

    public Stack(int size) {
        stackData = new int[size];
        stackTop = -1;
    }

    public void push(int item) {

        // stackTop = stackTop + 1;
        // stackData[stackTop] = item;

        //
        stackData[++stackTop] = item;
    }

    public int pop() {
        // stackTop = stackTop - 1;
        // return stackData[stackTop];
        //
        return stackData[stackTop--];
    }

    public boolean isEmpty() {
        return (stackTop == -1);
    }
}