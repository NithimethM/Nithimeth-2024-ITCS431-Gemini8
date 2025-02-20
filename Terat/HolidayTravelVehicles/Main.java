public class Main {
    public static void main(String[] args) {
        
        Vehicle my_Vehicle = new Vehicle("BEAM999","BEAM CAR","GTR-R34",1999,"Nissan",100000);
        TradeInVehicle my_TradeInVehicle = new TradeInVehicle("AOM333","AOM CAR","Supra",1998,"Toyota",100000,35000);
        System.out.print(my_Vehicle.display());
        System.out.println("\n==========\n");
        System.out.print(my_TradeInVehicle.display());
    }
}
