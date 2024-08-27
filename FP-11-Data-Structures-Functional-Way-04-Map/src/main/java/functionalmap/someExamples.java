package functionalmap;

import testingTarte.Product;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class someExamples {


    public static void main(String[] args) {

        Product product1 = new Product("1", "a", 123.05);
        Product product2 = new Product("2", "b", 121.15);
        Product product3 = new Product("3", "c", 125.20);
        Product product4 = new Product("4", "d", 120.21);
        Product product5 = new Product("5", "e", 127.23);
        Product product6 = new Product("6", "f", 130.22);
        Product product7 = new Product("7", "g", 129.24);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).getPrice());
        }

        sortProductListByPrice(productList);
        System.out.println("____________");

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).getPrice());
        }

        ArrayList<Product> discountedProductList = new ArrayList<>();
        for (int i = 0; i < productList.size()/2; i++) {
            discountedProductList.add(productList.get(i));
        }


    }

    public static  void sortProductListByPrice(List<Product> productList){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
    }


}
