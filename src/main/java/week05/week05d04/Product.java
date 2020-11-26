package week05.week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate bestBefore;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        this.bestBefore = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }
}
