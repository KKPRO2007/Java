package lab_sheet_3;

class Car {
    private String brand;
    private String model;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Experiment_2 {
    public static void main(String[] args) {
        Car c1 = new Car(); 
        Car c2 = new Car("Toyota", "Fortuner");

        c1.display();
        System.out.println();
        c2.display();
    }
}
