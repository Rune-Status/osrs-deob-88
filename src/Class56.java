public abstract class Class56 {
	static final void method264(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6) {
		if ((var2 >= 1) && (var3 >= 1) && (var2 <= 102) && (var3 <= 102)) {
			if (client.aBool1989 && (Class134.anInt906 != var0))
				return;

			int var16 = 0;
			if (var1 == 0)
				var16 = Class36.aClass21_380.method136(var0, var2, var3);

			if (var1 == 1)
				var16 = Class36.aClass21_380.method120(var0, var2, var3);

			if (var1 == 2)
				var16 = Class36.aClass21_380.method121(var0, var2, var3);

			if (var1 == 3)
				var16 = Class36.aClass21_380.method126(var0, var2, var3);

			int var18;
			if (var16 != 0) {
				var18 = Class36.aClass21_380.method141(var0, var2, var3, var16);
				final int var36 = (var16 >> 14) & 32767;
				final int var37 = var18 & 31;
				final int var35 = (var18 >> 6) & 3;
				Def6 var8;
				if (var1 == 0) {
					Class36.aClass21_380.method125(var0, var2, var3);
					var8 = Def13.method736(var36);
					if (var8.anInt1403 != 0)
						client.aClass130Array2192[var0].method472(var2, var3, var37, var35, var8.aBool1436);
				}

				if (var1 == 1)
					Class36.aClass21_380.method112(var0, var2, var3);

				if (var1 == 2) {
					Class36.aClass21_380.method107(var0, var2, var3);
					var8 = Def13.method736(var36);
					if (((var2 + var8.anInt1401) > 103) || ((var3 + var8.anInt1401) > 103)
							|| ((var2 + var8.anInt1432) > 103) || ((var8.anInt1432 + var3) > 103))
						return;

					if (var8.anInt1403 != 0)
						client.aClass130Array2192[var0].method467(var2, var3, var8.anInt1401, var8.anInt1432, var35,
								var8.aBool1436);
				}

				if (var1 == 3) {
					Class36.aClass21_380.method139(var0, var2, var3);
					var8 = Def13.method736(var36);
					if (var8.anInt1403 == 1)
						client.aClass130Array2192[var0].method469(var2, var3);
				}
			}

			if (var4 >= 0) {
				var18 = var0;
				if ((var0 < 3) && ((Class27.aByteArrayArrayArray285[1][var2][var3] & 2) == 2))
					var18 = var0 + 1;

				final Class21 var34 = Class36.aClass21_380;
				final Class130 var27 = client.aClass130Array2192[var0];
				final Def6 var7 = Def13.method736(var4);
				int var10;
				int var11;
				if ((var5 != 1) && (var5 != 3)) {
					var10 = var7.anInt1401;
					var11 = var7.anInt1432;
				} else {
					var10 = var7.anInt1432;
					var11 = var7.anInt1401;
				}

				int var29;
				int var30;
				if ((var10 + var2) <= 104) {
					var29 = var2 + (var10 >> 1);
					var30 = ((1 + var10) >> 1) + var2;
				} else {
					var29 = var2;
					var30 = 1 + var2;
				}

				int var21;
				int var28;
				if ((var3 + var11) <= 104) {
					var21 = var3 + (var11 >> 1);
					var28 = var3 + ((var11 + 1) >> 1);
				} else {
					var21 = var3;
					var28 = 1 + var3;
				}

				final int[][] var24 = Class27.anIntArrayArrayArray284[var18];
				final int var9 = (var24[var30][var28] + var24[var29][var28] + var24[var30][var21]
						+ var24[var29][var21]) >> 2;
				final int var25 = (var10 << 6) + (var2 << 7);
				final int var26 = (var11 << 6) + (var3 << 7);
				int var13 = var2 + (var3 << 7) + (var4 << 14) + 1073741824;
				if (var7.anInt1405 == 0)
					var13 -= Integer.MIN_VALUE;

				int var14 = (var5 << 6) + var6;
				if (var7.anInt1386 == 1)
					var14 += 256;

				Object var12;
				if (var6 == 22) {
					if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
						var12 = var7.method682(22, var5, var24, var25, var9, var26);
					else
						var12 = new Class124_Sub22_Sub19_Sub6(var4, 22, var5, var18, var2, var3, var7.anInt1409, true,
								(Class124_Sub22_Sub19) null);

					var34.method103(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12, var13, var14);
					if (var7.anInt1403 == 1)
						var27.method470(var2, var3);
				} else if ((var6 != 10) && (var6 != 11)) {
					if (var6 >= 12) {
						if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null))
							var12 = var7.method682(var6, var5, var24, var25, var9, var26);
						else
							var12 = new Class124_Sub22_Sub19_Sub6(var4, var6, var5, var18, var2, var3, var7.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var34.method129(var0, var2, var3, var9, 1, 1, (Class124_Sub22_Sub19) var12, 0, var13, var14);
						if (var7.anInt1403 != 0)
							var27.method466(var2, var3, var10, var11, var7.aBool1436);
					} else if (var6 == 0) {
						if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
							var12 = var7.method682(0, var5, var24, var25, var9, var26);
						else
							var12 = new Class124_Sub22_Sub19_Sub6(var4, 0, var5, var18, var2, var3, var7.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var34.method109(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12,
								(Class124_Sub22_Sub19) null, Class27.anIntArray294[var5], 0, var13, var14);
						if (var7.anInt1403 != 0)
							var27.method464(var2, var3, var6, var5, var7.aBool1436);
					} else if (var6 == 1) {
						if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
							var12 = var7.method682(1, var5, var24, var25, var9, var26);
						else
							var12 = new Class124_Sub22_Sub19_Sub6(var4, 1, var5, var18, var2, var3, var7.anInt1409,
									true, (Class124_Sub22_Sub19) null);

						var34.method109(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12,
								(Class124_Sub22_Sub19) null, Class27.anIntArray286[var5], 0, var13, var14);
						if (var7.anInt1403 != 0)
							var27.method464(var2, var3, var6, var5, var7.aBool1436);
					} else {
						int var15;
						Object var22;
						if (var6 == 2) {
							var15 = (1 + var5) & 3;
							Object var31;
							if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427)) {
								var31 = var7.method682(2, 4 + var5, var24, var25, var9, var26);
								var22 = var7.method682(2, var15, var24, var25, var9, var26);
							} else {
								var31 = new Class124_Sub22_Sub19_Sub6(var4, 2, var5 + 4, var18, var2, var3,
										var7.anInt1409, true, (Class124_Sub22_Sub19) null);
								var22 = new Class124_Sub22_Sub19_Sub6(var4, 2, var15, var18, var2, var3, var7.anInt1409,
										true, (Class124_Sub22_Sub19) null);
							}

							var34.method109(var0, var2, var3, var9, (Class124_Sub22_Sub19) var31,
									(Class124_Sub22_Sub19) var22, Class27.anIntArray294[var5],
									Class27.anIntArray294[var15], var13, var14);
							if (var7.anInt1403 != 0)
								var27.method464(var2, var3, var6, var5, var7.aBool1436);
						} else if (var6 == 3) {
							if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null))
								var12 = var7.method682(3, var5, var24, var25, var9, var26);
							else
								var12 = new Class124_Sub22_Sub19_Sub6(var4, 3, var5, var18, var2, var3, var7.anInt1409,
										true, (Class124_Sub22_Sub19) null);

							var34.method109(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12,
									(Class124_Sub22_Sub19) null, Class27.anIntArray286[var5], 0, var13, var14);
							if (var7.anInt1403 != 0)
								var27.method464(var2, var3, var6, var5, var7.aBool1436);
						} else if (var6 == 9) {
							if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
								var12 = var7.method682(var6, var5, var24, var25, var9, var26);
							else
								var12 = new Class124_Sub22_Sub19_Sub6(var4, var6, var5, var18, var2, var3,
										var7.anInt1409, true, (Class124_Sub22_Sub19) null);

							var34.method129(var0, var2, var3, var9, 1, 1, (Class124_Sub22_Sub19) var12, 0, var13,
									var14);
							if (var7.anInt1403 != 0)
								var27.method466(var2, var3, var10, var11, var7.aBool1436);
						} else if (var6 == 4) {
							if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
								var12 = var7.method682(4, var5, var24, var25, var9, var26);
							else
								var12 = new Class124_Sub22_Sub19_Sub6(var4, 4, var5, var18, var2, var3, var7.anInt1409,
										true, (Class124_Sub22_Sub19) null);

							var34.method105(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12,
									(Class124_Sub22_Sub19) null, Class27.anIntArray294[var5], 0, 0, 0, var13, var14);
						} else {
							int var23;
							if (var6 == 5) {
								var15 = 16;
								var23 = var34.method136(var0, var2, var3);
								if (var23 != 0)
									var15 = Def13.method736((var23 >> 14) & 32767).anInt1423;

								if ((var7.anInt1409 == -1) && (null == var7.anIntArray1427))
									var22 = var7.method682(4, var5, var24, var25, var9, var26);
								else
									var22 = new Class124_Sub22_Sub19_Sub6(var4, 4, var5, var18, var2, var3,
											var7.anInt1409, true, (Class124_Sub22_Sub19) null);

								var34.method105(var0, var2, var3, var9, (Class124_Sub22_Sub19) var22,
										(Class124_Sub22_Sub19) null, Class27.anIntArray294[var5], 0,
										Class27.anIntArray295[var5] * var15, Class27.anIntArray296[var5] * var15, var13,
										var14);
							} else if (var6 == 6) {
								var15 = 8;
								var23 = var34.method136(var0, var2, var3);
								if (var23 != 0)
									var15 = Def13.method736((var23 >> 14) & 32767).anInt1423 / 2;

								if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null))
									var22 = var7.method682(4, var5 + 4, var24, var25, var9, var26);
								else
									var22 = new Class124_Sub22_Sub19_Sub6(var4, 4, var5 + 4, var18, var2, var3,
											var7.anInt1409, true, (Class124_Sub22_Sub19) null);

								var34.method105(var0, var2, var3, var9, (Class124_Sub22_Sub19) var22,
										(Class124_Sub22_Sub19) null, 256, var5, Class27.anIntArray297[var5] * var15,
										var15 * Class27.anIntArray298[var5], var13, var14);
							} else if (var6 == 7) {
								var23 = (var5 + 2) & 3;
								if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null))
									var12 = var7.method682(4, var23 + 4, var24, var25, var9, var26);
								else
									var12 = new Class124_Sub22_Sub19_Sub6(var4, 4, 4 + var23, var18, var2, var3,
											var7.anInt1409, true, (Class124_Sub22_Sub19) null);

								var34.method105(var0, var2, var3, var9, (Class124_Sub22_Sub19) var12,
										(Class124_Sub22_Sub19) null, 256, var23, 0, 0, var13, var14);
							} else if (var6 == 8) {
								var15 = 8;
								var23 = var34.method136(var0, var2, var3);
								if (var23 != 0)
									var15 = Def13.method736((var23 >> 14) & 32767).anInt1423 / 2;

								final int var32 = (var5 + 2) & 3;
								Object var33;
								if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null)) {
									var22 = var7.method682(4, 4 + var5, var24, var25, var9, var26);
									var33 = var7.method682(4, 4 + var32, var24, var25, var9, var26);
								} else {
									var22 = new Class124_Sub22_Sub19_Sub6(var4, 4, var5 + 4, var18, var2, var3,
											var7.anInt1409, true, (Class124_Sub22_Sub19) null);
									var33 = new Class124_Sub22_Sub19_Sub6(var4, 4, 4 + var32, var18, var2, var3,
											var7.anInt1409, true, (Class124_Sub22_Sub19) null);
								}

								var34.method105(var0, var2, var3, var9, (Class124_Sub22_Sub19) var22,
										(Class124_Sub22_Sub19) var33, 256, var5, Class27.anIntArray297[var5] * var15,
										Class27.anIntArray298[var5] * var15, var13, var14);
							}
						}
					}
				} else {
					if ((var7.anInt1409 == -1) && (var7.anIntArray1427 == null))
						var12 = var7.method682(10, var5, var24, var25, var9, var26);
					else
						var12 = new Class124_Sub22_Sub19_Sub6(var4, 10, var5, var18, var2, var3, var7.anInt1409, true,
								(Class124_Sub22_Sub19) null);

					if (null != var12)
						var34.method129(var0, var2, var3, var9, var10, var11, (Class124_Sub22_Sub19) var12,
								var6 == 11 ? 256 : 0, var13, var14);

					if (var7.anInt1403 != 0)
						var27.method466(var2, var3, var10, var11, var7.aBool1436);
				}
			}
		}

	}

	abstract int method265(int var1, int var2, int var3);

	abstract void method266(int var1);
}
