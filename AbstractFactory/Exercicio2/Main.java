package AbstractFactory.Exercicio2;

public class Main {
    public static void main(String[] args) {
        // Injeta a empresa que vai ter os produtos, o estilo será definido aqui
        EmpresaFactory appleFactory = new AppleFactory();

        // cria os produtos, com bass nos métodos disponíveis na interface (retorna cada interface do produto dentro dos métodos)
        SmartPhone applePhone = appleFactory.createSmartPhone();
        Tablet appleTablet = appleFactory.createTablet();
        Earphone airpods = appleFactory.createEarphone();

        System.out.println("Inicializa o celular Iphone");
        // inicializa os o iphone com o sistema da apple
        applePhone.installSO();
        applePhone.initialize();

        System.out.println("Inicializa o ipad");
        // inicializa o tablet com o sistema da apple
        appleTablet.installSO();
        appleTablet.initialize();

        // roda a autonomia de tempo do airpoids
        airpods.autonomia();

         // Injeta a empresa que vai ter os produtos, o estilo será definido aqui
        EmpresaFactory samsungFactory = new SamsungFactory();

        SmartPhone samsungPhone = samsungFactory.createSmartPhone();
        Tablet samsungTablet = samsungFactory.createTablet();
        Earphone galaxyBuds = samsungFactory.createEarphone();

        // inicializa o telefone com o sistema da samsung
        System.out.println("Inicializa o celular da Apple");
        samsungPhone.installSO();
        samsungPhone.initialize();

        // inicializa o tablet com o sistema da samsung
        System.out.println("Inicializa o tablet da samsung");
        samsungTablet.initialize();
        samsungTablet.initialize();

        // roda a autonomia de tempo do airpoids
        galaxyBuds.autonomia();
    }
}
