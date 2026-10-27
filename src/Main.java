public class Main {

    static void main() {

        // Bike object b1
        Bike b1 = new Bike("Drop Handlebars", "Carbon Fibre", "Road Tyres", "Racing Seat", 18, "Trek");
        System.out.println("Bike");
        b1.printDescription();

        // Mountain Bike objects mb1
        MountainBike mb1 = new MountainBike("Flat Handlebars", "Aluminium", "Knobbly Tyres", "Comfort Seat", 21, "Trek", "Front Suspension", "Trail", 19);
        System.out.println("Mountain Bike");
        mb1.printDescription();

        // Road Bike objects rb1
        RoadBike rb1 = new RoadBike("Drop Handlebars", "Carbon Fibre", "Slim Road Tyres", "Racing Seat", 18, "Giant", 28, 900);
        System.out.println("Road Bike");
        rb1.printDescription();
    }
}
