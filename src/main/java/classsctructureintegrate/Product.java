package classsctructureintegrate;

import java.util.Scanner;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int inc){
        this.price = getPrice()+inc;
    }

    public void decreasePrice(int dec){
        this.price = getPrice()-dec;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the product");
        String name = scanner.nextLine();
        System.out.println("What is the price of the product");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("Product: " + product.getName() + " has a price of" + product.getPrice());

        product.increasePrice(50);
        product.decreasePrice(20);

        System.out.println("Product: " + product.getName() + " has a new price of" + product.getPrice());



    }



}
