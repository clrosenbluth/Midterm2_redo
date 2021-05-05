package CarpetComp;

public enum Type {
    Plush("Plush"),
    Velvet("Velvet"),
    Shag("Shag"),
    Pattern("Pattern");

    private final String typeName;

    private Type(String typeName) {
        this.typeName = typeName;
    }

    public String toString() {
        return this.typeName;
    }

}
