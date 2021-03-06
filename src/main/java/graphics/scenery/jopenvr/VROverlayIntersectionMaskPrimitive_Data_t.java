package graphics.scenery.jopenvr;
import com.ochafik.lang.jnaerator.runtime.Union;
import com.sun.jna.Pointer;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VROverlayIntersectionMaskPrimitive_Data_t extends Union<VROverlayIntersectionMaskPrimitive_Data_t, VROverlayIntersectionMaskPrimitive_Data_t.ByValue, VROverlayIntersectionMaskPrimitive_Data_t.ByReference > {
	public IntersectionMaskRectangle_t m_Rectangle;
	public IntersectionMaskCircle_t m_Circle;
	public VROverlayIntersectionMaskPrimitive_Data_t() {
		super();
	}
	public VROverlayIntersectionMaskPrimitive_Data_t(IntersectionMaskRectangle_t m_Rectangle) {
		super();
		this.m_Rectangle = m_Rectangle;
		setType(IntersectionMaskRectangle_t.class);
	}
	public VROverlayIntersectionMaskPrimitive_Data_t(IntersectionMaskCircle_t m_Circle) {
		super();
		this.m_Circle = m_Circle;
		setType(IntersectionMaskCircle_t.class);
	}
	public VROverlayIntersectionMaskPrimitive_Data_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected VROverlayIntersectionMaskPrimitive_Data_t newInstance() { return new VROverlayIntersectionMaskPrimitive_Data_t(); }
	public static VROverlayIntersectionMaskPrimitive_Data_t[] newArray(int arrayLength) {
		return Union.newArray(VROverlayIntersectionMaskPrimitive_Data_t.class, arrayLength);
	}
	public static class ByReference extends VROverlayIntersectionMaskPrimitive_Data_t implements com.ochafik.lang.jnaerator.runtime.Structure.ByReference {
		
	};
	public static class ByValue extends VROverlayIntersectionMaskPrimitive_Data_t implements com.ochafik.lang.jnaerator.runtime.Structure.ByValue {
		
	};
}
