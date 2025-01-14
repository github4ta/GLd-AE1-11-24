package by.itacademy.belaya.time;

public enum TimeUnitFormatter {

    HOURS("час", "часа", "часов"),

    MINUTES("минута", "минуты", "минут"),

    SECONDS("секунда", "секунды", "секунд");

    private final String singularForm;
    private final String dualForm;
    private final String pluralForm;

    TimeUnitFormatter(String singularForm, String dualForm, String pluralForm) {
        this.singularForm = singularForm;
        this.dualForm = dualForm;
        this.pluralForm = pluralForm;
    }
}

