public interface BikeParts {
    public static final String COMPANY = "Trek";

    // Methods
    String getHandleBars();
    void setHandleBars(String newValue);

    String getFrame();
    void setFrame(String newValue);

    String getTyres();
    void setTyres(String newValue);

    String getSeatType();
    void setSeatType(String newValue);

    int getNumGears();
    void setNumGears(int newValue);

    String getMake();
    void setMake(String newValue);
}
