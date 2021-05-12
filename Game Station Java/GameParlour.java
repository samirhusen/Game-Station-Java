/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//Qno.8
public class GameParlour implements InterfaceGameParlour {//GameParlorClass and interface

    ArrayList<VideoGameStation> list = new ArrayList<VideoGameStation>();
    VideoGameStation videoGameStation;
    
   
    //Qno.9: Creating methods with three parameters  
    @Override
    public void addNewVideoGameStation(String gameStation, String videoGame, int hourlyRate) {
        //check attribute
        videoGameStation = new VideoGameStation(gameStation, videoGame, hourlyRate);
        list.add(videoGameStation);
    }
    
    //Qno.10: Method to remove object from the array list
    @Override
    public void removeVideoGameStation(int indexNo) {
        if (indexNo >= 0 && list.size() > indexNo) {
            list.remove(indexNo);
        } else {
            System.out.println("The number that you entered is not valid at all");
            System.out.println("Please try enter the number again");

        }
    }
    
    //Qno.11: Methods for booking the game station.
    @Override
    public void bookVideoGameStation(int indexNo, String customerName, String customerType, String bookingDate, int timeduration, boolean availableStatus) {

        if (indexNo >= 0 && list.size() > indexNo) {
            videoGameStation = list.get(indexNo);
            videoGameStation.booking(customerName, customerType, bookingDate, timeduration, availableStatus);
            list.set(indexNo, videoGameStation);
        } else {
            System.out.println("The number that you entered is not valid at all");

        }
    }
    
    //Qno.12:Methods for making video game sation free.
    @Override
    public void makeVideoGameAvailable(int indexNo) {
        if (indexNo >= 0 && list.size() > indexNo) {
            videoGameStation = list.get(indexNo);
            videoGameStation.scenario();
            list.set(indexNo, videoGameStation);
        }
    }

    //Qno.13: Methods to list all the game station available at the moment.
    @Override
    public void listGameStation() {
        System.out.println("List of the video game station");
        for (VideoGameStation vgs : list) {
            
            //list all the game station available ath the moment.
            if (vgs.availableStatus) {
                System.out.println("Index no: " + list.indexOf(vgs));
                vgs.details();//details of the game 
                           
            }
        }
    }
    
    //Qno.14: Methods to search the list of objects of previous class which are available at the moment.
    @Override
    public void searchTerm(String searchGameStation, int searchHourlyRate) {
        boolean temp = false;
        for (VideoGameStation vgs : list) {
            if (vgs.getGameStation().equals(searchGameStation) && vgs.getHourlyRate() <= searchHourlyRate) {
                temp = true;
                vgs.details();
            }
        }
        if (temp == false) {
            System.out.println("The video game station that you are trying to seacrh for is not available at the moment");
        }
    }
    
    //Qno.15: Method to display the name of the customres and the names of the booked video game in ascending order.  
    @Override
    public void displayAllDetails() {
        Collections.sort(list);
        for (VideoGameStation vgs : list) {
            System.out.println("Customer Name: " + vgs.getCustomerName());
            System.out.println("Customer Type: " + vgs.getCustomerType());
            vgs.details();
            System.out.println("----------------------------------------------------------");

        }
    }
}
