package org.example;

public interface Builder {

    void setDoors(int door);
    void setWalls(int walls);
    void setWindows(int windows);
    void setHasGarden(boolean hasGarden);
    void setHasPool(boolean hasPool);
    void setHasGarage(boolean hasGarage);

    // metodo finale che restituisce il prodotto finito
    Casa build();
}
