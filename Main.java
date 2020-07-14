import generics.*;

/**
 * @author Tegneryadnov_VI
 * @version 31
 * @Java Наследование дженерик классов
 */

public class Main {
    public static void main(String a[]) {
        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        // Следующая строка дает ошибку, т.к. подтип Cabbage, не унаследован от Fruit,
        // а коробка типизирована парой <String, T extends Fruit>
        //FruitBox<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());

        // Правильно:
        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}
