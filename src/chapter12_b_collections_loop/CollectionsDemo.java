package chapter12_b_collections_loop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        //listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]
        //loop for collection with iterator provided by collection interface
        // this work for any collection
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println("while  " + i.next());
        }

        //for loop need to specify Set<String>
        for (String item : fruit) {
            System.out.println("for  " + item);
        }

        //for each loop
        fruit.forEach(element -> System.out.println("foreach  " + element));

        //same as above
        //fruit.forEach(System.out::println);


    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.size()); //4
//        System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}

//        System.out.println(fruitCalories.get("lemon")); //17
//        System.out.println(fruitCalories.entrySet()); //[banana=105, orange=45...]

//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories); //{banana=105, apple=95, lemon=17}

        for (var entry : fruitCalories.entrySet()) {
            System.out.println("Map  " + entry.getValue());
        }

        fruitCalories.forEach((key, value) -> System.out.println
                ("Fruit: " + key + " calories " + value));
    }
}
