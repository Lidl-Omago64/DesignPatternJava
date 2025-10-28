package org.example;

public class Car implements Prototype{
    private String model;
    private String color;

    /**
     * Empty Constructor
     */
    public Car(){}

    public Car(Car template) {
        this.model = template.model;
        this.color = template.color;
    }

    /**
     * Clone the car
     * @return cloned car
     */
    @Override
    public Prototype clone(){
        return new Car(this);
    }


    /**
     * GET AND SETTER
     */
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    /**
     * ToString
     */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
