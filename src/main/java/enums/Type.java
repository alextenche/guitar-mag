package enums;

public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC:
                return "aqoustic";
            case ELECTRIC:
                return "electric";
            default:
                return "unspecified";
        }
    }
}
