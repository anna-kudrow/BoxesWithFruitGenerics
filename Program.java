package BoxesWithFruitGenerics;

//
//a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
//        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//        Можно сравнивать коробки с яблоками и апельсинами;
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//        g. Не забываем про метод добавления фрукта в коробку.

public class Program {
    public static void main(String[] args) {

        Box<Orange> box1 = new Box<Orange>();
        box1.add(new Orange());
        box1.add(new Orange());
        System.out.println(box1.getBoxWeight());


        Box<Apple> box2 = new Box<>();
        box2.add(new Apple());
        box2.add(new Apple());


        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());

        box2.moveFruit(box3);
        System.out.println(box2.getBoxWeight());


        System.out.println(box3.compare(box2));

    }
}
