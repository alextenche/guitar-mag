import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List matchingGuitars = new ArrayList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();

            // Ignore serial number since that’s unique
            // Ignore price since that’s unique
            Builder builder = searchGuitar.getBuilder();
            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
                continue;

            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }

            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue;
            }

            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
