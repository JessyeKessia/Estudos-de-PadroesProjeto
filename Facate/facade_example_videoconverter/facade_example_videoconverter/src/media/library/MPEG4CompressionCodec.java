package media.library;

public class MPEG4CompressionCodec implements Codec {
    private String type = "mp4";
	@Override
	public String getType() {
		return type;
	}
	
	public String toString() {
		return this.type;
	}

}
