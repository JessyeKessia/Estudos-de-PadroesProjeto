package Decorator.exercicio1;

import java.util.Base64;

// Aqui vamos alterar o comportamento de writeData e readData para adicionar criptografia.
public class EncryptionDecorator extends DataSourceDecorator {
    
    public EncryptionDecorator(DataSource source) {
        super(source); // Recebe um objeto DataSource (pode ser FileDataSource ou outro decorador).
    }

    public void writeData(String data) {
        String encrypted = Base64.getEncoder().encodeToString(data.getBytes());
        super.writeData(encrypted);
    }

    public String readData() {
        String data = super.readData();
        return new String(Base64.getDecoder().decode(data));
    }
}
