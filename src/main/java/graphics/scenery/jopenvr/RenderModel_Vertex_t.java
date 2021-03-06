package graphics.scenery.jopenvr;
import com.ochafik.lang.jnaerator.runtime.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class RenderModel_Vertex_t extends Structure<RenderModel_Vertex_t, RenderModel_Vertex_t.ByValue, RenderModel_Vertex_t.ByReference > {
	public HmdVector3_t vPosition;
	public HmdVector3_t vNormal;
	/** float[2] */
	public float[] rfTextureCoord = new float[2];
	public RenderModel_Vertex_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("vPosition", "vNormal", "rfTextureCoord");
	}
	public RenderModel_Vertex_t(HmdVector3_t vPosition, HmdVector3_t vNormal, float rfTextureCoord[]) {
		super();
		this.vPosition = vPosition;
		this.vNormal = vNormal;
		if ((rfTextureCoord.length != this.rfTextureCoord.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rfTextureCoord = rfTextureCoord;
	}
	public RenderModel_Vertex_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected RenderModel_Vertex_t newInstance() { return new RenderModel_Vertex_t(); }
	public static RenderModel_Vertex_t[] newArray(int arrayLength) {
		return Structure.newArray(RenderModel_Vertex_t.class, arrayLength);
	}
	public static class ByReference extends RenderModel_Vertex_t implements Structure.ByReference {
		
	};
	public static class ByValue extends RenderModel_Vertex_t implements Structure.ByValue {
		
	};
}
