import java.io.Serializable;
public class VideoGameStation implements InterfaceVideoGameStation, Serializable, Comparable<VideoGameStation> {

    //Qno.1: Variables declaration 
        String gameStation;
        String videoGame;
        String customerName;
        String customerType;
        String bookingDate;
        int timeDuration;
        int hourlyRate;
        boolean availableStatus; 
   
    //Qno.2: creating the constructors
    public VideoGameStation(String gameStation,String videoGame,int hourlyRate){
        this.gameStation=gameStation;
        this.videoGame=videoGame;
        this.hourlyRate=hourlyRate;
        this.customerName="";
        this.customerType="";
        this.bookingDate="";
        this.timeDuration=0;
        this.availableStatus=true;
    }
    //Qno.3: By using the getter method to return the values
    @Override
    public String getGameStation(){
        return gameStation;
    }  
    
    @Override
    public String getVideoGame(){
        return videoGame;
    }
    
    @Override
    public int getHourlyRate(){
        return hourlyRate;
    }
    
    @Override
    public String getCustomerName(){
        return customerName;
    }
    
    @Override
    public String getCustomerType(){
        return customerType;
    }
    
    @Override
    public String getBookingDate(){
        return bookingDate;
    }
    
    @Override
    public int getTimeDuration(){
        return timeDuration;
    }
    
    @Override
    public boolean getAvailableStatus(){
        return availableStatus;
    }
    //Qno.4: By using the setter method to set values
    @Override
     public void setHourlyRate(int hourlyRate){ 
         this.hourlyRate=hourlyRate; 
        } 
    
    @Override
     public void setCustomerType(String customertype){ 
         this.customerType=customerType; 
        } 
    
    //Qno.5: Bookinng method
    @Override
    public void booking(String customerName,String customerType,String bookingDate,int timeDuration, boolean availableStatus){
        if(availableStatus==true){
            this.customerName=customerName;
            this.customerType=customerType;
            this.bookingDate=bookingDate;
            this.timeDuration=timeDuration;
            this.availableStatus=true;

         }
        else{
            System.out.println("Sorry! The game is currently unavailable on:"+bookingDate +"please visit next time");
            System.out.println("The gamestation is available after 2 hours ");
        }
    }
    //Qno.6: Scenario of the game station     
    @Override
    public void scenario(){
        if(availableStatus==true){
            this.customerName="";
            this.customerType="";
            this.bookingDate="";
            this.timeDuration=0;
            this.availableStatus=false;
        }
        else{
            System.out.println("The gamestation is available. ");
        }
    }
    //Qno.7: To provide the details about the game station
    @Override
    public void details(){
         
         System.out.println("The description of the game station you booked: "+getGameStation());
         System.out.println("The hourly rate of the game station:" +getHourlyRate());
    }
    
    
    @Override
    public int compareTo(VideoGameStation vgs) {
        int res = 0;
        int result1 = this.customerName.compareToIgnoreCase(vgs.customerName);
        int result2 = this.customerType.compareToIgnoreCase(vgs.customerType);
        if (result1 != 0) {
            res = result1;
        } else if (result2 != 0) {
            res = result2;
        }
        return res;
    }
  }