package AbstractFactory.Exercicio2;

class AppleFactory implements EmpresaFactory {
    public Tablet createTablet() {
        return new TabletApple();
    }
    public SmartPhone createSmartPhone() {
        return new SmartPhoneApple();
    }
    public Earphone createEarphone() {
        return new EarphoneApple();
    }
}
