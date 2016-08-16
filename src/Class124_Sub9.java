public class Class124_Sub9 extends Node {
	String aString1026;
	int anInt1027;
	byte aByte1028;
	String aString1029;

	public static void method532(final CacheArch var0) {
		Def15.aClass94_1551 = var0;
	}

	static final int method533(final int var0, final int var1) {
		final int var2 = Class71.method306(var0 - 1, var1 - 1) + Class71.method306(var0 + 1, var1 - 1)
				+ Class71.method306(var0 - 1, var1 + 1) + Class71.method306(var0 + 1, var1 + 1);
		final int var4 = Class71.method306(var0 - 1, var1) + Class71.method306(var0 + 1, var1)
				+ Class71.method306(var0, var1 - 1) + Class71.method306(var0, 1 + var1);
		final int var3 = Class71.method306(var0, var1);
		return (var3 / 4) + (var4 / 8) + (var2 / 16);
	}

	static final void method534(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final Class21 var6, final Class130 var7) {
		if (client.aBool1989 && ((Class27.aByteArrayArrayArray285[0][var1][var2] & 2) == 0)) {
			if ((Class27.aByteArrayArrayArray285[var0][var1][var2] & 16) != 0)
				return;

			if (Def15.method754(var0, var1, var2) != client.anInt2006)
				return;
		}

		if (var0 < Class27.anInt290)
			Class27.anInt290 = var0;

		final Def6 var9 = Def13.method736(var3);
		int var10;
		int var11;
		if ((var4 != 1) && (var4 != 3)) {
			var10 = var9.anInt1401;
			var11 = var9.anInt1432;
		} else {
			var10 = var9.anInt1432;
			var11 = var9.anInt1401;
		}

		int var12;
		int var13;
		if ((var1 + var10) <= 104) {
			var13 = (var10 >> 1) + var1;
			var12 = ((1 + var10) >> 1) + var1;
		} else {
			var13 = var1;
			var12 = 1 + var1;
		}

		int var14;
		int var18;
		if ((var11 + var2) <= 104) {
			var14 = var2 + (var11 >> 1);
			var18 = ((1 + var11) >> 1) + var2;
		} else {
			var14 = var2;
			var18 = 1 + var2;
		}

		final int[][] var17 = Class27.anIntArrayArrayArray284[var0];
		final int var19 = (var17[var13][var18] + var17[var12][var14] + var17[var13][var14] + var17[var12][var18]) >> 2;
		final int var25 = (var10 << 6) + (var1 << 7);
		final int var20 = (var2 << 7) + (var11 << 6);
		int var16 = 1073741824 + (var3 << 14) + (var2 << 7) + var1;
		if (var9.anInt1405 == 0)
			var16 -= Integer.MIN_VALUE;

		int var21 = var5 + (var4 << 6);
		if (var9.anInt1386 == 1)
			var21 += 256;

		if (var9.method689())
			Class68.method300(var0, var1, var2, var9, var4);

		Object var22;
		if (var5 == 22) {
			if (!client.aBool1989 || (var9.anInt1405 != 0) || (var9.anInt1403 == 1) || var9.aBool1415) {
				if ((var9.anInt1409 == -1) && (null == var9.anIntArray1427))
					var22 = var9.method681(22, var4, var17, var25, var19, var20);
				else
					var22 = new Class124_Sub22_Sub19_Sub6(var3, 22, var4, var0, var1, var2, var9.anInt1409, true,
							(Class124_Sub22_Sub19) null);

				var6.method103(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22, var16, var21);
				if ((var9.anInt1403 == 1) && (var7 != null))
					var7.method470(var1, var2);

			}
		} else {
			int var8;
			if ((var5 != 10) && (var5 != 11)) {
				if (var5 >= 12) {
					if ((var9.anInt1409 == -1) && (null == var9.anIntArray1427))
						var22 = var9.method681(var5, var4, var17, var25, var19, var20);
					else
						var22 = new Class124_Sub22_Sub19_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt1409, true,
								(Class124_Sub22_Sub19) null);

					var6.method129(var0, var1, var2, var19, 1, 1, (Class124_Sub22_Sub19) var22, 0, var16, var21);
					if ((var5 >= 12) && (var5 <= 17) && (var5 != 13) && (var0 > 0))
						Class27.anIntArrayArrayArray304[var0][var1][var2] |= 2340;

					if ((var9.anInt1403 != 0) && (var7 != null))
						var7.method466(var1, var2, var10, var11, var9.aBool1436);

				} else if (var5 == 0) {
					if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
						var22 = var9.method681(0, var4, var17, var25, var19, var20);
					else
						var22 = new Class124_Sub22_Sub19_Sub6(var3, 0, var4, var0, var1, var2, var9.anInt1409, true,
								(Class124_Sub22_Sub19) null);

					var6.method109(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22, (Class124_Sub22_Sub19) null,
							Class27.anIntArray294[var4], 0, var16, var21);
					if (var4 == 0) {
						if (var9.aBool1417) {
							Class27.aByteArrayArrayArray289[var0][var1][var2] = 50;
							Class27.aByteArrayArrayArray289[var0][var1][var2 + 1] = 50;
						}

						if (var9.aBool1408)
							Class27.anIntArrayArrayArray304[var0][var1][var2] |= 585;
					} else if (var4 == 1) {
						if (var9.aBool1417) {
							Class27.aByteArrayArrayArray289[var0][var1][var2 + 1] = 50;
							Class27.aByteArrayArrayArray289[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var9.aBool1408)
							Class27.anIntArrayArrayArray304[var0][var1][1 + var2] |= 1170;
					} else if (var4 == 2) {
						if (var9.aBool1417) {
							Class27.aByteArrayArrayArray289[var0][1 + var1][var2] = 50;
							Class27.aByteArrayArrayArray289[var0][1 + var1][1 + var2] = 50;
						}

						if (var9.aBool1408)
							Class27.anIntArrayArrayArray304[var0][1 + var1][var2] |= 585;
					} else if (var4 == 3) {
						if (var9.aBool1417) {
							Class27.aByteArrayArrayArray289[var0][var1][var2] = 50;
							Class27.aByteArrayArrayArray289[var0][1 + var1][var2] = 50;
						}

						if (var9.aBool1408)
							Class27.anIntArrayArrayArray304[var0][var1][var2] |= 1170;
					}

					if ((var9.anInt1403 != 0) && (var7 != null))
						var7.method464(var1, var2, var5, var4, var9.aBool1436);

					if (var9.anInt1423 != 16)
						var6.method110(var0, var1, var2, var9.anInt1423);

				} else if (var5 == 1) {
					if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
						var22 = var9.method681(1, var4, var17, var25, var19, var20);
					else
						var22 = new Class124_Sub22_Sub19_Sub6(var3, 1, var4, var0, var1, var2, var9.anInt1409, true,
								(Class124_Sub22_Sub19) null);

					var6.method109(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22, (Class124_Sub22_Sub19) null,
							Class27.anIntArray286[var4], 0, var16, var21);
					if (var9.aBool1417)
						if (var4 == 0)
							Class27.aByteArrayArrayArray289[var0][var1][1 + var2] = 50;
						else if (var4 == 1)
							Class27.aByteArrayArrayArray289[var0][var1 + 1][1 + var2] = 50;
						else if (var4 == 2)
							Class27.aByteArrayArrayArray289[var0][var1 + 1][var2] = 50;
						else if (var4 == 3)
							Class27.aByteArrayArrayArray289[var0][var1][var2] = 50;

					if ((var9.anInt1403 != 0) && (null != var7))
						var7.method464(var1, var2, var5, var4, var9.aBool1436);

				} else {
					int var15;
					Object var26;
					if (var5 == 2) {
						var15 = (1 + var4) & 3;
						Object var27;
						if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null)) {
							var27 = var9.method681(2, var4 + 4, var17, var25, var19, var20);
							var26 = var9.method681(2, var15, var17, var25, var19, var20);
						} else {
							var27 = new Class124_Sub22_Sub19_Sub6(var3, 2, var4 + 4, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);
							var26 = new Class124_Sub22_Sub19_Sub6(var3, 2, var15, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);
						}

						var6.method109(var0, var1, var2, var19, (Class124_Sub22_Sub19) var27,
								(Class124_Sub22_Sub19) var26, Class27.anIntArray294[var4], Class27.anIntArray294[var15],
								var16, var21);
						if (var9.aBool1408)
							if (var4 == 0) {
								Class27.anIntArrayArrayArray304[var0][var1][var2] |= 585;
								Class27.anIntArrayArrayArray304[var0][var1][1 + var2] |= 1170;
							} else if (var4 == 1) {
								Class27.anIntArrayArrayArray304[var0][var1][var2 + 1] |= 1170;
								Class27.anIntArrayArrayArray304[var0][var1 + 1][var2] |= 585;
							} else if (var4 == 2) {
								Class27.anIntArrayArrayArray304[var0][var1 + 1][var2] |= 585;
								Class27.anIntArrayArrayArray304[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								Class27.anIntArrayArrayArray304[var0][var1][var2] |= 1170;
								Class27.anIntArrayArrayArray304[var0][var1][var2] |= 585;
							}

						if ((var9.anInt1403 != 0) && (null != var7))
							var7.method464(var1, var2, var5, var4, var9.aBool1436);

						if (var9.anInt1423 != 16)
							var6.method110(var0, var1, var2, var9.anInt1423);

					} else if (var5 == 3) {
						if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
							var22 = var9.method681(3, var4, var17, var25, var19, var20);
						else
							var22 = new Class124_Sub22_Sub19_Sub6(var3, 3, var4, var0, var1, var2, var9.anInt1409, true,
									(Class124_Sub22_Sub19) null);

						var6.method109(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22,
								(Class124_Sub22_Sub19) null, Class27.anIntArray286[var4], 0, var16, var21);
						if (var9.aBool1417)
							if (var4 == 0)
								Class27.aByteArrayArrayArray289[var0][var1][1 + var2] = 50;
							else if (var4 == 1)
								Class27.aByteArrayArrayArray289[var0][1 + var1][var2 + 1] = 50;
							else if (var4 == 2)
								Class27.aByteArrayArrayArray289[var0][var1 + 1][var2] = 50;
							else if (var4 == 3)
								Class27.aByteArrayArrayArray289[var0][var1][var2] = 50;

						if ((var9.anInt1403 != 0) && (null != var7))
							var7.method464(var1, var2, var5, var4, var9.aBool1436);

					} else if (var5 == 9) {
						if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
							var22 = var9.method681(var5, var4, var17, var25, var19, var20);
						else
							var22 = new Class124_Sub22_Sub19_Sub6(var3, var5, var4, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var6.method129(var0, var1, var2, var19, 1, 1, (Class124_Sub22_Sub19) var22, 0, var16, var21);
						if ((var9.anInt1403 != 0) && (null != var7))
							var7.method466(var1, var2, var10, var11, var9.aBool1436);

						if (var9.anInt1423 != 16)
							var6.method110(var0, var1, var2, var9.anInt1423);

					} else if (var5 == 4) {
						if ((var9.anInt1409 == -1) && (null == var9.anIntArray1427))
							var22 = var9.method681(4, var4, var17, var25, var19, var20);
						else
							var22 = new Class124_Sub22_Sub19_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt1409, true,
									(Class124_Sub22_Sub19) null);

						var6.method105(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22,
								(Class124_Sub22_Sub19) null, Class27.anIntArray294[var4], 0, 0, 0, var16, var21);
					} else if (var5 == 5) {
						var15 = 16;
						var8 = var6.method136(var0, var1, var2);
						if (var8 != 0)
							var15 = Def13.method736((var8 >> 14) & 32767).anInt1423;

						if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
							var26 = var9.method681(4, var4, var17, var25, var19, var20);
						else
							var26 = new Class124_Sub22_Sub19_Sub6(var3, 4, var4, var0, var1, var2, var9.anInt1409, true,
									(Class124_Sub22_Sub19) null);

						var6.method105(var0, var1, var2, var19, (Class124_Sub22_Sub19) var26,
								(Class124_Sub22_Sub19) null, Class27.anIntArray294[var4], 0,
								Class27.anIntArray295[var4] * var15, Class27.anIntArray296[var4] * var15, var16, var21);
					} else if (var5 == 6) {
						var15 = 8;
						var8 = var6.method136(var0, var1, var2);
						if (var8 != 0)
							var15 = Def13.method736((var8 >> 14) & 32767).anInt1423 / 2;

						if ((var9.anInt1409 == -1) && (null == var9.anIntArray1427))
							var26 = var9.method681(4, 4 + var4, var17, var25, var19, var20);
						else
							var26 = new Class124_Sub22_Sub19_Sub6(var3, 4, var4 + 4, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var6.method105(var0, var1, var2, var19, (Class124_Sub22_Sub19) var26,
								(Class124_Sub22_Sub19) null, 256, var4, var15 * Class27.anIntArray297[var4],
								Class27.anIntArray298[var4] * var15, var16, var21);
					} else if (var5 == 7) {
						var8 = (2 + var4) & 3;
						if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
							var22 = var9.method681(4, var8 + 4, var17, var25, var19, var20);
						else
							var22 = new Class124_Sub22_Sub19_Sub6(var3, 4, 4 + var8, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var6.method105(var0, var1, var2, var19, (Class124_Sub22_Sub19) var22,
								(Class124_Sub22_Sub19) null, 256, var8, 0, 0, var16, var21);
					} else if (var5 == 8) {
						var15 = 8;
						var8 = var6.method136(var0, var1, var2);
						if (var8 != 0)
							var15 = Def13.method736((var8 >> 14) & 32767).anInt1423 / 2;

						final int var28 = (2 + var4) & 3;
						Object var29;
						if ((var9.anInt1409 == -1) && (null == var9.anIntArray1427)) {
							var26 = var9.method681(4, 4 + var4, var17, var25, var19, var20);
							var29 = var9.method681(4, 4 + var28, var17, var25, var19, var20);
						} else {
							var26 = new Class124_Sub22_Sub19_Sub6(var3, 4, var4 + 4, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);
							var29 = new Class124_Sub22_Sub19_Sub6(var3, 4, 4 + var28, var0, var1, var2, var9.anInt1409,
									true, (Class124_Sub22_Sub19) null);
						}

						var6.method105(var0, var1, var2, var19, (Class124_Sub22_Sub19) var26,
								(Class124_Sub22_Sub19) var29, 256, var4, Class27.anIntArray297[var4] * var15,
								Class27.anIntArray298[var4] * var15, var16, var21);
					}
				}
			} else {
				if ((var9.anInt1409 == -1) && (var9.anIntArray1427 == null))
					var22 = var9.method681(10, var4, var17, var25, var19, var20);
				else
					var22 = new Class124_Sub22_Sub19_Sub6(var3, 10, var4, var0, var1, var2, var9.anInt1409, true,
							(Class124_Sub22_Sub19) null);

				if ((var22 != null) && var6.method129(var0, var1, var2, var19, var10, var11,
						(Class124_Sub22_Sub19) var22, var5 == 11 ? 256 : 0, var16, var21) && var9.aBool1417) {
					var8 = 15;
					if (var22 instanceof Class124_Sub22_Sub19_Sub7) {
						var8 = ((Class124_Sub22_Sub19_Sub7) var22).method991() / 4;
						if (var8 > 30)
							var8 = 30;
					}

					for (int var23 = 0; var23 <= var10; ++var23)
						for (int var24 = 0; var24 <= var11; ++var24)
							if (var8 > Class27.aByteArrayArrayArray289[var0][var23 + var1][var24 + var2])
								Class27.aByteArrayArrayArray289[var0][var23 + var1][var24 + var2] = (byte) var8;
				}

				if ((var9.anInt1403 != 0) && (null != var7))
					var7.method466(var1, var2, var10, var11, var9.aBool1436);

			}
		}
	}
}
