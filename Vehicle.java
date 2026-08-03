public class Vehicle
{
    String name;
    String brand;
    int model;
    String color;
    double price;

    // Parameterized Constructor
    public Vehicle(String name, String brand, int model, String color, double price)
    {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Display Method
    public void display()
    {
        System.out.println("Name  : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println();
    }
}