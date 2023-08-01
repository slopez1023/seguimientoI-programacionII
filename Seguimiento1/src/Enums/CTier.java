package Enums;

import java.util.Arrays;

public enum CTier {
    TYPE1("Tier1"),
    TYPE2("Tier2"),
    TYPE3("Tier3");

    private final String valueClient;

    public String getValue() {
        return valueClient;
    }


    CTier(String valueClient) {
        this.valueClient = valueClient;
    }

    public static PC fromValueClient(String valueClient) {
        return Arrays.stream(PC.values())
                .filter(e->e.getValue().equalsIgnoreCase(valueClient))
                .findAny()
                .orElseThrow(()->new RuntimeException("Category not found"));

    }
}
