//Qno.17: Interface for the class Game parlour

public interface InterfaceGameParlour {

    public void addNewVideoGameStation(String gameStation, String videoGame, int hourlyRate);

    public void removeVideoGameStation(int indexNo);

    public void bookVideoGameStation(int indexNo, String customerName, String customerType, String bookingDate, int timeduration, boolean availableStatus);

    public void makeVideoGameAvailable(int indexNo);

    public void listGameStation();

    public void searchTerm(String searchGameStation, int searchHourlyRate);

    public void displayAllDetails();

}