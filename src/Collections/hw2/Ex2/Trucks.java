package Collections.hw2.Ex2;

public class Trucks extends Car {
    @Override
    public String getBrend() {
        return super.getBrend();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Trucks(String brend, String model, String colour, Integer yearOfIssue, Double cost) {
        super(brend, model, colour, yearOfIssue, cost);


    }
}
