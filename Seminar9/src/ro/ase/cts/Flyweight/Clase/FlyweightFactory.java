package ro.ase.cts.Flyweight.Clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> factory;

    public FlyweightFactory() {
        this.factory = new HashMap<>();
    }

    public Flyweight getFactory(String nrTelefon) {
        if (factory.containsKey(nrTelefon)) {
            return factory.get(nrTelefon);
        } else {
            Client client = new Client("-", nrTelefon, "-");
            factory.put(nrTelefon, client);
            return client;
        }
    }
}
