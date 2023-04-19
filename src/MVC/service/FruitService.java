package MVC.service;

import MVC.model.Fruit;
import MVC.repository.FruitRepository;

import java.util.Scanner;

public class FruitService implements IFruitService {
    FruitRepository fruitRepository = new FruitRepository();

    @Override
    public void displayFruitList() {
        for (int i = 0; i < fruitRepository.getFruitList().size(); i++) {
            System.out.println(fruitRepository.getFruitList().get(i));
        }
    }

    @Override
    public void addFruit() {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        System.out.println("Mời bạn nhập id cho sản phẩm");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tên cho sản phẩm");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập giá cho sản phẩm");
        price = Double.parseDouble(sc.nextLine());
        Fruit fruit = new Fruit(id, name, price);
        fruitRepository.addFruit(fruit);
    }

    @Override
    public void editFruit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id cần tìm");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < fruitRepository.getFruitList().size(); i++) {
            if (fruitRepository.getFruitList().get(i).getId() == id) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Nhập id cần sửa");
            int idEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên sản phẩm");
            String name = sc.nextLine();
            System.out.println("Nhập giá sản phẩm");
            double price = Double.parseDouble(sc.nextLine());
            Fruit fruit = new Fruit(idEdit, name, price);
            fruitRepository.editFruitById(index, fruit);
        } else {
            System.out.println("Không có id trong danh sách sản phẩm");
        }
    }

    @Override
    public void findNameFruit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên trái cây cần tìm");
        String findName = sc.nextLine();
        fruitRepository.findNameFruitByName(findName);
    }
}
