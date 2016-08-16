public final class Class124_Sub11 extends Node {
	int anInt1035;
	int anInt1036;
	int anInt1037;
	int anInt1038;
	int anInt1039;
	int anInt1040;
	static int anInt1041;
	int anInt1042;
	int anInt1043;
	static int anInt1045;
	static int anInt1046;
	static Class94_Sub1 aClass94_Sub1_1047;
	int anInt1048;
	int anInt1049;
	static int anInt1051;
	int anInt1044 = 0;
	int anInt1050 = -1;

	public static Class124_Sub22_Sub16_Sub2[] method537(final Class94 var0, final String var1, final String var2) {
		final int var3 = var0.method376(var1);
		final int var6 = var0.method383(var3, var2);
		Class124_Sub22_Sub16_Sub2[] var7;
		if (!Def3.loaded(var0, var3, var6))
			var7 = null;
		else {
			final Class124_Sub22_Sub16_Sub2[] var9 = new Class124_Sub22_Sub16_Sub2[Class7.anInt73];

			for (int var5 = 0; var5 < Class7.anInt73; ++var5) {
				final Class124_Sub22_Sub16_Sub2 var4 = var9[var5] = new Class124_Sub22_Sub16_Sub2();
				var4.anInt1741 = Class7.anInt67;
				var4.anInt1743 = Class49.anInt486;
				var4.anInt1737 = Class7.anIntArray68[var5];
				var4.anInt1739 = Class7.anIntArray74[var5];
				var4.anInt1738 = Class7.anIntArray69[var5];
				var4.anInt1736 = Class7.anIntArray70[var5];
				var4.anIntArray1742 = Class7.anIntArray66;
				var4.aByteArray1740 = Class124_Sub22_Sub5.aByteArrayArray1384[var5];
			}

			Class124_Sub7.method522();
			var7 = var9;
		}

		return var7;
	}

	static final void method538(final int var0, final int var1) {
		if (client.anInt2171 == 2) {
			Class80.method327(client.anInt2008 + ((client.anInt2186 - Class9.anInt102) << 7),
					((client.anInt2144 - Class95.anInt762) << 7) + client.anInt2009, client.anInt2191 * 2);
			if ((client.anInt2085 > -1) && ((client.anInt2158 % 20) < 10))
				Def3.aClass124_Sub22_Sub16_Sub1Array1364[0].method907((var0 + client.anInt2085) - 12,
						(client.anInt2152 + var1) - 28);

		}
	}

	static final void method539(final int var0) {
		Widget.method630();

		for (Class124_Sub13 var2 = (Class124_Sub13) Class124_Sub13.aClass111_1069
				.method428(); null != var2; var2 = (Class124_Sub13) Class124_Sub13.aClass111_1069.method430())
			if (null != var2.aClass124_Sub22_Sub6_1070)
				var2.method540();

		final int var1 = Def6.method690(var0).anInt1374;
		if (var1 != 0) {
			final int var3 = Class91.anIntArray711[var0];
			if (var1 == 1) {
				if (var3 == 1) {
					Class124_Sub22_Sub16_Sub3.method983(0.9D);
					((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method176(0.9D);
				}

				if (var3 == 2) {
					Class124_Sub22_Sub16_Sub3.method983(0.8D);
					((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method176(0.8D);
				}

				if (var3 == 3) {
					Class124_Sub22_Sub16_Sub3.method983(0.7D);
					((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method176(0.7D);
				}

				if (var3 == 4) {
					Class124_Sub22_Sub16_Sub3.method983(0.6D);
					((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method176(0.6D);
				}

				Class124_Sub22_Sub10.aClass113_1463.method436();
			}

			if (var1 == 3) {
				short var4 = 0;
				if (var3 == 0)
					var4 = 255;

				if (var3 == 1)
					var4 = 192;

				if (var3 == 2)
					var4 = 128;

				if (var3 == 3)
					var4 = 64;

				if (var3 == 4)
					var4 = 0;

				if (client.anInt2219 != var4) {
					if ((client.anInt2219 == 0) && (client.anInt2220 != -1)) {
						Class2.method19(Class5.aClass94_Sub1_58, client.anInt2220, 0, var4, false);
						client.aBool2221 = false;
					} else if (var4 == 0) {
						Class38.method199();
						client.aBool2221 = false;
					} else
						Class69.method305(var4);

					client.anInt2219 = var4;
				}
			}

			if (var1 == 4) {
				if (var3 == 0)
					client.anInt2239 = 127;

				if (var3 == 1)
					client.anInt2239 = 96;

				if (var3 == 2)
					client.anInt2239 = 64;

				if (var3 == 3)
					client.anInt2239 = 32;

				if (var3 == 4)
					client.anInt2239 = 0;
			}

			if (var1 == 5)
				client.anInt2122 = var3;

			if (var1 == 6)
				client.anInt2131 = var3;

			if (var1 == 9)
				client.anInt2036 = var3;

			if (var1 == 10) {
				if (var3 == 0)
					client.anInt2206 = 127;

				if (var3 == 1)
					client.anInt2206 = 96;

				if (var3 == 2)
					client.anInt2206 = 64;

				if (var3 == 3)
					client.anInt2206 = 32;

				if (var3 == 4)
					client.anInt2206 = 0;
			}

			if (var1 == 17)
				client.anInt2150 = var3 & '\uffff';

			if (var1 == 18) {
				client.aClass34_2011 = (Class34) Class23.method158(Class45.method227((short) -21040), var3);
				if (null == client.aClass34_2011)
					client.aClass34_2011 = Class34.aClass34_368;
			}

			if (var1 == 19)
				if (var3 == -1)
					client.anInt2114 = -1;
				else
					client.anInt2114 = var3 & 2047;

		}
	}
}
