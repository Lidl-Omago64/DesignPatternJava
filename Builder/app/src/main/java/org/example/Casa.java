package org.example;

public class Casa {
    private final int door;
    private final int walls;
    private final int window;
    private final boolean hasGarden;
    private final boolean hasPool;
    private final boolean hasGarage;


    public Casa(int door, int walls, int window, boolean hasGarden, boolean hasPool, boolean hasGarage) {
        this.door = door;
        this.walls = walls;
        this.window = window;
        this.hasGarden = hasGarden;
        this.hasPool = hasPool;
        this.hasGarage = hasGarage;
    }


    public int getDoor(){
        return door;
    }


    public int getWalls(){
        return walls;
    }


    public int getWindow(){
        return window;
    }


    public boolean getHasGarden(){
        return hasGarden;
    }



    public boolean getHasPool(){
        return hasPool;
    }



    public boolean getHasGarage(){
        return hasGarage;
    }


    /**
     * To String
     */
    @Override
    public String toString() {
        return "Casa{" +
                "door=" + door +
                ", walls=" + walls +
                ", window=" + window +
                ", hasGarden=" + hasGarden +
                ", hasPool=" + hasPool +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
