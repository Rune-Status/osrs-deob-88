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

	static final void method759() {
		final short var0 = 256;
		int var4;
		if (Class4.anInt23 > 0) {
			for (var4 = 0; var4 < 256; ++var4)
				if (Class4.anInt23 > 768)
					Class42.anIntArray427[var4] = Class8.method50(Class4.anIntArray46[var4],
							Class124_Sub7.anIntArray1013[var4], 1024 - Class4.anInt23);
				else if (Class4.anInt23 > 256)
					Class42.anIntArray427[var4] = Class124_Sub7.anIntArray1013[var4];
				else
					Class42.anIntArray427[var4] = Class8.method50(Class124_Sub7.anIntArray1013[var4],
							Class4.anIntArray46[var4], 256 - Class4.anInt23);
		} else if (Class4.anInt26 > 0) {
			for (var4 = 0; var4 < 256; ++var4)
				if (Class4.anInt26 <= 768) {
					if (Class4.anInt26 > 256)
						Class42.anIntArray427[var4] = Def5.anIntArray1453[var4];
					else
						Class42.anIntArray427[var4] = Class8.method50(Def5.anIntArray1453[var4],
								Class4.anIntArray46[var4], 256 - Class4.anInt26);
				} else
					Class42.anIntArray427[var4] = Class8.method50(Class4.anIntArray46[var4],
							Def5.anIntArray1453[var4], 1024 - Class4.anInt26);
		} else
			for (var4 = 0; var4 < 256; ++var4)
				Class42.anIntArray427[var4] = Class4.anIntArray46[var4];

		Class124_Sub22_Sub16.method764(Class4.anInt22, 9, 128 + Class4.anInt22, var0 + 7);
		Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
		Class124_Sub22_Sub16.method763();
		var4 = 0;
		int var1 = Class4.anInt22 + (Class64.aClass9_558.anInt96 * 9);

		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var9 = 1; var9 < (var0 - 1); ++var9) {
			var3 = ((var0 - var9) * Class4.anIntArray31[var9]) / var0;
			var2 = 22 + var3;
			if (var2 < 0)
				var2 = 0;

			var4 += var2;

			for (var6 = var2; var6 < 128; ++var6) {
				var7 = Class124_Sub10.anIntArray1032[var4++];
				if (var7 != 0) {
					var8 = var7;
					var10 = 256 - var7;
					var7 = Class42.anIntArray427[var7];
					var5 = Class64.aClass9_558.anIntArray103[var1];
					Class64.aClass9_558.anIntArray103[var1++] = ((((var8 * (var7 & 16711935))
							+ ((var5 & 16711935) * var10)) & -16711936)
							+ (((var10 * (var5 & '\uff00')) + ((var7 & '\uff00') * var8)) & 16711680)) >> 8;
				} else
					++var1;
			}

			var1 += (Class64.aClass9_558.anInt96 + var2) - 128;
		}

		Class124_Sub22_Sub16.method764((765 + Class4.anInt22) - 128, 9, 765 + Class4.anInt22, 7 + var0);
		Class4.aClass124_Sub22_Sub16_Sub1_27.method917(Class4.anInt22 + 382, 0);
		Class124_Sub22_Sub16.method763();
		var4 = 0;
		var1 = 637 + (Class64.aClass9_558.anInt96 * 9) + 24 + Class4.anInt22;

		for (var9 = 1; var9 < (var0 - 1); ++var9) {
			var3 = ((var0 - var9) * Class4.anIntArray31[var9]) / var0;
			var2 = 103 - var3;
			var1 += var3;

			for (var6 = 0; var6 < var2; ++var6) {
				var7 = Class124_Sub10.anIntArray1032[var4++];
				if (var7 != 0) {
					var8 = var7;
					var10 = 256 - var7;
					var7 = Class42.anIntArray427[var7];
					var5 = Class64.aClass9_558.anIntArray103[var1];
					Class64.aClass9_558.anIntArray103[var1++] = ((((var8 * (var7 & '\uff00'))
							+ ((var5 & '\uff00') * var10)) & 16711680)
							+ ((((var7 & 16711935) * var8) + ((var5 & 16711935) * var10)) & -16711936)) >> 8;
				} else
					++var1;
			}

			var4 += 128 - var2;
			var1 += Class64.aClass9_558.anInt96 - var2 - var3;
		}

	}

	static final void method760(final Class124_Sub7 var0, final boolean var1) {
		final int var2 = var0.anInt1012;
		final int var3 = (int) var0.aLong874;
		var0.method450();
		if (var1)
			Class124_Sub5.method512(var2, -963844083);

		for (Class124_Sub21 var4 = (Class124_Sub21) client.aClass107_2184
				.method411(); var4 != null; var4 = (Class124_Sub21) client.aClass107_2184.method413())
			if (var2 == ((var4.aLong874 >> 48) & 65535L))
				var4.method450();

		final Widget var5 = Class10.method55(var3);
		if (var5 != null)
			Class124_Sub22_Sub10.method723(var5);

		Class51.method247();
		if (client.anInt2142 != -1)
			Class3.method23(client.anInt2142, 1);

	}

	static final void method761(final Class124_Sub22_Sub16_Sub2 var0) {
		final short var1 = 256;

		int var3;
		for (var3 = 0; var3 < Class124_Sub22_Sub19_Sub1.anIntArray1661.length; ++var3)
			Class124_Sub22_Sub19_Sub1.anIntArray1661[var3] = 0;

		int var2;
		for (var3 = 0; var3 < 5000; ++var3) {
			var2 = (int) (Math.random() * 128.0D * var1);
			Class124_Sub22_Sub19_Sub1.anIntArray1661[var2] = (int) (Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var2 = 1; var2 < (var1 - 1); ++var2)
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var2 << 7) + var5;
					Class43.anIntArray432[var6] = (Class124_Sub22_Sub19_Sub1.anIntArray1661[128 + var6]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 - 128]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 - 1]
							+ Class124_Sub22_Sub19_Sub1.anIntArray1661[var6 + 1]) / 4;
				}

			final int[] var4 = Class124_Sub22_Sub19_Sub1.anIntArray1661;
			Class124_Sub22_Sub19_Sub1.anIntArray1661 = Class43.anIntArray432;
			Class43.anIntArray432 = var4;
		}

		if (var0 != null) {
			var3 = 0;

			for (var2 = 0; var2 < var0.anInt1736; ++var2)
				for (var5 = 0; var5 < var0.anInt1738; ++var5)
					if (var0.aByteArray1740[var3++] != 0) {
						var6 = var0.anInt1737 + 16 + var5;
						final int var7 = 16 + var2 + var0.anInt1739;
						final int var8 = (var7 << 7) + var6;
						Class124_Sub22_Sub19_Sub1.anIntArray1661[var8] = 0;
					}
		}

	}

	static boolean method762(final Widget var0) {
		if (client.aBool2021) {
			if (Class124_Sub22_Sub19_Sub6.method963(var0) != 0)
				return false;

			if (var0.anInt1191 == 0)
				return false;
		}

		return var0.aBool1173;
	}
}
