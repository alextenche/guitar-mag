import enums.Builder;
import enums.Type;
import enums.Wood;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private int numStrings;

    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder) return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) return false;
        if (type != otherSpec.type) return false;
        if (numStrings != otherSpec.numStrings) return false;
        if (backWood != otherSpec.backWood) return false;
        if (topWood != otherSpec.topWood) return false;

        return true;
    }
}
