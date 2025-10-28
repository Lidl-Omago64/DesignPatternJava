package org.example;

import java.util.List;

public class NewStorageJson {
    public List<User> users;

    public void saveJson(List<User> users) {
        this.users = users;
        System.out.println("💾 [NewStorageJson] Dati salvati in formato JSON: " + users);
    }

    public List<User> loadJson() {
        System.out.println("📂 [NewStorageJson] Dati caricati da JSON: " + users);
        return users;
    }
}
