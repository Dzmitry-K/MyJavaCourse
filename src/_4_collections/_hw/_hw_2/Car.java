package _4_collections._hw._hw_2;

import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String model;
    private final Integer yearOfIssue;
    private final String type;
    private final Integer weight;

    public Car(String brand, String model, Integer yearOfIssue, String type, Integer weight) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.type = type;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public String getType() {
        return type;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car {\n " +
                "Марка = " + brand + '\'' +
                ",\n Модель = " + model + '\'' +
                ",\n Год выпуска = " + yearOfIssue +
                ",\n Тип = " + type + '\'' +
                ",\n Вес = " + weight +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) &&
                model.equals(car.model) &&
                yearOfIssue.equals(car.yearOfIssue) &&
                type.equals(car.type) &&
                weight.equals(car.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, type, weight);
    }
}
