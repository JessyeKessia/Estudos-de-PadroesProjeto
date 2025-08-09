package Decorator.exercicio1;

// Essa classe implementa a interface DataSource para poder ser usada no lugar de qualquer DataSource real.
// É a base para todos os decoradores concretos (como EncryptionDecorator e CompressionDecorator).

public class DataSourceDecorator implements DataSource {
    protected DataSource wrappee; //É o objeto real que está sendo decorado (embrulhado).
    // O tipo é DataSource, ou seja, ele pode ser tanto um FileDataSource quanto outro decorador.

    public DataSourceDecorator(DataSource source) { // Recebe como parâmetro o objeto DataSource que vai ser decorado.
        this.wrappee = source; // Armazena ele no atributo wrappee.
    }

    public void writeData(String data) {
        wrappee.writeData(data); // Simplesmente passa a chamada para o objeto que está sendo decorado.
    }

    public String readData() {
        return wrappee.readData();
    }
}
