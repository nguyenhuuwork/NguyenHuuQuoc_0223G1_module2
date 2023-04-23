package mvc.repository;

import mvc.model.Fruit;

import java.util.ArrayList;

public class FruitRepository implements IFruitRepository {
    public static ArrayList<Fruit> fruitList = new ArrayList<>();

    static {
        Fruit fruit1 = new Fruit(1, "Xoai Non", 10.5);
        Fruit fruit2 = new Fruit(2, "Coc non", 9.2);
        Fruit fruit3 = new Fruit(3, "Oi", 11.3);
        Fruit fruit4 = new Fruit(4, "Mia", 9.4);
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
    }

    @Override
    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    @Override
    public void editFruitById(int index, Fruit fruit) {
        fruitList.set(index, fruit);
    }

    @Override
    public void findNameFruitByName(String name) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getName().equals(name)) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(fruitList.get(index).toString());
        }else {
            System.out.println("k tìm thấy");
        }
    }
}
