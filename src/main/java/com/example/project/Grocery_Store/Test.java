package com.example.project.Grocery_Store;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Product p0 = new Product("cereal", 5);
        Product p1 = new Product("milk", 10);
        Product p2 = new Product("bread", 1);
        Product p3 = new Product("frozen pizza", 4);
        Product p4 = new Product("ice cream", 0);
        Product p5 = new Product("spaghetti", 6);
        Product p6 = new Product("muffins", 0);
        Product p7 = new Product("apples", 3);

        Product[] initialList = new Product[]{p0, p1, p2, p3, p4, p5, p6, p7};
        GroceryStore store = new GroceryStore(initialList);

        ArrayList<String> shoppingList2 = new ArrayList<String>(Arrays.asList("cereal", "milk", "muffins", "apples"));
        boolean allItemsAvailable2 = store.checkAvailability(shoppingList2);


        System.out.println(" " + allItemsAvailable2 + " ");
    }
}