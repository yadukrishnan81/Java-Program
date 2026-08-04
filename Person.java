public class Person
{
    public static void main(String[] args)
    {
        Employee person1 = new Employee(
             "Yadukrishnan Nair",
            "Graphic Designer",
            58000,
            26,
            "4 Years"
        );
        
        Employee person2 = new Employee(
            "Jayvir Baloliya",
            "Team Manager",
            60000,
            27,
            "6 Years"
        );

        Employee person3 = new Employee(
            "Jaival Panchal",
            "App Developer",
            59000,
            27,
            "5 Years"
        );

        Employee person4 = new Employee(
            "Sujal Darji",
            "QA Tester",
            57000,
            26,
            "4 Years"
        );

        Employee person5 = new Employee(
            "Yahya Kagdi",
            "Digital Marketing Executive",
            55000,
            26,
            "4 Years"
        );
        
        System.out.println("- Employee1 -");
        person1.display();
        
        System.out.println("- Employee2 -");
        person2.display();
        
        System.out.println("- Employee3 -");
        person3.display();
        
        System.out.println("- Employee4 -");
        person4.display();
        
        System.out.println("- Employee5 -");
        person5.display();
    }
}