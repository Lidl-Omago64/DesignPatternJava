package org.example;

import java.util.List;

public class OldStorageXml {
    public List<User> users;

    public void saveXml(List<User> users) {
        this.users = users;
        System.out.println("💾 [OldStorageXml] Dati salvati in formato XML: " + users);
    }

    public List<User> loadXml() {
        System.out.println("📂 [OldStorageXml] Dati caricati da XML: " + users);
        return users;
    }
}
