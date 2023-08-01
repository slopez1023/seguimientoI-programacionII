package Enums;

import java.util.Arrays;

public enum PC {
    BOOKS("Libros"),
    BABY("Bebé"),
    TOYS("Juguetes");

    private final String value;

    public String getValue() {
        return value;
    }

    PC(String value) {
        this.value = value;
    }

    public static PC fromValue(String value) {
        return Arrays.stream(PC.values())
                .filter(e->e.getValue().equalsIgnoreCase(value))
                .findAny()
                .orElseThrow(()->new RuntimeException("Category not found"));

    }


}
