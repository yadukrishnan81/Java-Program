public class Employee
{
    private String name;
    private String position;
    private double salary;
    private int age;
    private String experience;

    // Constructor
    public Employee(String name, String position, double salary, int age, String experience)
    {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    // Normal display method
    public void display()
    {
        System.out.println("Name       : " + name);
        System.out.println("Position   : " + position);
        System.out.println("Salary     : " + salary);
        System.out.println("Age        : " + age);
        System.out.println("Experience : " + experience);
        System.out.println();
    }

    // Method Overloading - 1 parameter
    public double display(double salary)
    {
        return salary * 12;
    }

    // Method Overloading - 2 parameters
    public double display(double salary, int bonus)
    {
        return (salary * 12) + bonus;
    }

    // Method Overloading - different parameter types
    public void display(String name, int age)
    {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}