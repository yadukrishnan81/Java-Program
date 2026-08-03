public class Sportscar
{
    public static void main(String[] args)
    {
        Vehicle car1 = new Vehicle(
                "Porsche 911",
                "Porsche",
                911,
                "Grey",
                250000
        );

        Vehicle car2 = new Vehicle(
                "Ferrari F8",
                "Ferrari",
                2023,
                "Red",
                350000
        );

        System.out.println("- CAR 1 -");
        car1.display();

        System.out.println("- CAR 2 -");
        car2.display();
    }
}