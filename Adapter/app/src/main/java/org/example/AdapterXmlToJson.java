package org.example;

import java.util.List;

/**
 * Adapter che permette di usare OldStorageXml come se fosse un NewStorageJson.
 */
public class AdapterXmlToJson extends NewStorageJson {
    private final OldStorageXml oldStorageXml;

    public AdapterXmlToJson(OldStorageXml oldStorageXml) {
        this.oldStorageXml = oldStorageXml;
    }

    @Override
    public void saveJson(List<User> users) {
        System.out.println("🔁 [Adapter] Converto JSON → XML (simulazione)...");
        oldStorageXml.saveXml(users); // usa il vecchio metodo
    }

    @Override
    public List<User> loadJson() {
        System.out.println("🔁 [Adapter] Converto XML → JSON (simulazione)...");
        return oldStorageXml.loadXml(); // recupera i dati dal vecchio sistema
    }
}
