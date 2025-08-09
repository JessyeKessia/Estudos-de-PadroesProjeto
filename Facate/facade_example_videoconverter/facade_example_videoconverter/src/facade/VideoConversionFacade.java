package facade;

import java.io.File;

import media.library.AudioMixer;
import media.library.BitrateReader;
import media.library.Codec;
import media.library.CodecFactory;
import media.library.MPEG4CompressionCodec;
import media.library.OggCompressionCodec;
import media.library.VideoFile;

public class VideoConversionFacade {
	
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        // Lendo a quantidade informação digital do video, por segundo
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        // convertendo para o novo formato os dados digitais lidos anteriormente, para o code específico
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
    
}
