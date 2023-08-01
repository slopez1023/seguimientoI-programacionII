package Models;

import Enums.CTier;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private CTier tier;

    public Customer(Long id, String name, CTier tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CTier getTier() {
        return tier;
    }

    public void setTier(CTier tier) {
        this.tier = tier;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier;
    }
}
