package lambdas;

import java.awt.*;
import java.beans.EventHandler;
import java.util.*;
import java.util.List;

public class Main {
    public    static     Set<String> superCycleSet = new TreeSet<>();
    public   static       List<String> myStoreList = new ArrayList<>(Arrays.asList("Bicycle", "Tricycle", "Scooter"));
    private static Map<String, Integer> prices = new TreeMap<>();
    static Thread thread1;
    static Thread thread2;

    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        items.forEach(item -> {
                    System.out.println(item);
                }
        );

        String[] words = {"bye", "hi", "adios", "hola", "aloha"};
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(Arrays.toString(words));

        myStoreList.forEach(i -> {
                    if (i.contains("cycle")) {
                        System.out.println("My Store item: " + i);
                        superCycleSet.add(i);
                    }
                }
        );
        superCycleSet.forEach(i -> System.out.println("Super Cycle item: " + i));


            prices.put("Apple", 1);
            prices.put("Avocado", 2);
            prices.put("Banana", 1);
            prices.put("Mango", 2);
            prices.put("Starfruit", 4);

            prices.forEach( (key,value) ->{
                System.out.println("Fruit:" + key+", $"+value);
                    }
            );

//        Button btn = new Button();
//        btn.("woo");
//        btn.setOnAction( event -> System.out.println("woo hoo"+ event.toString()));


        thread1 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread #1 is running");
            }
        });

        // Task 1
        thread2= new Thread(() -> System.out.println("Thread #2 is running"));

//    }

//    public void startThreads() {
        thread1.start();
        // Task 2
    thread2.start();

//    }
}


    public void printStoreInventory() {
        myStoreList.forEach(i -> System.out.println("My Store item: " + i));
    }

    public void collectCycleItems() {
        myStoreList.forEach(i -> {
                    if (i.contains("cycle")) System.out.println("My Store item: " + i);
                }
        );
    }

}
