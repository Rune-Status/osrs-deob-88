import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class66_Sub1 extends Class66 implements MouseWheelListener {
	int anInt1087 = 0;

	@Override
	public void method290(final Component var1, final byte var2) {
		var1.removeMouseWheelListener(this);
	}

	@Override
	public void method293(final Component var1, final byte var2) {
		var1.addMouseWheelListener(this);
	}

	@Override
	public synchronized void mouseWheelMoved(final MouseWheelEvent var1) {
		anInt1087 += var1.getWheelRotation();
	}

	@Override
	public synchronized int method292(final int var1) {
		final int var2 = anInt1087;
		anInt1087 = 0;
		return var2;
	}
}
