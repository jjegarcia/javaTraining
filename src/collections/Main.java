package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product glassWindow = new Product("Glass Window", 10);
        Collection<Product> products= new ArrayList<>(Arrays.asList(door,floorPanel,glassWindow));

        Iterator<Product> iterator= products.iterator(); //iterator os a cursor
        while (iterator.hasNext()){
            Product product=iterator.next();
            System.out.println(product);
            if (product.getWeight()>20) iterator.remove();
        }
        System.out.println("after inspection"+ products);
    }
}

