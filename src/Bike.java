public class Bike implements BikeParts{

    // Attributes
    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int NumGears;
    private String make;

    // Main Constructor
    public Bike(String handleBars, String frame, String tyres, String seatType, int NumGears, String make){

        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.NumGears = NumGears;
        this.make = make;
    }

    // Secondary Constructor
    public Bike(){

        this.handleBars = "None";
        this.frame = "None";
        this.tyres = "None";
        this.seatType = "None";
        this.NumGears = 0;
        this.make = "None";
    }

    // Methods
    public void printDescription() {
        System.out.println("Handlebars: " + handleBars);
        System.out.println("Frame: " + frame);
        System.out.println("Tyres: " + tyres);
        System.out.println("Seat type: " + seatType);
        System.out.println("Number of gears: " + NumGears);
        System.out.println("Make: " + make);
    }

    // Methods (implemented from BikeParts interface)
    public String getHandleBars() {
        return handleBars;
    }

    public void setHandleBars(String newValue) {
        this.handleBars = newValue;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String newValue) {
        this.frame = newValue;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String newValue) {
        this.tyres = newValue;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String newValue) {
        this.seatType = newValue;
    }

    public int getNumGears() {
        return NumGears;
    }

    public void setNumGears(int newValue) {
        this.NumGears = newValue;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newValue) {
        this.make = newValue;
    }
}

