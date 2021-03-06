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
public class VREvent_Scroll_t extends Structure<VREvent_Scroll_t, VREvent_Scroll_t.ByValue, VREvent_Scroll_t.ByReference > {
	public float xdelta;
	public float ydelta;
	public int repeatCount;
	public VREvent_Scroll_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("xdelta", "ydelta", "repeatCount");
	}
	public VREvent_Scroll_t(float xdelta, float ydelta, int repeatCount) {
		super();
		this.xdelta = xdelta;
		this.ydelta = ydelta;
		this.repeatCount = repeatCount;
	}
	public VREvent_Scroll_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected VREvent_Scroll_t newInstance() { return new VREvent_Scroll_t(); }
	public static VREvent_Scroll_t[] newArray(int arrayLength) {
		return Structure.newArray(VREvent_Scroll_t.class, arrayLength);
	}
	public static class ByReference extends VREvent_Scroll_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_Scroll_t implements Structure.ByValue {
		
	};
}
