package Decorator.exercicio1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class CompressionDecorator extends DataSourceDecorator {
    // Recebe um DataSource (como FileDataSource ou outro decorador).
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
        try {
            byte[] input = data.getBytes(StandardCharsets.UTF_8);

            Deflater deflater = new Deflater();
            deflater.setInput(input);
            deflater.finish();

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length);
            byte[] buffer = new byte[1024];
            while (!deflater.finished()) {
                int count = deflater.deflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            deflater.end();

            byte[] compressed = outputStream.toByteArray();

            // IMPORTANTE: converte os bytes binários para texto seguro com Base64
            String base64Compressed = Base64.getEncoder().encodeToString(compressed);

            super.writeData(base64Compressed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        try {
            // Ler a string (que contém Base64) e decodificar para os bytes comprimidos
            byte[] compressed = Base64.getDecoder().decode(super.readData());

            Inflater inflater = new Inflater();
            inflater.setInput(compressed);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(compressed.length);
            byte[] buffer = new byte[1024];
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            inflater.end();

            return new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
