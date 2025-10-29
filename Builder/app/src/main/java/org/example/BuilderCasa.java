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
    public Builder setDoors(int doors) {
        this.door = doors;
        return this;
    }

    @Override
    public Builder setWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder setWindows(int windows) {
       this.window = windows;
       return this;
    }

    @Override
    public Builder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public Builder setHasPool(boolean hasPool) {
       this.hasPool = hasPool;
       return this;
    }

    @Override
    public Builder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public Casa build() {
        return new Casa(door, walls, window, hasGarden, hasPool, hasGarage);
    }
}
