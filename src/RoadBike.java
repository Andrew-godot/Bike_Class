public class RoadBike extends Bike implements RoadParts{

    private int tyreWide;
    private int postHeight;

    // Main Constructor
    public RoadBike(String handleBars, String frame, String tyres, String seatType, int NumGears, String make, int tyreWide, int postHeight){
        super(handleBars, frame, tyres, seatType, NumGears, make);

        this.tyreWide = tyreWide;
        this.postHeight = postHeight;
    }

    // Secondary Constructor
    public RoadBike(){

        super();

        this.tyreWide = 0;
        this.postHeight = 0;
    }

    @Override
    public void printDescription() {
        super.printDescription();

        System.out.println("Tyre Wide: " + tyreWide);
        System.out.println("postHeight: " + postHeight);
    }

    // Methods (implemented from interface RoadBike)
    @Override
    public int getTyreWidth() {
        return 0;
    }

    @Override
    public void setTyreWidth(int NewValue) {

    }

    @Override
    public int getPostHeight() {
        return 0;
    }

    @Override
    public void setPostHeight(int newValue) {

    }
}
