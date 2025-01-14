public enum Status {
    FINE("fine"),
    GOOD("good"),
    EXCELLENT("excellent"),
    BAD("bad");

    private final String description;

   Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
