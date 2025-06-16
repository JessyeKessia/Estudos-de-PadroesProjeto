package AbstractFactory.Exercicio2;

public class Main {
    public static void main(String[] args) {
        EmpresaFactory appleFactory = new AppleFactory();
        SmartPhone applePhone = appleFactory.createSmartPhone();
        Tablet appleTablet = appleFactory.createTablet();
        Earphone airpods = appleFactory.createEarphone();

        applePhone.installSO();
        applePhone.initialize();
        airpods.autonomia();

        EmpresaFactory samsungFactory = new SamsungFactory();
        SmartPhone samsungPhone = samsungFactory.createSmartPhone();
        Tablet samsungTablet = samsungFactory.createTablet();
        Earphone galaxyBuds = samsungFactory.createEarphone();

        samsungPhone.installSO();
        samsungPhone.initialize();
        airpods.autonomia();
    }
}
