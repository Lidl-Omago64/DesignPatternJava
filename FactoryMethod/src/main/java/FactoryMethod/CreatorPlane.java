package FactoryMethod;

public class CreatorPlane extends Creator {

    public CreatorPlane() {
    }
    public Product createProduct() {
        return new Plane();
    }
}
