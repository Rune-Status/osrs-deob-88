public class Def12 extends JagMap {
	public static CacheArch aClass94_1530;
	public static CacheArch aClass94_1533;
	public static CacheArch aClass94_1545;
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array1547;
	public int anInt1544 = -1;
	public int anInt1540 = -1;
	public static Class113 aClass113_1532 = new Class113(64);
	public static Class113 aClass113_1541 = new Class113(100);
	public int anInt1538 = -1;
	public boolean aBool1537 = false;
	public int anInt1531 = 5;
	public int anInt1542 = -1;
	public int anInt1543 = -1;
	public int anInt1548 = 99;
	public int anInt1546 = 2;
	public int[] anIntArray1529;
	int[] anIntArray1539;
	public int[] anIntArray1536;
	int[] anIntArray1535;
	public int[] anIntArray1534;

	Class124_Sub22_Sub19_Sub7 method738(final Class124_Sub22_Sub19_Sub7 var1, int var2, int var3) {
		var2 = anIntArray1536[var2];
		final Class124_Sub22_Sub17 var5 = Def3.method655(var2 >> 16);
		var2 &= '\uffff';
		if (var5 == null)
			return var1.method987(true);
		else {
			final Class124_Sub22_Sub19_Sub7 var4 = var1.method987(!var5.method829(var2));
			var3 &= 3;
			if (var3 == 1)
				var4.method995();
			else if (var3 == 2)
				var4.method1003();
			else if (var3 == 3)
				var4.method994();

			var4.method992(var5, var2);
			if (var3 == 1)
				var4.method994();
			else if (var3 == 2)
				var4.method1003();
			else if (var3 == 3)
				var4.method995();

			return var4;
		}
	}

	void method739(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readByteU();
			if (var2 == 0)
				return;

			method745(var1, var2);
		}
	}

	void method740() {
		if (anInt1544 == -1)
			if (anIntArray1539 != null)
				anInt1544 = 2;
			else
				anInt1544 = 0;

		if (anInt1540 == -1)
			if (null != anIntArray1539)
				anInt1540 = 2;
			else
				anInt1540 = 0;

	}

	public Class124_Sub22_Sub19_Sub7 method741(final Class124_Sub22_Sub19_Sub7 var1, int var2) {
		var2 = anIntArray1536[var2];
		final Class124_Sub22_Sub17 var3 = Def3.method655(var2 >> 16);
		var2 &= '\uffff';
		if (var3 == null)
			return var1.method987(true);
		else {
			final Class124_Sub22_Sub19_Sub7 var4 = var1.method987(!var3.method829(var2));
			var4.method992(var3, var2);
			return var4;
		}
	}

	public Class124_Sub22_Sub19_Sub7 method742(final Class124_Sub22_Sub19_Sub7 var1, int var2,
			final Def12 var3, int var4) {
		var2 = anIntArray1536[var2];
		final Class124_Sub22_Sub17 var7 = Def3.method655(var2 >> 16);
		var2 &= '\uffff';
		if (var7 == null)
			return var3.method741(var1, var4);
		else {
			var4 = var3.anIntArray1536[var4];
			final Class124_Sub22_Sub17 var5 = Def3.method655(var4 >> 16);
			var4 &= '\uffff';
			Class124_Sub22_Sub19_Sub7 var6;
			if (null == var5) {
				var6 = var1.method987(!var7.method829(var2));
				var6.method992(var7, var2);
				return var6;
			} else {
				var6 = var1.method987(!var7.method829(var2) & !var5.method829(var4));
				var6.method1005(var7, var2, var5, var4, anIntArray1539);
				return var6;
			}
		}
	}

	Class124_Sub22_Sub19_Sub7 method743(final Class124_Sub22_Sub19_Sub7 var1, int var2) {
		var2 = anIntArray1536[var2];
		final Class124_Sub22_Sub17 var4 = Def3.method655(var2 >> 16);
		var2 &= '\uffff';
		if (null == var4)
			return var1.method1004(true);
		else {
			final Class124_Sub22_Sub19_Sub7 var3 = var1.method1004(!var4.method829(var2));
			var3.method992(var4, var2);
			return var3;
		}
	}

	public Class124_Sub22_Sub19_Sub7 method744(final Class124_Sub22_Sub19_Sub7 var1, final int var2) {
		int var3 = anIntArray1536[var2];
		final Class124_Sub22_Sub17 var4 = Def3.method655(var3 >> 16);
		var3 &= '\uffff';
		if (null == var4)
			return var1.method987(true);
		else {
			Class124_Sub22_Sub17 var5 = null;
			int var6 = 0;
			if ((anIntArray1535 != null) && (var2 < anIntArray1535.length)) {
				var6 = anIntArray1535[var2];
				var5 = Def3.method655(var6 >> 16);
				var6 &= '\uffff';
			}

			Class124_Sub22_Sub19_Sub7 var7;
			if ((null != var5) && (var6 != '\uffff')) {
				var7 = var1.method987(!var4.method829(var3) & !var5.method829(var6));
				var7.method992(var4, var3);
				var7.method992(var5, var6);
				return var7;
			} else {
				var7 = var1.method987(!var4.method829(var3));
				var7.method992(var4, var3);
				return var7;
			}
		}
	}

	void method745(final RSBuf var1, final int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readShortU();
			anIntArray1529 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1529[var4] = var1.readShortU();

			anIntArray1536 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1536[var4] = var1.readShortU();

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1536[var4] += var1.readShortU() << 16;
		} else if (var2 == 2)
			anInt1538 = var1.readShortU();
		else if (var2 == 3) {
			var3 = var1.readByteU();
			anIntArray1539 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1539[var4] = var1.readByteU();

			anIntArray1539[var3] = 9999999;
		} else if (var2 == 4)
			aBool1537 = true;
		else if (var2 == 5)
			anInt1531 = var1.readByteU();
		else if (var2 == 6)
			anInt1542 = var1.readShortU();
		else if (var2 == 7)
			anInt1543 = var1.readShortU();
		else if (var2 == 8)
			anInt1548 = var1.readByteU();
		else if (var2 == 9)
			anInt1544 = var1.readByteU();
		else if (var2 == 10)
			anInt1540 = var1.readByteU();
		else if (var2 == 11)
			anInt1546 = var1.readByteU();
		else if (var2 == 12) {
			var3 = var1.readByteU();
			anIntArray1535 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1535[var4] = var1.readShortU();

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1535[var4] += var1.readShortU() << 16;
		} else if (var2 == 13) {
			var3 = var1.readByteU();
			anIntArray1534 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4)
				anIntArray1534[var4] = var1.readTri();
		}

	}

	public static void method746(final CacheArch var0) {
		Def1.aClass94_1365 = var0;
	}

	static final void method747(final int var0) {
		final short var1 = 256;
		Class4.anInt54 += 128 * var0;
		int var4;
		if (Class4.anInt54 > Class124_Sub22_Sub19_Sub1.anIntArray1661.length) {
			Class4.anInt54 -= Class124_Sub22_Sub19_Sub1.anIntArray1661.length;
			var4 = (int) (Math.random() * 12.0D);
			client.method761(Class4.aClass124_Sub22_Sub16_Sub2Array25[var4]);
		}

		var4 = 0;
		final int var9 = 128 * var0;
		final int var6 = 128 * (var1 - var0);

		int var3;
		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var3 = Class124_Sub10.anIntArray1032[var9 + var4]
					- ((Class124_Sub22_Sub19_Sub1.anIntArray1661[(var4 + Class4.anInt54)
							& (Class124_Sub22_Sub19_Sub1.anIntArray1661.length - 1)] * var0) / 6);
			if (var3 < 0)
				var3 = 0;

			Class124_Sub10.anIntArray1032[var4++] = var3;
		}

		int var2;
		int var5;
		for (var8 = var1 - var0; var8 < var1; ++var8) {
			var3 = var8 * 128;

			for (var2 = 0; var2 < 128; ++var2) {
				var5 = (int) (Math.random() * 100.0D);
				if ((var5 < 50) && (var2 > 10) && (var2 < 118))
					Class124_Sub10.anIntArray1032[var2 + var3] = 255;
				else
					Class124_Sub10.anIntArray1032[var3 + var2] = 0;
			}
		}

		if (Class4.anInt23 > 0)
			Class4.anInt23 -= var0 * 4;

		if (Class4.anInt26 > 0)
			Class4.anInt26 -= 4 * var0;

		if ((Class4.anInt23 == 0) && (Class4.anInt26 == 0)) {
			var8 = (int) (Math.random() * (2000 / var0));
			if (var8 == 0)
				Class4.anInt23 = 1024;

			if (var8 == 1)
				Class4.anInt26 = 1024;
		}

		for (var8 = 0; var8 < (var1 - var0); ++var8)
			Class4.anIntArray31[var8] = Class4.anIntArray31[var8 + var0];

		for (var8 = var1 - var0; var8 < var1; ++var8) {
			Class4.anIntArray31[var8] = (int) ((Math.sin(Class4.anInt49 / 14.0D) * 16.0D)
					+ (Math.sin(Class4.anInt49 / 15.0D) * 14.0D) + (Math.sin(Class4.anInt49 / 16.0D) * 12.0D));
			++Class4.anInt49;
		}

		Class4.anInt35 += var0;
		var8 = ((client.anInt2158 & 1) + var0) / 2;
		if (var8 > 0) {
			for (var3 = 0; var3 < (Class4.anInt35 * 100); ++var3) {
				var2 = (int) (Math.random() * 124.0D) + 2;
				var5 = (int) (Math.random() * 128.0D) + 128;
				Class124_Sub10.anIntArray1032[var2 + (var5 << 7)] = 192;
			}

			Class4.anInt35 = 0;

			int var7;
			for (var3 = 0; var3 < var1; ++var3) {
				var2 = 0;
				var5 = var3 * 128;

				for (var7 = -var8; var7 < 128; ++var7) {
					if ((var8 + var7) < 128)
						var2 += Class124_Sub10.anIntArray1032[var7 + var5 + var8];

					if ((var7 - (1 + var8)) >= 0)
						var2 -= Class124_Sub10.anIntArray1032[(var5 + var7) - (var8 + 1)];

					if (var7 >= 0)
						Class4.anIntArray34[var7 + var5] = var2 / (1 + (var8 * 2));
				}
			}

			for (var3 = 0; var3 < 128; ++var3) {
				var2 = 0;

				for (var5 = -var8; var5 < var1; ++var5) {
					var7 = var5 * 128;
					if ((var8 + var5) < var1)
						var2 += Class4.anIntArray34[(128 * var8) + var3 + var7];

					if ((var5 - (1 + var8)) >= 0)
						var2 -= Class4.anIntArray34[(var7 + var3) - ((var8 + 1) * 128)];

					if (var5 >= 0)
						Class124_Sub10.anIntArray1032[var7 + var3] = var2 / (1 + (2 * var8));
				}
			}
		}

	}
}
