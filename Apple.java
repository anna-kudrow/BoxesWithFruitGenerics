package BoxesWithFruitGenerics;

public class Apple extends Fruit{
    private String name = "apple";

    public Apple() {
        super(1.0f);
        this.name = "apple";
    }



    @Override
    public String toString() {
        return name;
    }
}
