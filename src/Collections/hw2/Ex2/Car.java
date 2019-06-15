package Collections.hw2.Ex2;

import java.util.Objects;

public abstract class Car {
    private String brend;
    private String model;
    private String colour;
    private Integer yearOfIssue;
    private Double cost;

    public Car(String brend, String model, String colour, Integer yearOfIssue, Double cost) {
        this.brend = brend;
        this.model = model;
        this.colour = colour;
        this.yearOfIssue = yearOfIssue;
        this.cost = cost;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brend.equals(car.brend) &&
                model.equals(car.model) &&
                colour.equals(car.colour) &&
                yearOfIssue.equals(car.yearOfIssue) &&
                cost.equals(car.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, model, colour, yearOfIssue, cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "Марка='" + brend + '\'' +
                ", Модель='" + model + '\'' +
                ", Цвет='" + colour + '\'' +
                ", Год выпуска=" + yearOfIssue +
                ", Цена=" + cost +
                '}';
    }
}
