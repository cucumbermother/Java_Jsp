package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make2(appleBox); // Apple, Fruit, Object
        // [사과, 사과, 사과]

        FruitBox<Fruit> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make2(grapeBox);
        // [포도, 포도, 포도]
    }
}

