package org.example;

public interface Builder {

    Builder setDoors(int door);
    Builder setWalls(int walls);
    Builder setWindows(int windows);
    Builder setHasGarden(boolean hasGarden);
    Builder setHasPool(boolean hasPool);
    Builder setHasGarage(boolean hasGarage);

    // metodo finale che restituisce il prodotto finito
    Casa build();
}
