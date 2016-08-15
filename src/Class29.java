public class Class29 implements Runnable {
	static Class124_Sub17 aClass124_Sub17_314;
	int anInt315 = 0;
	boolean aBool317 = true;
	Object anObject319 = new Object();
	int[] anIntArray316 = new int[500];
	int[] anIntArray318 = new int[500];

	public static boolean method169() {
		return Class96.anInt770 != 0 ? true : Class77.aClass124_Sub4_Sub3_624.method852();
	}

	@Override
	public void run() {
		for (; aBool317; client.method1067(50L)) {
			final Object var1 = anObject319;
			synchronized (var1) {
				if (anInt315 < 500) {
					anIntArray316[anInt315] = Class81.anInt652;
					anIntArray318[anInt315] = Class81.anInt653;
					++anInt315;
				}
			}
		}

	}

	static final void method170(final int var0, final int var1, final int var2, final int var3, final int var4) {
		int var5 = Class36.aClass21_380.method136(var0, var1, var2);
		int var9;
		int var11;
		int var12;
		int var13;
		int var15;
		int var20;
		if (var5 != 0) {
			var12 = Class36.aClass21_380.method141(var0, var1, var2, var5);
			var20 = (var12 >> 6) & 3;
			var13 = var12 & 31;
			var11 = var3;
			if (var5 > 0)
				var11 = var4;

			final int[] var10 = Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954.anIntArray1735;
			var9 = (4 * var1) + 24624 + ((103 - var2) * 2048);
			var15 = (var5 >> 14) & 32767;
			final Class124_Sub22_Sub6 var16 = Class124_Sub22_Sub12.method736(var15);
			if (var16.anInt1402 != -1) {
				final Class124_Sub22_Sub16_Sub2 var17 = Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435[var16.anInt1402];
				if (var17 != null) {
					final int var18 = ((var16.anInt1401 * 4) - var17.anInt1738) / 2;
					final int var19 = ((var16.anInt1432 * 4) - var17.anInt1736) / 2;
					var17.method926(48 + (var1 * 4) + var18, 48 + (4 * (104 - var2 - var16.anInt1432)) + var19);
				}
			} else {
				if ((var13 == 0) || (var13 == 2))
					if (var20 == 0) {
						var10[var9] = var11;
						var10[512 + var9] = var11;
						var10[var9 + 1024] = var11;
						var10[var9 + 1536] = var11;
					} else if (var20 == 1) {
						var10[var9] = var11;
						var10[1 + var9] = var11;
						var10[var9 + 2] = var11;
						var10[var9 + 3] = var11;
					} else if (var20 == 2) {
						var10[var9 + 3] = var11;
						var10[var9 + 3 + 512] = var11;
						var10[1024 + var9 + 3] = var11;
						var10[1536 + var9 + 3] = var11;
					} else if (var20 == 3) {
						var10[var9 + 1536] = var11;
						var10[1 + 1536 + var9] = var11;
						var10[1536 + var9 + 2] = var11;
						var10[1536 + var9 + 3] = var11;
					}

				if (var13 == 3)
					if (var20 == 0)
						var10[var9] = var11;
					else if (var20 == 1)
						var10[3 + var9] = var11;
					else if (var20 == 2)
						var10[3 + var9 + 1536] = var11;
					else if (var20 == 3)
						var10[1536 + var9] = var11;

				if (var13 == 2)
					if (var20 == 3) {
						var10[var9] = var11;
						var10[512 + var9] = var11;
						var10[var9 + 1024] = var11;
						var10[var9 + 1536] = var11;
					} else if (var20 == 0) {
						var10[var9] = var11;
						var10[1 + var9] = var11;
						var10[var9 + 2] = var11;
						var10[var9 + 3] = var11;
					} else if (var20 == 1) {
						var10[3 + var9] = var11;
						var10[512 + var9 + 3] = var11;
						var10[1024 + var9 + 3] = var11;
						var10[1536 + 3 + var9] = var11;
					} else if (var20 == 2) {
						var10[1536 + var9] = var11;
						var10[1 + var9 + 1536] = var11;
						var10[1536 + var9 + 2] = var11;
						var10[3 + 1536 + var9] = var11;
					}
			}
		}

		var5 = Class36.aClass21_380.method121(var0, var1, var2);
		if (var5 != 0) {
			var12 = Class36.aClass21_380.method141(var0, var1, var2, var5);
			var20 = (var12 >> 6) & 3;
			var13 = var12 & 31;
			var11 = (var5 >> 14) & 32767;
			final Class124_Sub22_Sub6 var23 = Class124_Sub22_Sub12.method736(var11);
			int var8;
			if (var23.anInt1402 != -1) {
				final Class124_Sub22_Sub16_Sub2 var14 = Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435[var23.anInt1402];
				if (null != var14) {
					var15 = ((var23.anInt1401 * 4) - var14.anInt1738) / 2;
					var8 = ((var23.anInt1432 * 4) - var14.anInt1736) / 2;
					var14.method926(var15 + (var1 * 4) + 48, (4 * (104 - var2 - var23.anInt1432)) + 48 + var8);
				}
			} else if (var13 == 9) {
				var9 = 15658734;
				if (var5 > 0)
					var9 = 15597568;

				final int[] var7 = Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954.anIntArray1735;
				var8 = (2048 * (103 - var2)) + (4 * var1) + 24624;
				if ((var20 != 0) && (var20 != 2)) {
					var7[var8] = var9;
					var7[512 + var8 + 1] = var9;
					var7[2 + 1024 + var8] = var9;
					var7[3 + 1536 + var8] = var9;
				} else {
					var7[1536 + var8] = var9;
					var7[var8 + 1024 + 1] = var9;
					var7[512 + var8 + 2] = var9;
					var7[var8 + 3] = var9;
				}
			}
		}

		var5 = Class36.aClass21_380.method126(var0, var1, var2);
		if (var5 != 0) {
			var12 = (var5 >> 14) & 32767;
			final Class124_Sub22_Sub6 var22 = Class124_Sub22_Sub12.method736(var12);
			if (var22.anInt1402 != -1) {
				final Class124_Sub22_Sub16_Sub2 var6 = Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435[var22.anInt1402];
				if (var6 != null) {
					var11 = ((var22.anInt1401 * 4) - var6.anInt1738) / 2;
					final int var21 = ((var22.anInt1432 * 4) - var6.anInt1736) / 2;
					var6.method926(var11 + 48 + (4 * var1), var21 + 48 + (4 * (104 - var2 - var22.anInt1432)));
				}
			}
		}

	}

	public static boolean method171(final int var0) {
		return ((var0 >> 30) & 1) != 0;
	}
}
