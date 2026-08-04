public class Employee
{
    private String name;
    private String position;
    private double salary;
    private int age;
    private String experience;

    // constructor
    public Employee(String name, String position, double salary, int age, String experience)
    {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    // display method
    public void display()
        {
            System.out.println("Name:" + name);
            System.out.println("Position:" + position);
            System.out.println("Salary:" + salary);
            System.out.println("Age:" + age);
            System.out.println("Experience:" + experience);
            System.out.println();
        }
}