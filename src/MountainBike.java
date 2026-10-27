public class MountainBike extends Bike implements MountainParts{

    // Attributes
    private String suspension;
    private String type;
    private int frameSize;

    // Main Constructor
    public MountainBike(String handleBars, String frame, String tyres, String seatType, int NumGears, String make, String suspension, String type, int frameSize){
        super(handleBars, frame, tyres, seatType, NumGears, make);

        this.suspension = suspension;
        this.type = type;
        this.frameSize = frameSize;
    }

    // Secondary Constructor
    public MountainBike(){

        super();

        this.suspension = "None";
        this.type = "None";
        this.frameSize = 0;
    }

    // Methods
    @Override
    public void printDescription() {
        super.printDescription();

        System.out.println("Suspension: " + suspension);
        System.out.println("Type: " + type);
        System.out.println("Frame size: " + frameSize);
    }

    // Methods (implemented from MountainParts interface)
    @Override
    public String getSuspension() {
        return "";
    }

    @Override
    public void setSuspension(String newValue) {

    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public void setType(String newValue) {

    }
}
