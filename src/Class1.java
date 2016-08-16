public class Class1 {
	static Class1 aClass1_4 = new Class1();
	static Class1 aClass1_2 = new Class1();
	static Class1 aClass1_3 = new Class1();
	static Class1 aClass1_1 = new Class1();

	static boolean method12(final String var0) {
		if (var0 != null) {
			final String var1 = Class34.method186(var0, Class49.aClass117_488);

			for (int var2 = 0; var2 < client.anInt2252; ++var2) {
				final Class35 var3 = client.aClass35Array1986[var2];
				if (var1.equalsIgnoreCase(Class34.method186(var3.aString372, Class49.aClass117_488)))
					return true;

				if (var1.equalsIgnoreCase(Class34.method186(var3.aString373, Class49.aClass117_488)))
					return true;
			}

			return false;
		} else
			return false;
	}

	static final boolean method13(final Widget var0) {
		if (null == var0.anIntArray1264)
			return false;
		else {
			for (int var1 = 0; var1 < var0.anIntArray1264.length; ++var1) {
				final int var2 = Class122.method448(var0, var1);
				final int var3 = var0.anIntArray1241[var1];
				if (var0.anIntArray1264[var1] == 2) {
					if (var2 >= var3)
						return false;
				} else if (var0.anIntArray1264[var1] == 3) {
					if (var2 <= var3)
						return false;
				} else if (var0.anIntArray1264[var1] == 4) {
					if (var3 == var2)
						return false;
				} else if (var2 != var3)
					return false;
			}

			return true;
		}
	}

	static final void method14(final Widget var0, final int var1, final int var2, final int var3) {
		Def15.method751();
		final Class124_Sub22_Sub20 var4 = var0.method629(false);
		if (null != var4) {
			Class124_Sub22_Sub16.method764(var1, var2, var1 + var4.anInt1646, var4.anInt1643 + var2);
			if ((client.anInt2218 != 2) && (client.anInt2218 != 5)) {
				final int var9 = (client.anInt2255 + client.anInt2053) & 2047;
				final int var7 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32) + 48;
				final int var8 = 464 - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
				Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954.method913(var1, var2, var4.anInt1646,
						var4.anInt1643, var7, var8, var9, 256 + client.anInt2055, var4.anIntArray1645,
						var4.anIntArray1644);

				int var10;
				int var11;
				int var13;
				for (var10 = 0; var10 < client.anInt2065; ++var10) {
					var11 = ((4 * client.anIntArray2213[var10]) + 2)
							- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
					var13 = (2 + (client.anIntArray2214[var10] * 4))
							- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
					Def9.method646(var1, var2, var11, var13,
							client.aClass124_Sub22_Sub16_Sub1Array2244[var10], var4);
				}

				int var5;
				int var6;
				for (var10 = 0; var10 < 104; ++var10)
					for (var11 = 0; var11 < 104; ++var11) {
						final Class111 var12 = client.aClass111ArrayArrayArray2073[Class134.anInt906][var10][var11];
						if (var12 != null) {
							var5 = ((var10 * 4) + 2) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
							var6 = (2 + (var11 * 4)) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
							Def9.method646(var1, var2, var5, var6,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[0], var4);
						}
					}

				for (var10 = 0; var10 < client.anInt2022; ++var10) {
					final Class124_Sub22_Sub19_Sub3_Sub1 var15 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var10]];
					if ((var15 != null) && var15.method895(1325365041)) {
						Def9 var19 = var15.aClass124_Sub22_Sub1_1941;
						if ((var19 != null) && (var19.anIntArray1342 != null))
							var19 = var19.method644();

						if ((null != var19) && var19.aBool1332 && var19.aBool1346) {
							var5 = (var15.anInt1690 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
							var6 = (var15.anInt1697 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
							Def9.method646(var1, var2, var5, var6,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[1], var4);
						}
					}
				}

				for (var10 = 0; var10 < client.anInt2090; ++var10) {
					final Class124_Sub22_Sub19_Sub3_Sub2 var21 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var10]];
					if ((null != var21) && var21.method895(-608416795) && !var21.aBool1960) {
						var13 = (var21.anInt1690 / 32) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
						var5 = (var21.anInt1697 / 32) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
						boolean var18 = false;
						if (Def6.method691(var21.aString1956, true))
							var18 = true;

						boolean var17 = false;

						for (int var14 = 0; var14 < Class103.anInt794; ++var14)
							if (var21.aString1956
									.equals(Class124_Sub14_Sub1.aClass124_Sub9Array1609[var14].aString1029)) {
								var17 = true;
								break;
							}

						boolean var20 = false;
						if ((Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1959 != 0) && (var21.anInt1959 != 0)
								&& (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1959 == var21.anInt1959))
							var20 = true;

						if (var18)
							Def9.method646(var1, var2, var13, var5,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[3], var4);
						else if (var20)
							Def9.method646(var1, var2, var13, var5,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[4], var4);
						else if (var17)
							Def9.method646(var1, var2, var13, var5,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[5], var4);
						else
							Def9.method646(var1, var2, var13, var5,
									Class45.aClass124_Sub22_Sub16_Sub1Array439[2], var4);
					}
				}

				if ((client.anInt2171 != 0) && ((client.anInt2158 % 20) < 10)) {
					if ((client.anInt2171 == 1) && (client.anInt2003 >= 0)
							&& (client.anInt2003 < client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254.length)) {
						final Class124_Sub22_Sub19_Sub3_Sub1 var16 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anInt2003];
						if (var16 != null) {
							var11 = (var16.anInt1690 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
							var13 = (var16.anInt1697 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
							Def14.method730(var1, var2, var11, var13,
									Class7.aClass124_Sub22_Sub16_Sub1Array72[1], var4);
						}
					}

					if (client.anInt2171 == 2) {
						var10 = (((client.anInt2186 * 4) - (Class9.anInt102 * 4)) + 2)
								- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
						var11 = (2 + ((client.anInt2144 * 4) - (Class95.anInt762 * 4)))
								- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
						Def14.method730(var1, var2, var10, var11,
								Class7.aClass124_Sub22_Sub16_Sub1Array72[1], var4);
					}

					if ((client.anInt2171 == 10) && (client.anInt2004 >= 0)
							&& (client.anInt2004 < client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100.length)) {
						final Class124_Sub22_Sub19_Sub3_Sub2 var22 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anInt2004];
						if (var22 != null) {
							var11 = (var22.anInt1690 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
							var13 = (var22.anInt1697 / 32)
									- (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
							Def14.method730(var1, var2, var11, var13,
									Class7.aClass124_Sub22_Sub16_Sub1Array72[1], var4);
						}
					}
				}

				if (client.anInt2194 != 0) {
					var10 = ((client.anInt2194 * 4) + 2) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 / 32);
					var11 = ((client.anInt2217 * 4) + 2) - (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 / 32);
					Def9.method646(var1, var2, var10, var11, Class7.aClass124_Sub22_Sub16_Sub1Array72[0],
							var4);
				}

				if (!Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aBool1960)
					Class124_Sub22_Sub16.method768((var1 + (var4.anInt1646 / 2)) - 1, ((var4.anInt1643 / 2) + var2) - 1,
							3, 3, 16777215);
			} else
				Class124_Sub22_Sub16.method775(var1, var2, 0, var4.anIntArray1645, var4.anIntArray1644);

			client.aBoolArray2188[var3] = true;
		}
	}

	public static void method15(final Class94 var0, final Class94 var1) {
		Class37.aClass94_388 = var0;
		Def13.aClass94_1526 = var1;
	}

	public static String toString(final byte[] var0, final int var1, final int var2) {
		final char[] var3 = new char[var2];
		int var4 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var5 = var0[var1 + var6] & 255;
			if (var5 != 0) {
				if ((var5 >= 128) && (var5 < 160)) {
					char var7 = Class90.aCharArray710[var5 - 128];
					if (var7 == 0)
						var7 = 63;

					var5 = var7;
				}

				var3[var4++] = (char) var5;
			}
		}

		return new String(var3, 0, var4);
	}

	public static Class124_Sub22_Sub16_Sub2 method17(final Class94 var0, final String var1, final String var2) {
		final int var3 = var0.method376(var1);
		final int var4 = var0.method383(var3, var2);
		return Class23.method157(var0, var3, var4);
	}
}
