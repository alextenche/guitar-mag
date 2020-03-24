import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price, int numStrings) {
        GuitarSpec guitarSpec = new GuitarSpec(model, builder, type, backWood, topWood, numStrings);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Guitar guitar : guitars) {
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
