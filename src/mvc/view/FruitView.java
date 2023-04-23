package mvc.view;

import mvc.controller.FruitController;

public class FruitView {
    public static void main(String[] args) {
        FruitController fruitController = new FruitController();
        fruitController.showMenuList();
    }
}
