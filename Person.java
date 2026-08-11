public class Person
{
    public static void main(String[] args)
    {
        Employee person1 = new Employee(
            "Yadukrishnan Nair",
            "Full Stack Developer",
            78000,
            26,
            "5 Years"
        );

        Employee person2 = new Employee(
            "Jayvir Baloliya",
            "Front End Developer",
            75000,
            27,
            "6 Years"
        );

        Employee person3 = new Employee(
            "Jaival Panchal",
            "Back End Developer",
            79000,
            27,
            "6 Years"
        );

        Employee person4 = new Employee(
            "Sujal Darji",
            "QA Tester",
            77000,
            26,
            "5 Years"
        );

        Employee person5 = new Employee(
            "Yahya Kagdi",
            "Network Engineer",
            75000,
            26,
            "5 Years"
        );

        System.out.println("----- Employee 1 -----");
        person1.display();

        System.out.println("----- Employee 2 -----");
        person2.display();

        System.out.println("----- Employee 3 -----");
        person3.display();

        System.out.println("----- Employee 4 -----");
        person4.display();

        System.out.println("----- Employee 5 -----");
        person5.display();
                                                    
        // Method Overloading - display(String, int)
        person1.display("Yadukrishnan Nair", 26);

        // Method Overloading - display(double)
        double annualSalary = person1.display(78000);
        System.out.println("Annual Salary : " + annualSalary);

        // Method Overloading - display(double, int)
        double salaryWithBonus = person1.display(78000, 50000);
        System.out.println("Annual Salary + Bonus : " + salaryWithBonus);
System.out.println();

        person2.display("Jayvir Baloliya", 27);
        double annualSalary2 = person2.display(75000);
        System.out.println("Annual Salary : " + annualSalary2);
        double salaryWithBonus2 = person2.display(75000, 50000);
        System.out.println("Annual Salary + Bonus : " + salaryWithBonus2);
System.out.println();

        person3.display("Jaival Panchal", 27);
        double annualSalary3 = person3.display(79000);
        System.out.println("Annual Salary : " + annualSalary3);
        double salaryWithBonus3 = person3.display(79000, 50000);
        System.out.println("Annual Salary + Bonus : " + salaryWithBonus3);
System.out.println();

        person4.display("Sujal Darji", 26);
        double annualSalary4 = person4.display(77000);
        System.out.println("Annual Salary : " + annualSalary4);
        double salaryWithBonus4 = person4.display(77000, 50000);
        System.out.println("Annual Salary + Bonus : " + salaryWithBonus4);
System.out.println();

        person5.display("Yahya Kagdi", 26);
        double annualSalary5 = person5.display(75000);
        System.out.println("Annual Salary : " + annualSalary5);
        double salaryWithBonus5 = person5.display(75000, 50000);
        System.out.println("Annual Salary + Bonus : " + salaryWithBonus5);
    }
}