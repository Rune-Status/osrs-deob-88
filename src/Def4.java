public class Def4 extends JagMap {
	public static CacheArch aClass94_1561;
	public int anInt1552;
	public int anInt1562;
	public int anInt1560;
	public static Class113 aClass113_1553 = new Class113(64);
	public int anInt1554 = 0;
	public int anInt1555 = -1;
	public boolean aBool1556 = true;
	public int anInt1557 = -1;
	public int anInt1558;
	public int anInt1559;
	public int anInt1563;

	public void method755() {
		if (anInt1557 != -1) {
			method758(anInt1557);
			anInt1552 = anInt1558;
			anInt1562 = anInt1559;
			anInt1560 = anInt1563;
		}

		method758(anInt1554);
	}

	public void method756(final RSBuf var1, final int var2) {
		while (true) {
			final int var3 = var1.readByteU();
			if (var3 == 0)
				return;

			method757(var1, var3);
		}
	}

	void method757(final RSBuf var1, final int var2) {
		if (var2 == 1)
			anInt1554 = var1.readTri();
		else if (var2 == 2)
			anInt1555 = var1.readByteU();
		else if (var2 != 5) {
			if (var2 == 7)
				anInt1557 = var1.readTri();
			else if (var2 == 8)
				;
		} else
			aBool1556 = false;

	}

	void method758(final int var1) {
		final double var2 = ((var1 >> 16) & 255) / 256.0D;
		final double var10 = ((var1 >> 8) & 255) / 256.0D;
		final double var6 = (var1 & 255) / 256.0D;
		double var8 = var2;
		if (var10 < var2)
			var8 = var10;

		if (var6 < var8)
			var8 = var6;

		double var12 = var2;
		if (var10 > var2)
			var12 = var10;

		if (var6 > var12)
			var12 = var6;

		double var14 = 0.0D;
		double var4 = 0.0D;
		final double var16 = (var8 + var12) / 2.0D;
		if (var12 != var8) {
			if (var16 < 0.5D)
				var4 = (var12 - var8) / (var12 + var8);

			if (var16 >= 0.5D)
				var4 = (var12 - var8) / (2.0D - var12 - var8);

			if (var12 == var2)
				var14 = (var10 - var6) / (var12 - var8);
			else if (var10 == var12)
				var14 = 2.0D + ((var6 - var2) / (var12 - var8));
			else if (var12 == var6)
				var14 = 4.0D + ((var2 - var10) / (var12 - var8));
		}

		var14 /= 6.0D;
		anInt1558 = (int) (var14 * 256.0D);
		anInt1559 = (int) (var4 * 256.0D);
		anInt1563 = (int) (var16 * 256.0D);
		if (anInt1559 < 0)
			anInt1559 = 0;
		else if (anInt1559 > 255)
			anInt1559 = 255;

		if (anInt1563 < 0)
			anInt1563 = 0;
		else if (anInt1563 > 255)
			anInt1563 = 255;

	}
}
