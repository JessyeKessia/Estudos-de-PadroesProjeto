package media.library;

/**
 * BitRate: quantidade de informação digital por segundo em um vídeo
 * Um video em 4K de alta qualidade traz mais informações do que um video de baixa qualidade
 * É medida em bytes ou megabytes
 * @author alexs
 *
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file " + file.getName() + " using Codec " + codec );
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file " + buffer.getName().substring(0, buffer.getName().indexOf(".")) + " using Codec " + codec );
        return buffer;
    }
}
