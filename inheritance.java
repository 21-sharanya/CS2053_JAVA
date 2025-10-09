class Vehicle{
    String brand;
    int year;

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle{
    String model;

    Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }

    void display(){
        super.display();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car{
    int batteryCapacity;

    ElectricCar(String brand, int year, String model, int batteryCapacity){
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    void display(){
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " kwh");
    }
}

public class Lab_session_3 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar("Lucid", 2024, "Sapphire", 120);
        ec.display();
    }
}
