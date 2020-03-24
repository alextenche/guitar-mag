import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Object> inventory;

    public Inventory() {
        inventory = new LinkedList<Object>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {

        Object instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }

    public Object get(String serialNumber) {
        for (Object instrumentObject : inventory) {
            if (instrumentObject instanceof Guitar) {
                if (((Guitar) instrumentObject).getSerialNumber().equals(serialNumber)) {
                    return instrumentObject;
                }
            }
            if (instrumentObject instanceof Mandolin) {
                if (((Mandolin) instrumentObject).getSerialNumber().equals(serialNumber)) {
                    return instrumentObject;
                }
            }
        }
        return null;
    }

    public List<Object> search(GuitarSpec searchSpec) {
        List<Object> matchingGuitars = new LinkedList<Object>();
        for (Object object : inventory) {
            Guitar guitar = (Guitar) object;
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Object> search(MandolinSpec searchSpec) {
        List<Object> matchingMandolins = new LinkedList<Object>();
        for (Object object : inventory) {
            Mandolin mandolin = (Mandolin) object;
            if (mandolin.getSpec().matches(searchSpec))
                matchingMandolins.add(mandolin);
        }
        return matchingMandolins;
    }

}
