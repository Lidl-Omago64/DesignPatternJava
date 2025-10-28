package FactoryMethod;

public class CreatorShip extends Creator{
    public CreatorShip() {

    }

    @Override
    public Product createProduct() {
        return new Ship();
    }
}
