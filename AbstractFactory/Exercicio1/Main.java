package AbstractFactory.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sistema operacional: ");
        String os = scanner.nextLine();

        InterfaceFactory factory;

        if (os.contains("mac")) {
            factory = new MACFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.rederizacao();
    }
}
