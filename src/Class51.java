public class Class51 {
	protected static int anInt489;

	static final void method245(final Widget[] var0, final int var1) {
		for (final Widget element : var0) {
			final Widget var3 = element;
			if ((null != var3) && (var3.anInt1259 == var1)
					&& (!var3.aBool1152 || !Def4.method762(var3))) {
				if (var3.anInt1191 == 0) {
					if (!var3.aBool1152 && Def4.method762(var3)
							&& (Class31.aClass124_Sub17_335 != var3))
						continue;

					method245(var0, var3.anInt1284);
					if (var3.aClass124_Sub17Array1263 != null)
						method245(var3.aClass124_Sub17Array1263, var3.anInt1284);

					final Class124_Sub7 var6 = (Class124_Sub7) client.aClass107_2143.method409(var3.anInt1284);
					if (null != var6)
						Class124_Sub10.method536(var6.anInt1012);
				}

				if (var3.anInt1191 == 6) {
					int var4;
					if ((var3.anInt1222 != -1) || (var3.anInt1199 != -1)) {
						final boolean var5 = Class1.method13(var3);
						if (var5)
							var4 = var3.anInt1199;
						else
							var4 = var3.anInt1222;

						if (var4 != -1) {
							final Def12 var7 = Def15.method750(var4);

							for (var3.anInt1274 += client.anInt2111; var3.anInt1274 > var7.anIntArray1529[var3.anInt1273]; Class124_Sub22_Sub10
									.method723(var3)) {
								var3.anInt1274 -= var7.anIntArray1529[var3.anInt1273];
								++var3.anInt1273;
								if (var3.anInt1273 >= var7.anIntArray1536.length) {
									var3.anInt1273 -= var7.anInt1538;
									if ((var3.anInt1273 < 0) || (var3.anInt1273 >= var7.anIntArray1536.length))
										var3.anInt1273 = 0;
								}
							}
						}
					}

					if ((var3.anInt1207 != 0) && !var3.aBool1152) {
						int var8 = var3.anInt1207 >> 16;
						var4 = (var3.anInt1207 << 16) >> 16;
						var8 *= client.anInt2111;
						var4 *= client.anInt2111;
						var3.anInt1202 = (var3.anInt1202 + var8) & 2047;
						var3.anInt1203 = (var3.anInt1203 + var4) & 2047;
						Class124_Sub22_Sub10.method723(var3);
					}
				}
			}
		}

	}

	public static Class88[] method246() {
		return new Class88[] { Class88.aClass88_698, Class88.aClass88_697, Class88.aClass88_703, Class88.aClass88_699,
				Class88.aClass88_694, Class88.aClass88_696 };
	}

	static void method247() {
		for (int var0 = 0; var0 < client.anInt2124; ++var0) {
			final int var1 = client.anIntArray2127[var0];
			final boolean var2 = (var1 == 57) || (var1 == 58) || (var1 == 1007) || (var1 == 25) || (var1 == 30);
			if (var2) {
				if (var0 < (client.anInt2124 - 1))
					for (int var3 = var0; var3 < (client.anInt2124 - 1); ++var3) {
						client.aStringArray2129[var3] = client.aStringArray2129[var3 + 1];
						client.aStringArray2130[var3] = client.aStringArray2130[1 + var3];
						client.anIntArray2127[var3] = client.anIntArray2127[1 + var3];
						client.anIntArray2140[var3] = client.anIntArray2140[1 + var3];
						client.anIntArray2125[var3] = client.anIntArray2125[1 + var3];
						client.anIntArray2063[var3] = client.anIntArray2063[var3 + 1];
					}

				--client.anInt2124;
			}
		}

	}
}
