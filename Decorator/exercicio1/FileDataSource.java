package Decorator.exercicio1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// implementação contreta(É a cabeça, onde vai ser recebido o arquivo)
public class FileDataSource implements DataSource {
    
    private String filename; // guarda o nome ou caminho do arquivo no qual vamos ler/escrever os dados

    public FileDataSource(String filename){
        this.filename = filename; //Recebe o nome do arquivo ao criar o objeto

    }
    // função para escrita de alguma coisa no arquivo, como é só escrita, vai ser void, não retorna nada!!!!
    public void writeData(String data) {
        try (Writer writer = new FileWriter(filename)) { //abre o arquivo com o nome repassado,  por exemplo dados.txt ou bla/bla/arquivo.txt
            // Se o arquivo não existir, o FileWriter cria um arquivo novo com esse nome.
            writer.write(data); // Escreve o conteúdo recebido no arquivo.
        } catch (IOException e) { // caso dê um erro cai aqui e sobe o erro
            e.printStackTrace();
        }
    }
    // função para ler algo, como vai ser leitura, precisamos retornar o que leu!!!
    public String readData () {
        StringBuilder sb = new StringBuilder(); // função já programada feita para montar a string lida de forma eficiente
        try (Reader reader = new FileReader(filename)) { //Abre o arquivo para leitura
            int ch;
            while ((ch = reader.read()) != -1) { // Lê um caractere por vez e retorna -1 quando chega ao fim do arquivo
                sb.append((char) ch); // converte o número lido para caractere e adiciona à string.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString(); // Retorna todo o conteúdo lido como uma única string.
    }
}
