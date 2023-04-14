package ss11_dsa_stack_queue.practice;

import java.util.Arrays;

public class ImplementStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public ImplementStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return "ImplementStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
