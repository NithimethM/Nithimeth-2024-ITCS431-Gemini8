public class main {
    public static void main(String[] args) {
        Vehicle mazdaCar = new Vehicle(
            "Mazda3",    
            "Sedan",     
            2020,         
            "Mazda",      
            25000.00      
        );


        System.out.println("Vehicle Details:");
        mazdaCar.displayVehicleInfo();
    }
}
