package models;

public class Drake extends Enemy implements Flyable{
    public Drake(Double health, Integer posX, Integer posY) {
        super(health, posX, posY);
    }

    @Override @ExampleAnnotation
    public void fly() {
        //...
    }
}
