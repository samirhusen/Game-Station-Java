//Qno.17:Interface for the class video game sation

public interface InterfaceVideoGameStation{
    
    public String getGameStation();
    
    public String getVideoGame();
    
    public int getHourlyRate();
    
    public String getCustomerName();
    
    public String getCustomerType();
    
    public String getBookingDate();
    
    public int getTimeDuration();
    
    public boolean getAvailableStatus();
    
    public void setHourlyRate(int hourlyRate);
    
    public void setCustomerType(String customertype);
    
    public void booking(String customerName,String customerType,String bookingDate,int timeDuration, boolean availableStatus);
    
    public void scenario();
    
    public void details();
    
    public int compareTo(VideoGameStation vgs);
    
}
