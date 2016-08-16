import java.applet.Applet;
import java.net.URL;

import netscape.javascript.JSObject;

public class Class124_Sub22_Sub19_Sub6 extends Class124_Sub22_Sub19 {
	static int[] anIntArray1822;
	static short[] aShortArray1823;
	static int anInt1824;
	int anInt1826;
	int anInt1817;
	int anInt1818;
	int anInt1816;
	int anInt1825;
	int anInt1820;
	Def12 aClass124_Sub22_Sub13_1819;
	int anInt1821;
	int anInt1827;

	public static int method961(final int var0, final int var1, int var2, int var3, int var4, final int var5) {
		if ((var5 & 1) == 1) {
			final int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}

	Class124_Sub22_Sub19_Sub6(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final boolean var8, final Class124_Sub22_Sub19 var9) {
		anInt1826 = var1;
		anInt1817 = var2;
		anInt1818 = var3;
		anInt1816 = var4;
		anInt1825 = var5;
		anInt1820 = var6;
		if (var7 != -1) {
			aClass124_Sub22_Sub13_1819 = Def15.method750(var7);
			anInt1821 = 0;
			anInt1827 = client.anInt2158 - 1;
			if ((aClass124_Sub22_Sub13_1819.anInt1546 == 0) && (null != var9)
					&& (var9 instanceof Class124_Sub22_Sub19_Sub6)) {
				final Class124_Sub22_Sub19_Sub6 var10 = (Class124_Sub22_Sub19_Sub6) var9;
				if (var10.aClass124_Sub22_Sub13_1819 == aClass124_Sub22_Sub13_1819) {
					anInt1821 = var10.anInt1821;
					anInt1827 = var10.anInt1827;
					return;
				}
			}

			if (var8 && (aClass124_Sub22_Sub13_1819.anInt1538 != -1)) {
				anInt1821 = (int) (Math.random() * aClass124_Sub22_Sub13_1819.anIntArray1536.length);
				anInt1827 -= (int) (Math.random() * aClass124_Sub22_Sub13_1819.anIntArray1529[anInt1821]);
			}
		}

	}

	public static Class124_Sub22_Sub16_Sub1 method962(final Class94 var0, final int var1, final int var2) {
		if (!Def3.loaded(var0, var1, var2))
			return null;
		else {
			final Class124_Sub22_Sub16_Sub1 var3 = new Class124_Sub22_Sub16_Sub1();
			var3.anInt1733 = Class7.anInt67;
			var3.anInt1734 = Class49.anInt486;
			var3.anInt1731 = Class7.anIntArray68[0];
			var3.anInt1732 = Class7.anIntArray74[0];
			var3.anInt1729 = Class7.anIntArray69[0];
			var3.anInt1730 = Class7.anIntArray70[0];
			final int var4 = var3.anInt1730 * var3.anInt1729;
			final byte[] var5 = Class124_Sub22_Sub5.aByteArrayArray1384[0];
			var3.anIntArray1735 = new int[var4];

			for (int var6 = 0; var6 < var4; ++var6)
				var3.anIntArray1735[var6] = Class7.anIntArray66[var5[var6] & 255];

			Class124_Sub7.method522();
			return var3;
		}
	}

	static int method963(final Widget var0) {
		final Class124_Sub21 var1 = (Class124_Sub21) client.aClass107_2184
				.method409(var0.anInt1154 + ((long) var0.anInt1284 << 32));
		return var1 == null ? var0.anInt1190 : var1.anInt1302;
	}

	public static final Class124_Sub22_Sub16_Sub1 method964(final int var0, final int var1, final int var2,
			final int var3, int var4, final boolean var5) {
		if (var1 == -1)
			var4 = 0;
		else if ((var4 == 2) && (var1 != 1))
			var4 = 1;

		final long var8 = ((long) var3 << 42) + ((long) var1 << 16) + var0 + ((long) var2 << 38) + ((long) var4 << 40);
		Class124_Sub22_Sub16_Sub1 var10;
		if (!var5) {
			var10 = (Class124_Sub22_Sub16_Sub1) Class124_Sub22_Sub10.aClass113_1463.method434(var8);
			if (var10 != null)
				return var10;
		}

		Class124_Sub22_Sub10 var11 = Class124_Sub22_Sub10.method724(var0);
		if ((var1 > 1) && (null != var11.anIntArray1492)) {
			int var13 = -1;

			for (int var14 = 0; var14 < 10; ++var14)
				if ((var1 >= var11.anIntArray1493[var14]) && (var11.anIntArray1493[var14] != 0))
					var13 = var11.anIntArray1492[var14];

			if (var13 != -1)
				var11 = Class124_Sub22_Sub10.method724(var13);
		}

		final Class124_Sub22_Sub19_Sub7 var16 = var11.method720(1);
		if (null == var16)
			return null;
		else {
			Class124_Sub22_Sub16_Sub1 var7 = null;
			if (var11.anInt1495 != -1) {
				var7 = method964(var11.anInt1506, 10, 1, 0, 0, true);
				if (null == var7)
					return null;
			} else if (var11.anInt1504 != -1) {
				var7 = method964(var11.anInt1503, var1, var2, var3, 0, false);
				if (var7 == null)
					return null;
			}

			final int[] var18 = Class124_Sub22_Sub16.anIntArray1570;
			final int var6 = Class124_Sub22_Sub16.anInt1565;
			final int var19 = Class124_Sub22_Sub16.anInt1566;
			final int[] var12 = new int[4];
			Class124_Sub22_Sub16.method765(var12);
			var10 = new Class124_Sub22_Sub16_Sub1(36, 32);
			Class124_Sub22_Sub16.method780(var10.anIntArray1735, 36, 32);
			Class124_Sub22_Sub16.method777();
			Class124_Sub22_Sub16_Sub3.method970();
			Class124_Sub22_Sub16_Sub3.method971(16, 16);
			Class124_Sub22_Sub16_Sub3.aBool1830 = false;
			int var15 = var11.anInt1470;
			if (var5)
				var15 = (int) (var15 * 1.5D);
			else if (var2 == 2)
				var15 = (int) (var15 * 1.04D);

			final int var20 = (var15 * Class124_Sub22_Sub16_Sub3.anIntArray1847[var11.anInt1500]) >> 16;
			final int var21 = (var15 * Class124_Sub22_Sub16_Sub3.anIntArray1848[var11.anInt1500]) >> 16;
			var16.method989();
			var16.method1006(0, var11.anInt1474, var11.anInt1473, var11.anInt1500, var11.anInt1477,
					var11.anInt1475 + var20 + (var16.anInt1605 / 2), var11.anInt1475 + var21);
			if (var11.anInt1504 != -1)
				var7.method907(0, 0);

			if (var2 >= 1)
				var10.method924(1);

			if (var2 >= 2)
				var10.method924(16777215);

			if (var3 != 0)
				var10.method906(var3);

			Class124_Sub22_Sub16.method780(var10.anIntArray1735, 36, 32);
			if (var11.anInt1495 != -1)
				var7.method907(0, 0);

			if ((var4 == 1) || ((var4 == 2) && (var11.anInt1480 == 1))) {
				final Somet1 var22 = Class90.aClass124_Sub22_Sub16_Sub4_Sub1_709;
				String var17;
				if (var1 < 100000)
					var17 = "<col=ffff00>" + var1 + "</col>";
				else if (var1 < 10000000)
					var17 = "<col=ffffff>" + (var1 / 1000) + "K" + "</col>";
				else
					var17 = "<col=00ff80>" + (var1 / 1000000) + "M" + "</col>";

				var22.method1020(var17, 0, 9, 16776960, 1);
			}

			if (!var5)
				Class124_Sub22_Sub10.aClass113_1463.method435(var10, var8);

			Class124_Sub22_Sub16.method780(var18, var6, var19);
			Class124_Sub22_Sub16.method766(var12);
			Class124_Sub22_Sub16_Sub3.method970();
			Class124_Sub22_Sub16_Sub3.aBool1830 = true;
			return var10;
		}
	}

	public static boolean method965(final String var0, final int var1, final String var2) {
		if (var1 == 0)
			try {
				if (!Class87.aString690.startsWith("win"))
					throw new Exception();
				else if (!var0.startsWith("http://") && !var0.startsWith("https://"))
					throw new Exception();
				else {
					final String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4)
						if (var14.indexOf(var0.charAt(var4)) == -1)
							throw new Exception();

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (final Throwable var8) {
				return false;
			}
		else if (var1 == 1)
			try {
				final Applet var5 = Class87.anApplet693;
				final Object[] var6 = new Object[] { (new URL(Class87.anApplet693.getCodeBase(), var0)).toString() };
				final Object var13 = JSObject.getWindow(var5).call(var2, var6);
				return null != var13;
			} catch (final Throwable var9) {
				return false;
			}
		else if (var1 == 2)
			try {
				Class87.anApplet693.getAppletContext().showDocument(new URL(Class87.anApplet693.getCodeBase(), var0),
						"_blank");
				return true;
			} catch (final Exception var10) {
				return false;
			}
		else if (var1 == 3) {
			try {
				final Applet var3 = Class87.anApplet693;
				JSObject.getWindow(var3).call("loggedout", (Object[]) null);
			} catch (final Throwable var12) {
				;
			}

			try {
				Class87.anApplet693.getAppletContext().showDocument(new URL(Class87.anApplet693.getCodeBase(), var0),
						"_top");
				return true;
			} catch (final Exception var11) {
				return false;
			}
		} else
			throw new IllegalArgumentException();
	}

	static final void method966() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var38;
		int var39;
		if (client.anInt2028 == 48) {
			var1 = client.aClass124_Sub14_Sub1_2026.method604();
			var0 = var1 >> 2;
			var39 = var1 & 3;
			var2 = client.anIntArray2045[var0];
			var3 = client.aClass124_Sub14_Sub1_2026.method582();
			var4 = client.aClass124_Sub14_Sub1_2026.method604();
			var5 = Def19.anInt1439 + ((var4 >> 4) & 7);
			var6 = (var4 & 7) + Def19.anInt1440;
			if ((var5 >= 0) && (var6 >= 0) && (var5 < 103) && (var6 < 103)) {
				if (var2 == 0) {
					final Class30 var7 = Class36.aClass21_380.method131(Class134.anInt906, var5, var6);
					if (null != var7) {
						var38 = (var7.anInt326 >> 14) & 32767;
						if (var0 == 2) {
							var7.aClass124_Sub22_Sub19_328 = new Class124_Sub22_Sub19_Sub6(var38, 2, 4 + var39,
									Class134.anInt906, var5, var6, var3, false, var7.aClass124_Sub22_Sub19_328);
							var7.aClass124_Sub22_Sub19_325 = new Class124_Sub22_Sub19_Sub6(var38, 2, (var39 + 1) & 3,
									Class134.anInt906, var5, var6, var3, false, var7.aClass124_Sub22_Sub19_325);
						} else
							var7.aClass124_Sub22_Sub19_328 = new Class124_Sub22_Sub19_Sub6(var38, var0, var39,
									Class134.anInt906, var5, var6, var3, false, var7.aClass124_Sub22_Sub19_328);
					}
				}

				if (var2 == 1) {
					final Class36 var35 = Class36.aClass21_380.method116(Class134.anInt906, var5, var6);
					if (var35 != null) {
						var38 = (var35.anInt385 >> 14) & 32767;
						if ((var0 != 4) && (var0 != 5)) {
							if (var0 == 6)
								var35.aClass124_Sub22_Sub19_383 = new Class124_Sub22_Sub19_Sub6(var38, 4, 4 + var39,
										Class134.anInt906, var5, var6, var3, false, var35.aClass124_Sub22_Sub19_383);
							else if (var0 == 7)
								var35.aClass124_Sub22_Sub19_383 = new Class124_Sub22_Sub19_Sub6(var38, 4,
										4 + ((var39 + 2) & 3), Class134.anInt906, var5, var6, var3, false,
										var35.aClass124_Sub22_Sub19_383);
							else if (var0 == 8) {
								var35.aClass124_Sub22_Sub19_383 = new Class124_Sub22_Sub19_Sub6(var38, 4, var39 + 4,
										Class134.anInt906, var5, var6, var3, false, var35.aClass124_Sub22_Sub19_383);
								var35.aClass124_Sub22_Sub19_377 = new Class124_Sub22_Sub19_Sub6(var38, 4,
										((2 + var39) & 3) + 4, Class134.anInt906, var5, var6, var3, false,
										var35.aClass124_Sub22_Sub19_377);
							}
						} else
							var35.aClass124_Sub22_Sub19_383 = new Class124_Sub22_Sub19_Sub6(var38, 4, var39,
									Class134.anInt906, var5, var6, var3, false, var35.aClass124_Sub22_Sub19_383);
					}
				}

				if (var2 == 2) {
					final Class46 var36 = Class36.aClass21_380.method117(Class134.anInt906, var5, var6);
					if (var0 == 11)
						var0 = 10;

					if (var36 != null)
						var36.aClass124_Sub22_Sub19_455 = new Class124_Sub22_Sub19_Sub6((var36.anInt463 >> 14) & 32767,
								var0, var39, Class134.anInt906, var5, var6, var3, false,
								var36.aClass124_Sub22_Sub19_455);
				}

				if (var2 == 3) {
					final Class44 var37 = Class36.aClass21_380.method118(Class134.anInt906, var5, var6);
					if (var37 != null)
						var37.aClass124_Sub22_Sub19_438 = new Class124_Sub22_Sub19_Sub6((var37.anInt437 >> 14) & 32767,
								22, var39, Class134.anInt906, var5, var6, var3, false, var37.aClass124_Sub22_Sub19_438);
				}
			}

		} else {
			int var19;
			int var21;
			if (client.anInt2028 == 205) {
				var1 = client.aClass124_Sub14_Sub1_2026.readShortU();
				var0 = client.aClass124_Sub14_Sub1_2026.method544();
				byte var9 = client.aClass124_Sub14_Sub1_2026.readByte();
				var2 = client.aClass124_Sub14_Sub1_2026.method583();
				var3 = client.aClass124_Sub14_Sub1_2026.method604();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = client.anIntArray2045[var4];
				byte var11 = client.aClass124_Sub14_Sub1_2026.method579();
				byte var8 = client.aClass124_Sub14_Sub1_2026.method579();
				byte var20 = client.aClass124_Sub14_Sub1_2026.readByte();
				var19 = client.aClass124_Sub14_Sub1_2026.method583();
				var21 = client.aClass124_Sub14_Sub1_2026.method604();
				final int var16 = Def19.anInt1439 + ((var21 >> 4) & 7);
				final int var22 = Def19.anInt1440 + (var21 & 7);
				Class124_Sub22_Sub19_Sub3_Sub2 var18;
				if (var0 == client.anInt2106)
					var18 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246;
				else
					var18 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var0];

				if (null != var18) {
					final Def6 var12 = Def13.method736(var2);
					int var13;
					int var15;
					if ((var5 != 1) && (var5 != 3)) {
						var15 = var12.anInt1401;
						var13 = var12.anInt1432;
					} else {
						var15 = var12.anInt1432;
						var13 = var12.anInt1401;
					}

					final int var28 = var16 + (var15 >> 1);
					final int var24 = ((1 + var15) >> 1) + var16;
					final int var25 = var22 + (var13 >> 1);
					final int var26 = ((1 + var13) >> 1) + var22;
					final int[][] var27 = Class27.anIntArrayArrayArray284[Class134.anInt906];
					final int var29 = (var27[var28][var26] + var27[var24][var25] + var27[var28][var25]
							+ var27[var24][var26]) >> 2;
					final int var17 = (var15 << 6) + (var16 << 7);
					final int var23 = (var22 << 7) + (var13 << 6);
					final Class124_Sub22_Sub19_Sub7 var30 = var12.method682(var4, var5, var27, var17, var29, var23);
					if (null != var30) {
						Class124_Sub4_Sub4.method880(Class134.anInt906, var16, var22, var6, -1, 0, 0, 1 + var1,
								1 + var19);
						var18.anInt1942 = var1 + client.anInt2158;
						var18.anInt1949 = client.anInt2158 + var19;
						var18.aClass124_Sub22_Sub19_Sub7_1953 = var30;
						var18.anInt1961 = (64 * var15) + (var16 * 128);
						var18.anInt1952 = (var13 * 64) + (var22 * 128);
						var18.anInt1950 = var29;
						byte var32;
						if (var11 > var9) {
							var32 = var11;
							var11 = var9;
							var9 = var32;
						}

						if (var20 > var8) {
							var32 = var20;
							var20 = var8;
							var8 = var32;
						}

						var18.anInt1947 = var11 + var16;
						var18.anInt1955 = var9 + var16;
						var18.anInt1962 = var20 + var22;
						var18.anInt1957 = var8 + var22;
					}
				}
			}

			Class124_Sub22_Sub19_Sub2 var14;
			if (client.anInt2028 == 36) {
				var1 = client.aClass124_Sub14_Sub1_2026.readShortU();
				var0 = client.aClass124_Sub14_Sub1_2026.readByteN();
				var39 = ((var0 >> 4) & 7) + Def19.anInt1439;
				var2 = Def19.anInt1440 + (var0 & 7);
				if ((var39 >= 0) && (var2 >= 0) && (var39 < 104) && (var2 < 104)) {
					final Class111 var34 = client.aClass111ArrayArrayArray2073[Class134.anInt906][var39][var2];
					if (null != var34) {
						for (var14 = (Class124_Sub22_Sub19_Sub2) var34
								.method428(); null != var14; var14 = (Class124_Sub22_Sub19_Sub2) var34.method430())
							if (var14.anInt1667 == (var1 & 32767)) {
								var14.method450();
								break;
							}

						if (var34.method428() == null)
							client.aClass111ArrayArrayArray2073[Class134.anInt906][var39][var2] = null;

						Class48.method233(var39, var2);
					}
				}

			} else if (client.anInt2028 != 162) {
				if (client.anInt2028 == 234) {
					var1 = client.aClass124_Sub14_Sub1_2026.readByteU();
					var0 = ((var1 >> 4) & 7) + Def19.anInt1439;
					var39 = (var1 & 7) + Def19.anInt1440;
					var2 = client.aClass124_Sub14_Sub1_2026.readByteU();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = client.anIntArray2045[var3];
					var6 = client.aClass124_Sub14_Sub1_2026.method583();
					if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104))
						Class124_Sub4_Sub4.method880(Class134.anInt906, var0, var39, var5, var6, var3, var4, 0, -1);

				} else if (client.anInt2028 == 56) {
					var1 = client.aClass124_Sub14_Sub1_2026.readByteN();
					var0 = Def19.anInt1439 + ((var1 >> 4) & 7);
					var39 = (var1 & 7) + Def19.anInt1440;
					var2 = client.aClass124_Sub14_Sub1_2026.method604();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = client.anIntArray2045[var3];
					if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104))
						Class124_Sub4_Sub4.method880(Class134.anInt906, var0, var39, var5, -1, var3, var4, 0, -1);

				} else {
					int var40;
					if (client.anInt2028 == 118) {
						var1 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var0 = ((var1 >> 4) & 7) + Def19.anInt1439;
						var39 = Def19.anInt1440 + (var1 & 7);
						var2 = client.aClass124_Sub14_Sub1_2026.readShortU();
						var3 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var4 = (var3 >> 4) & 15;
						var5 = var3 & 7;
						var6 = client.aClass124_Sub14_Sub1_2026.readByteU();
						if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104)) {
							var40 = var4 + 1;
							if ((Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] >= (var0 - var40))
									&& (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] <= (var0 + var40))
									&& (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0] >= (var39
											- var40))
									&& (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0] <= (var39
											+ var40))
									&& (client.anInt2206 != 0) && (var5 > 0) && (client.anInt2225 < 50)) {
								client.anIntArray2226[client.anInt2225] = var2;
								client.anIntArray2227[client.anInt2225] = var5;
								client.anIntArray2228[client.anInt2225] = var6;
								client.aClass12Array2230[client.anInt2225] = null;
								client.anIntArray2229[client.anInt2225] = (var39 << 8) + (var0 << 16) + var4;
								++client.anInt2225;
							}
						}
					}

					if (client.anInt2028 == 131) {
						var1 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var0 = ((var1 >> 4) & 7) + Def19.anInt1439;
						var39 = (var1 & 7) + Def19.anInt1440;
						var2 = client.aClass124_Sub14_Sub1_2026.readShortU();
						var3 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var4 = client.aClass124_Sub14_Sub1_2026.readShortU();
						if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104)) {
							var0 = 64 + (var0 * 128);
							var39 = 64 + (var39 * 128);
							final Class124_Sub22_Sub19_Sub1 var42 = new Class124_Sub22_Sub19_Sub1(var2,
									Class134.anInt906, var0, var39,
									Class63.method285(var0, var39, Class134.anInt906) - var3, var4, client.anInt2158);
							client.aClass111_2118.method424(var42);
						}

					} else if (client.anInt2028 == 183) {
						var1 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var0 = Def19.anInt1439 + ((var1 >> 4) & 7);
						var39 = Def19.anInt1440 + (var1 & 7);
						var2 = var0 + client.aClass124_Sub14_Sub1_2026.readByte();
						var3 = var39 + client.aClass124_Sub14_Sub1_2026.readByte();
						var4 = client.aClass124_Sub14_Sub1_2026.readShort();
						var5 = client.aClass124_Sub14_Sub1_2026.readShortU();
						var6 = client.aClass124_Sub14_Sub1_2026.readByteU() * 4;
						var40 = client.aClass124_Sub14_Sub1_2026.readByteU() * 4;
						var38 = client.aClass124_Sub14_Sub1_2026.readShortU();
						final int var41 = client.aClass124_Sub14_Sub1_2026.readShortU();
						var19 = client.aClass124_Sub14_Sub1_2026.readByteU();
						var21 = client.aClass124_Sub14_Sub1_2026.readByteU();
						if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104) && (var2 >= 0) && (var3 >= 0)
								&& (var2 < 104) && (var3 < 104) && (var5 != '\uffff')) {
							var0 = (var0 * 128) + 64;
							var39 = (var39 * 128) + 64;
							var2 = 64 + (128 * var2);
							var3 = 64 + (var3 * 128);
							final Class124_Sub22_Sub19_Sub5 var10 = new Class124_Sub22_Sub19_Sub5(var5,
									Class134.anInt906, var0, var39,
									Class63.method285(var0, var39, Class134.anInt906) - var6, client.anInt2158 + var38,
									client.anInt2158 + var41, var19, var21, var4, var40);
							var10.method953(var2, var3, Class63.method285(var2, var3, Class134.anInt906) - var40,
									var38 + client.anInt2158);
							client.aClass111_2117.method424(var10);
						}

					} else if (client.anInt2028 == 240) {
						var1 = client.aClass124_Sub14_Sub1_2026.method583();
						var0 = client.aClass124_Sub14_Sub1_2026.readByteN();
						var39 = Def19.anInt1439 + ((var0 >> 4) & 7);
						var2 = (var0 & 7) + Def19.anInt1440;
						var3 = client.aClass124_Sub14_Sub1_2026.readShortU();
						if ((var39 >= 0) && (var2 >= 0) && (var39 < 104) && (var2 < 104)) {
							var14 = new Class124_Sub22_Sub19_Sub2();
							var14.anInt1667 = var1;
							var14.anInt1669 = var3;
							if (null == client.aClass111ArrayArrayArray2073[Class134.anInt906][var39][var2])
								client.aClass111ArrayArrayArray2073[Class134.anInt906][var39][var2] = new Class111();

							client.aClass111ArrayArrayArray2073[Class134.anInt906][var39][var2].method424(var14);
							Class48.method233(var39, var2);
						}

					}
				}
			} else {
				var1 = client.aClass124_Sub14_Sub1_2026.readByteU();
				var0 = ((var1 >> 4) & 7) + Def19.anInt1439;
				var39 = Def19.anInt1440 + (var1 & 7);
				var2 = client.aClass124_Sub14_Sub1_2026.readShortU();
				var3 = client.aClass124_Sub14_Sub1_2026.readShortU();
				var4 = client.aClass124_Sub14_Sub1_2026.readShortU();
				if ((var0 >= 0) && (var39 >= 0) && (var0 < 104) && (var39 < 104)) {
					final Class111 var31 = client.aClass111ArrayArrayArray2073[Class134.anInt906][var0][var39];
					if (var31 != null) {
						for (Class124_Sub22_Sub19_Sub2 var33 = (Class124_Sub22_Sub19_Sub2) var31
								.method428(); var33 != null; var33 = (Class124_Sub22_Sub19_Sub2) var31.method430())
							if ((var33.anInt1667 == (var2 & 32767)) && (var3 == var33.anInt1669)) {
								var33.anInt1669 = var4;
								break;
							}

						Class48.method233(var0, var39);
					}
				}

			}
		}
	}

	static final void method967(final Widget var0, final int var1, final int var2) {
		final Class124_Sub22_Sub20 var3 = var0.method629(false);
		if (null != var3)
			if (client.anInt2218 < 3)
				Class47.aClass124_Sub22_Sub16_Sub1_472.method913(var1, var2, var3.anInt1646, var3.anInt1643, 25, 25,
						client.anInt2255, 256, var3.anIntArray1645, var3.anIntArray1644);
			else
				Class124_Sub22_Sub16.method775(var1, var2, 0, var3.anIntArray1645, var3.anIntArray1644);
	}

	@Override
	protected final Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		if (null != aClass124_Sub22_Sub13_1819) {
			int var2 = client.anInt2158 - anInt1827;
			if ((var2 > 100) && (aClass124_Sub22_Sub13_1819.anInt1538 > 0))
				var2 = 100;

			label63: {
				do {
					do {
						if (var2 <= aClass124_Sub22_Sub13_1819.anIntArray1529[anInt1821])
							break label63;

						var2 -= aClass124_Sub22_Sub13_1819.anIntArray1529[anInt1821];
						++anInt1821;
					} while (anInt1821 < aClass124_Sub22_Sub13_1819.anIntArray1536.length);

					anInt1821 -= aClass124_Sub22_Sub13_1819.anInt1538;
				} while ((anInt1821 >= 0) && (anInt1821 < aClass124_Sub22_Sub13_1819.anIntArray1536.length));

				aClass124_Sub22_Sub13_1819 = null;
			}

			anInt1827 = client.anInt2158 - var2;
		}

		Def6 var4 = Def13.method736(anInt1826);
		if (null != var4.anIntArray1427)
			var4 = var4.method683();

		if (var4 == null)
			return null;
		else {
			int var5;
			int var6;
			if ((anInt1818 != 1) && (anInt1818 != 3)) {
				var5 = var4.anInt1401;
				var6 = var4.anInt1432;
			} else {
				var5 = var4.anInt1432;
				var6 = var4.anInt1401;
			}

			final int var13 = (var5 >> 1) + anInt1825;
			final int var7 = anInt1825 + ((1 + var5) >> 1);
			final int var8 = anInt1820 + (var6 >> 1);
			final int var9 = anInt1820 + ((1 + var6) >> 1);
			final int[][] var3 = Class27.anIntArrayArrayArray284[anInt1816];
			final int var11 = (var3[var13][var9] + var3[var7][var8] + var3[var13][var8] + var3[var7][var9]) >> 2;
			final int var10 = (anInt1825 << 7) + (var5 << 6);
			final int var12 = (var6 << 6) + (anInt1820 << 7);
			return var4.method684(anInt1817, anInt1818, var3, var10, var11, var12, aClass124_Sub22_Sub13_1819,
					anInt1821);
		}
	}

	public static void method968() {
		final Class81 var0 = Class81.aClass81_649;
		synchronized (var0) {
			Class81.anInt651 = Class81.anInt663;
			Class81.anInt652 = Class81.anInt659;
			Class81.anInt653 = Class81.anInt661;
			Class81.anInt650 = Class81.anInt654;
			Class81.anInt658 = Class81.anInt647;
			Class81.anInt655 = Class81.anInt656;
			Class81.aLong660 = Class81.aLong657;
			Class81.anInt654 = 0;
		}
	}
}
