package media.library;

public class OggCompressionCodec implements Codec {
    public String type = "ogg";
	@Override
	public String getType() {		
		return type;
	}
	
	public String toString() {
		return this.type;
	}

}
