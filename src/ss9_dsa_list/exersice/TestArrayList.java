package ss9_dsa_list.exersice;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(13);
        arr.add(134);
        arr.add(132);
        arr.add(131);
        System.out.println(arr.toString());
        System.out.println(arr.get(2));
        arr.remove(134);
        System.out.println(arr.toString());
        arr.display();
    }
}
