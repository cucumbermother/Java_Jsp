package exam05;

public class Ex01 {
    public static void main(String[] args) {
//        FruitBox<Apple> appleBox = new FruitBox<>(); // Apple, Grape, Fruit
        FruitBox<Fruit> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicer.make(appleBox); // [사과, 사과, 사과]

        FruitBox<Grape> grapeBox = new FruitBox<>(); // Apple, Grape, Fruit
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Juicer.make(grapeBox); // [포도, 포도, 포도]

        FruitBox<Toy> toyBox = new FruitBox<>();
//        Juicer.make(toyBox); // extends Fruit 때문에 못만듦


    }
}
