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
public class VRControllerAxis_t extends Structure<VRControllerAxis_t, VRControllerAxis_t.ByValue, VRControllerAxis_t.ByReference > {
	public float x;
	public float y;
	public VRControllerAxis_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("x", "y");
	}
	public VRControllerAxis_t(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public VRControllerAxis_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected VRControllerAxis_t newInstance() { return new VRControllerAxis_t(); }
	public static VRControllerAxis_t[] newArray(int arrayLength) {
		return Structure.newArray(VRControllerAxis_t.class, arrayLength);
	}
	public static class ByReference extends VRControllerAxis_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VRControllerAxis_t implements Structure.ByValue {
		
	};
}
