package ss9_dsa_list.exersice;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 5;
    private Object[] element;

    public ArrayList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {element = new Object[capacity];
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E value) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size] = value;
        size++;
    }

    public E get(int index) {
        return (E) element[index];
    }

    public void remove(E e) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < element.length; i++) {
            if (element[i] == e) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = index; i < element.length - 1; i++) {
                element[i] = element[i + 1];
            }
        }
    }

    public void display() {
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }
}
