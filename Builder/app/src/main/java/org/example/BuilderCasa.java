package org.example;

import org.example.Builder;
import org.example.Casa;

public class BuilderCasa implements Builder {
    private  int door;
    private  int walls;
    private  int window;
    private  boolean hasGarden;
    private  boolean hasPool;
    private  boolean hasGarage;

    public BuilderCasa() {

    }


    @Override
    public void setDoors(int doors) {
        this.door = doors;
    }

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setWindows(int windows) {
       this.window = windows;
    }

    @Override
    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public void setHasPool(boolean hasPool) {
       this.hasPool = hasPool;
    }

    @Override
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Casa build() {
        return new Casa(door, walls, window, hasGarden, hasPool, hasGarage);
    }
}
