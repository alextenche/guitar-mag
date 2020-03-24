import enums.Builder;
import enums.Type;
import enums.Wood;

public class GuitarSpec extends InstrumentSpec {

    private int numstrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numstrings) {
        super(builder, model, type, backWood, topWood);
        this.numstrings = numstrings;
    }

    public int getNumstrings() {
        return numstrings;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) return false;
        if (!(otherSpec instanceof GuitarSpec)) return false;
        GuitarSpec guitarSpec = (GuitarSpec) otherSpec;
        return numstrings == guitarSpec.getNumstrings();
    }
}
