import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

public class Class81 implements MouseListener, MouseMotionListener, FocusListener {
	protected static int anInt662;
	public static volatile int anInt648 = 0;
	static volatile int anInt647 = 0;
	static volatile int anInt656 = 0;
	static volatile long aLong657 = 0L;
	static volatile int anInt654 = 0;
	public static volatile int anInt663 = 0;
	static volatile int anInt659 = -1;
	static volatile int anInt661 = -1;
	public static Class81 aClass81_649 = new Class81();
	public static int anInt651 = 0;
	public static int anInt652 = 0;
	public static int anInt653 = 0;
	public static int anInt650 = 0;
	public static int anInt658 = 0;
	public static int anInt655 = 0;
	public static long aLong660 = 0L;

	@Override
	public final synchronized void mousePressed(final MouseEvent var1) {
		if (aClass81_649 != null) {
			anInt648 = 0;
			anInt647 = var1.getX();
			anInt656 = var1.getY();
			aLong657 = Class74.method316(1298827605);
			if (var1.isAltDown()) {
				anInt654 = 4;
				anInt663 = 4;
			} else if (var1.isMetaDown()) {
				anInt654 = 2;
				anInt663 = 2;
			} else {
				anInt654 = 1;
				anInt663 = 1;
			}
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent var1) {
		if (null != aClass81_649) {
			anInt648 = 0;
			anInt663 = 0;
		}

		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final void mouseClicked(final MouseEvent var1) {
		if (var1.isPopupTrigger())
			var1.consume();

	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent var1) {
		if (null != aClass81_649) {
			anInt648 = 0;
			anInt659 = var1.getX();
			anInt661 = var1.getY();
		}

	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent var1) {
		if (null != aClass81_649) {
			anInt648 = 0;
			anInt659 = var1.getX();
			anInt661 = var1.getY();
		}

	}

	@Override
	public final void focusGained(final FocusEvent var1) {
	}

	@Override
	public final synchronized void focusLost(final FocusEvent var1) {
		if (null != aClass81_649)
			anInt663 = 0;

	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent var1) {
		if (aClass81_649 != null) {
			anInt648 = 0;
			anInt659 = var1.getX();
			anInt661 = var1.getY();
		}

	}

	@Override
	public final synchronized void mouseExited(final MouseEvent var1) {
		if (aClass81_649 != null) {
			anInt648 = 0;
			anInt659 = -1;
			anInt661 = -1;
		}

	}

	public static void method328(final boolean var0) {
		if (null != Class92.aClass78_732)
			try {
				final RSBuf var1 = new RSBuf(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeTrib(0);
				Class92.aClass78_732.method323(var1.backing, 0, 4);
			} catch (final IOException var4) {
				try {
					Class92.aClass78_732.method324();
				} catch (final Exception var3) {
					;
				}

				++Class92.anInt721;
				Class92.aClass78_732 = null;
			}
	}
}
