package Decorator.exercicio1;

public class Main {
    public static void main(String[] args) {
        // string que vai se escrita
        String teste = "jessye123";

        // indicando onde ta onde ta o arquivo e criando o dataSource 
        DataSource source = new FileDataSource("saida.txt");

        System.out.println(source.readData());

        // Envolvendo com compressão e criptografia
        DataSource decorated = new CompressionDecorator( new EncryptionDecorator(source));

       decorated.writeData(teste);

        System.out.println("=== Dados salvos no arquivo ===");
        System.out.println(source.readData()); // Lê os dados brutos do arquivo

        System.out.println("=== Dados após ler com decodificação ===");
        System.out.println(decorated.readData()); // Lê os dados originais
    }
}
