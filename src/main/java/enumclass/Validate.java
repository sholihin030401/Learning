package enumclass;

public enum Validate {
    ADMIN("Administrator"),
    USER("Users"),
    NONE("No Indentified");

    String description;

    Validate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
