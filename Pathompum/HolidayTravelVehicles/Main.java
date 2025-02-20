package HolidayTravelVehicles;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle("VIN12345", "New Car", "Sedan", 2023, "Toyota", 25000);
        TradeInVehicle tv = new TradeInVehicle("TIV98765", "Old Car", "Hatchback", 2010, "Honda", 8000, 15); 
        System.out.println(v + "\n" + tv);
    }
}