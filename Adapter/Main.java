public class Main {
    public static void main(String[] args) {
        Vehicle carro1 = CarFactory.createVehicle("toyota");
        Vehicle carro2 = CarFactory.createVehicle("onix");

        System.out.println("Toyota Cross em MPH: " + carro1.getSpeed());
        System.out.println("Chevrolet Onix em MPH: " + carro2.getSpeed());
    }
}