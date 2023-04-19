package MVC.repository;

import MVC.model.Fruit;

import java.util.ArrayList;

public interface IFruitRepository {
    ArrayList<Fruit> getFruitList();

    void addFruit(Fruit fruit);

    void editFruitById(int index, Fruit fruit);

    void findNameFruitByName(String name);
}
