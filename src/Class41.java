import java.awt.Font;
import java.io.EOFException;

public class Class41 {
	protected static Font aFont406;
	static Somet1 aClass124_Sub22_Sub16_Sub4_Sub1_407;
	boolean aBool404 = false;
	int[] anIntArray400;
	String[] aStringArray403;
	boolean[] aBoolArray402;
	boolean[] aBoolArray405;
	long aLong401;

	static final void method201(final int var0, final int var1, final int var2, final int var3) {
		if ((client.anInt2135 == 0) && !client.aBool2137)
			Class3.method22("Walk here", "", 23, 0, var0 - var2, var1 - var3);

		int var8 = -1;
		int var9 = -1;

		int var10;
		int var11;
		for (var10 = 0; var10 < Class124_Sub22_Sub19_Sub7.anInt1905; ++var10) {
			var11 = Class124_Sub22_Sub19_Sub7.anIntArray1906[var10];
			final int var6 = var11 & 127;
			final int var7 = (var11 >> 7) & 127;
			final int var12 = (var11 >> 29) & 3;
			final int var5 = (var11 >> 14) & 32767;
			if (var11 != var9) {
				var9 = var11;
				if ((var12 == 2) && (Class36.aClass21_380.method141(Class134.anInt906, var6, var7, var11) >= 0)) {
					Def6 var4 = Def13.method736(var5);
					if (null != var4.anIntArray1427)
						var4 = var4.method683();

					if (var4 == null)
						continue;

					if (client.anInt2135 == 1)
						Class3.method22("Use", client.aString2136 + " " + "->" + " "
								+ Class124_Sub4_Sub3.method874('\uffff') + var4.aString1396, 1, var11, var6, var7);
					else if (client.aBool2137) {
						if ((Class9_Sub1.anInt922 & 4) == 4)
							Class3.method22(
									client.aString1983, client.aString2035 + " " + "->" + " "
											+ Class124_Sub4_Sub3.method874('\uffff') + var4.aString1396,
									2, var11, var6, var7);
					} else {
						String[] var17 = var4.aStringArray1413;
						if (client.aBool2153)
							var17 = client.method517(var17);

						if (null != var17)
							for (int var15 = 4; var15 >= 0; --var15)
								if (null != var17[var15]) {
									short var19 = 0;
									if (var15 == 0)
										var19 = 3;

									if (var15 == 1)
										var19 = 4;

									if (var15 == 2)
										var19 = 5;

									if (var15 == 3)
										var19 = 6;

									if (var15 == 4)
										var19 = 1001;

									Class3.method22(var17[var15],
											Class124_Sub4_Sub3.method874('\uffff') + var4.aString1396, var19, var11,
											var6, var7);
								}

						Class3.method22("Examine", Class124_Sub4_Sub3.method874('\uffff') + var4.aString1396, 1002,
								var4.anInt1434 << 14, var6, var7);
					}
				}

				Class124_Sub22_Sub19_Sub3_Sub1 var13;
				int var14;
				Class124_Sub22_Sub19_Sub3_Sub2 var25;
				if (var12 == 1) {
					final Class124_Sub22_Sub19_Sub3_Sub1 var22 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var5];
					if (null == var22)
						continue;

					if ((var22.aClass124_Sub22_Sub1_1941.anInt1320 == 1) && ((var22.anInt1690 & 127) == 64)
							&& ((var22.anInt1697 & 127) == 64)) {
						for (var14 = 0; var14 < client.anInt2022; ++var14) {
							var13 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var14]];
							if ((null != var13) && (var22 != var13) && (var13.aClass124_Sub22_Sub1_1941.anInt1320 == 1)
									&& (var13.anInt1690 == var22.anInt1690) && (var22.anInt1697 == var13.anInt1697))
								Class121_Sub1.method487(var13.aClass124_Sub22_Sub1_1941, client.anIntArray2023[var14],
										var6, var7);
						}

						for (var14 = 0; var14 < client.anInt2090; ++var14) {
							var25 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var14]];
							if ((null != var25) && (var22.anInt1690 == var25.anInt1690)
									&& (var22.anInt1697 == var25.anInt1697))
								Class48.method234(var25, client.anIntArray2128[var14], var6, var7);
						}
					}

					Class121_Sub1.method487(var22.aClass124_Sub22_Sub1_1941, var5, var6, var7);
				}

				if (var12 == 0) {
					final Class124_Sub22_Sub19_Sub3_Sub2 var23 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var5];
					if (var23 == null)
						continue;

					if (((var23.anInt1690 & 127) == 64) && ((var23.anInt1697 & 127) == 64)) {
						for (var14 = 0; var14 < client.anInt2022; ++var14) {
							var13 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var14]];
							if ((var13 != null) && (var13.aClass124_Sub22_Sub1_1941.anInt1320 == 1)
									&& (var23.anInt1690 == var13.anInt1690) && (var13.anInt1697 == var23.anInt1697))
								Class121_Sub1.method487(var13.aClass124_Sub22_Sub1_1941, client.anIntArray2023[var14],
										var6, var7);
						}

						for (var14 = 0; var14 < client.anInt2090; ++var14) {
							var25 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var14]];
							if ((var25 != null) && (var23 != var25) && (var25.anInt1690 == var23.anInt1690)
									&& (var25.anInt1697 == var23.anInt1697))
								Class48.method234(var25, client.anIntArray2128[var14], var6, var7);
						}
					}

					if (var5 != client.anInt2114)
						Class48.method234(var23, var5, var6, var7);
					else
						var8 = var11;
				}

				if (var12 == 3) {
					final Class111 var24 = client.aClass111ArrayArrayArray2073[Class134.anInt906][var6][var7];
					if (var24 != null)
						for (Class124_Sub22_Sub19_Sub2 var27 = (Class124_Sub22_Sub19_Sub2) var24
								.method429(); var27 != null; var27 = (Class124_Sub22_Sub19_Sub2) var24.method426()) {
							final Def10 var26 = Def10.method724(var27.anInt1667);
							if (client.anInt2135 == 1)
								Class3.method22(
										"Use", client.aString2136 + " " + "->" + " "
												+ Class124_Sub4_Sub3.method874(16748608) + var26.aString1472,
										16, var27.anInt1667, var6, var7);
							else if (client.aBool2137) {
								if ((Class9_Sub1.anInt922 & 1) == 1)
									Class3.method22(client.aString1983,
											client.aString2035 + " " + "->" + " "
													+ Class124_Sub4_Sub3.method874(16748608) + var26.aString1472,
											17, var27.anInt1667, var6, var7);
							} else {
								String[] var18 = var26.aStringArray1479;
								if (client.aBool2153)
									var18 = client.method517(var18);

								for (int var21 = 4; var21 >= 0; --var21)
									if ((var18 != null) && (var18[var21] != null)) {
										byte var20 = 0;
										if (var21 == 0)
											var20 = 18;

										if (var21 == 1)
											var20 = 19;

										if (var21 == 2)
											var20 = 20;

										if (var21 == 3)
											var20 = 21;

										if (var21 == 4)
											var20 = 22;

										Class3.method22(var18[var21],
												Class124_Sub4_Sub3.method874(16748608) + var26.aString1472, var20,
												var27.anInt1667, var6, var7);
									} else if (var21 == 2)
										Class3.method22("Take",
												Class124_Sub4_Sub3.method874(16748608) + var26.aString1472, 20,
												var27.anInt1667, var6, var7);

								Class3.method22("Examine", Class124_Sub4_Sub3.method874(16748608) + var26.aString1472,
										1004, var27.anInt1667, var6, var7);
							}
						}
				}
			}
		}

		if (var8 != -1) {
			var10 = var8 & 127;
			var11 = (var8 >> 7) & 127;
			final Class124_Sub22_Sub19_Sub3_Sub2 var16 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anInt2114];
			Class48.method234(var16, client.anInt2114, var10, var11);
		}

	}

	void method202() {
		int var1;
		for (var1 = 0; var1 < anIntArray400.length; ++var1)
			if (!aBoolArray402[var1])
				anIntArray400[var1] = -1;

		for (var1 = 0; var1 < aStringArray403.length; ++var1)
			if (!aBoolArray405[var1])
				aStringArray403[var1] = null;

	}

	Class41() {
		anIntArray400 = new int[Class43.aClass94_Sub1_431.widgetLen(19)];
		aStringArray403 = new String[Class43.aClass94_Sub1_431.widgetLen(15)];
		aBoolArray402 = new boolean[anIntArray400.length];

		int var1;
		for (var1 = 0; var1 < anIntArray400.length; ++var1) {
			final Def19 var2 = Class124_Sub7.method526(var1);
			aBoolArray402[var1] = var2.aBool1438;
		}

		aBoolArray405 = new boolean[aStringArray403.length];

		for (var1 = 0; var1 < aStringArray403.length; ++var1) {
			final Def15 var3 = Class4.method24(var1);
			aBoolArray405[var1] = var3.aBool1550;
		}

		for (var1 = 0; var1 < anIntArray400.length; ++var1)
			anIntArray400[var1] = -1;

		method204();
	}

	void method203(final int var1, final int var2) {
		anIntArray400[var1] = var2;
		if (aBoolArray402[var1])
			aBool404 = true;

	}

	void method204() {
		final Class127 var1 = method211(false);
		boolean var23 = false;

		try {
			label186: {
				try {
					var23 = true;
					final byte[] var2 = new byte[(int) var1.method460()];

					int var4;
					for (int var3 = 0; var3 < var2.length; var3 += var4) {
						var4 = var1.method459(var2, var3, var2.length - var3);
						if (var4 == -1)
							throw new EOFException();
					}

					final RSBuf var5 = new RSBuf(var2);
					if ((var5.backing.length - var5.pos) < 1) {
						try {
							var1.method461();
						} catch (final Exception var26) {
							;
						}

						return;
					}

					final int var7 = var5.readByteU();
					if ((var7 < 0) || (var7 > 1)) {
						try {
							var1.method461();
						} catch (final Exception var28) {
							;
						}

						return;
					}

					final int var9 = var5.readShortU();

					int var10;
					int var11;
					int var12;
					for (var10 = 0; var10 < var9; ++var10) {
						var11 = var5.readShortU();
						var12 = var5.readInt2(-1149281285);
						if (aBoolArray402[var11])
							anIntArray400[var11] = var12;
					}

					var10 = var5.readShortU();

					for (var11 = 0; var11 < var10; ++var11) {
						var12 = var5.readShortU();
						final String var13 = var5.readStr2();
						if (aBoolArray405[var12])
							aStringArray403[var12] = var13;
					}
				} catch (final Exception var29) {
					try {
						var1.method461();
						var23 = false;
					} catch (final Exception var25) {
						var23 = false;
					}
					break label186;
				}

				try {
					var1.method461();
					var23 = false;
				} catch (final Exception var27) {
					var23 = false;
				}
			}
		} finally {
			if (var23)
				try {
					var1.method461();
				} catch (final Exception var24) {
					;
				}
		}

		aBool404 = false;
	}

	void method205() {
		if (aBool404 && (aLong401 < (Class74.method316(145057689) - 60000L)))
			method207();

	}

	String method206(final int var1) {
		return aStringArray403[var1];
	}

	void method207() {
		final Class127 var1 = method211(true);
		boolean var16 = false;

		try {
			label183: {
				try {
					var16 = true;
					int var2 = 3;
					int var3 = 0;

					int var4;
					for (var4 = 0; var4 < anIntArray400.length; ++var4)
						if (aBoolArray402[var4] && (anIntArray400[var4] != -1)) {
							var2 += 6;
							++var3;
						}

					var2 += 2;
					var4 = 0;

					for (int var5 = 0; var5 < aStringArray403.length; ++var5)
						if (aBoolArray405[var5] && (null != aStringArray403[var5])) {
							var2 += 2 + Class54.len(aStringArray403[var5]);
							++var4;
						}

					final RSBuf var6 = new RSBuf(var2);
					var6.writeByte(1);
					var6.writeShort(var3);

					int var7;
					for (var7 = 0; var7 < anIntArray400.length; ++var7)
						if (aBoolArray402[var7] && (anIntArray400[var7] != -1)) {
							var6.writeShort(var7);
							var6.writeInt(anIntArray400[var7]);
						}

					var6.writeShort(var4);
					var7 = 0;

					while (true) {
						if (var7 >= aStringArray403.length) {
							var1.method458(var6.backing, 0, var6.pos);
							break;
						}

						if (aBoolArray405[var7] && (aStringArray403[var7] != null)) {
							var6.writeShort(var7);
							var6.writestr(aStringArray403[var7]);
						}

						++var7;
					}
				} catch (final Exception var20) {
					try {
						var1.method461();
						var16 = false;
					} catch (final Exception var18) {
						var16 = false;
					}
					break label183;
				}

				try {
					var1.method461();
					var16 = false;
				} catch (final Exception var19) {
					var16 = false;
				}
			}
		} finally {
			if (var16)
				try {
					var1.method461();
				} catch (final Exception var17) {
					;
				}
		}

		aBool404 = false;
		aLong401 = Class74.method316(-884453515);
	}

	int method208(final int var1) {
		return anIntArray400[var1];
	}

	void method209(final int var1, final String var2) {
		aStringArray403[var1] = var2;
		if (aBoolArray405[var1])
			aBool404 = true;

	}

	boolean method210() {
		return aBool404;
	}

	Class127 method211(final boolean var1) {
		return Class124_Sub22_Sub19_Sub5.method960("2", client.aClass88_1987.aString700, var1);
	}

	static Widget method212(final Widget var0) {
		Widget var1 = var0;
		final int var2 = RuntimeException_Sub1.method1012(Class124_Sub22_Sub19_Sub6.method963(var0), -340049242);
		Widget var5;
		if (var2 == 0)
			var5 = null;
		else {
			int var3 = 0;

			while (true) {
				if (var3 >= var2) {
					var5 = var1;
					break;
				}

				var1 = Class10.getwidget(var1.anInt1259);
				if (null == var1) {
					var5 = null;
					break;
				}

				++var3;
			}
		}

		Widget var4 = var5;
		if (null == var5)
			var4 = var0.aClass124_Sub17_1251;

		return var4;
	}

	public static int clever(final byte[] var0, final int var1, final int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4)
			var3 = (var3 >>> 8) ^ RSBuf.anIntArray1074[(var3 ^ var0[var4]) & 255];

		var3 = ~var3;
		return var3;
	}
}
