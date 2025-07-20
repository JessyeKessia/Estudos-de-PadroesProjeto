// Simple factory para criar os carros brasileiros 
public class CarFactory {
    public static Vehicle createVehicle(String tipo) {
        switch (tipo.toLowerCase()) {
            case "toyota":
                return new Adapter(new ToyotaCross());
            case "onix":
                return new Adapter(new Onix()); 
            case "mclaren":
                return new McLaren();
            default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }      
    }
}
 