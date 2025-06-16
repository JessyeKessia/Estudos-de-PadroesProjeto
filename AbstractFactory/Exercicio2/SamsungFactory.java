package AbstractFactory.Exercicio2;

class SamsungFactory implements EmpresaFactory {
    public Tablet createTablet() {
        return new TabletSamsung();
    }
    public SmartPhone createSmartPhone() {
        return new SmartPhoneSamsung();
    }
    public Earphone createEarphone() {
        return new EarphoneSamsung();
    }
}
