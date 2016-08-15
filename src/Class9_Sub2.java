import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class9_Sub2 extends Class9 {
	Component aComponent991;

	@Override
	public final void method52(final Graphics var1, final int var2, final int var3, final byte var4) {
		var1.drawImage(anImage98, var2, var3, aComponent991);
	}

	@Override
	final void method51(final int var1, final int var2, final Component var3, final int var4) {
		anInt96 = var1;
		anInt99 = var2;
		anIntArray103 = new int[(var2 * var1) + 1];
		final DataBufferInt var5 = new DataBufferInt(anIntArray103, anIntArray103.length);
		final DirectColorModel var6 = new DirectColorModel(32, 16711680, '\uff00', 255);
		final WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(anInt96, anInt99),
				var5, (Point) null);
		anImage98 = new BufferedImage(var6, var7, false, new Hashtable());
		aComponent991 = var3;
		method54();
	}

	@Override
	public final void method53(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage98, 0, 0, aComponent991);
		var1.setClip(var7);
	}
}
