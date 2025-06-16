package AbstractFactory.Exercicio2;

class TabletSamsung implements Tablet{
    public void installSO() {
        System.out.println("Instalando Systema operacional do Android, da Samsung.");
    }
    public void initialize () {
        System.out.println("Inicializando sistema operacional Android.");
    }
}
