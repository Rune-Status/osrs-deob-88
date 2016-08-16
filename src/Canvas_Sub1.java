import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	/**
	 *
	 */
	private static final long serialVersionUID = -7929114952321666214L;
	static CacheArch aClass94_1610;
	Component aComponent1611;

	@Override
	public final void paint(final Graphics var1) {
		aComponent1611.paint(var1);
	}

	@Override
	public final void update(final Graphics var1) {
		aComponent1611.update(var1);
	}

	Canvas_Sub1(final Component var1) {
		aComponent1611 = var1;
	}

	public static boolean method845(final int var0) {
		return ((var0 >> 31) & 1) != 0;
	}
}
