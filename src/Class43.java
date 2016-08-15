import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;

public class Class43 {
	static Class94_Sub1 aClass94_Sub1_431;
	static int[] anIntArray432;
	static BigInteger aBigInteger428 = new BigInteger(
			"80782894952180643741752986186714059433953886149239752893425047584684715842049");
	static BigInteger aBigInteger429 = new BigInteger(
			"7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	static String[] aStringArray430;

	public static Class124_Sub22_Sub12 method217(final int var0) {
		Class124_Sub22_Sub12 var1 = (Class124_Sub22_Sub12) Class124_Sub22_Sub12.aClass113_1515.method434(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Class37.aClass94_388.method377(13, var0);
			var1 = new Class124_Sub22_Sub12();
			var1.anInt1517 = var0;
			if (var2 != null)
				var1.method731(new Class124_Sub14(var2));

			Class124_Sub22_Sub12.aClass113_1515.method435(var1, var0);
			return var1;
		}
	}

	static void method218(final int var0, final int var1, final int var2, final int var3) {
		Class124_Sub10 var4 = (Class124_Sub10) Class124_Sub10.aClass107_1034.method409(var0);
		if (var4 == null) {
			var4 = new Class124_Sub10();
			Class124_Sub10.aClass107_1034.method412(var4, var0);
		}

		if (var4.anIntArray1030.length <= var1) {
			final int[] var5 = new int[var1 + 1];
			final int[] var7 = new int[1 + var1];

			int var6;
			for (var6 = 0; var6 < var4.anIntArray1030.length; ++var6) {
				var5[var6] = var4.anIntArray1030[var6];
				var7[var6] = var4.anIntArray1031[var6];
			}

			for (var6 = var4.anIntArray1030.length; var6 < var1; ++var6) {
				var5[var6] = -1;
				var7[var6] = 0;
			}

			var4.anIntArray1030 = var5;
			var4.anIntArray1031 = var7;
		}

		var4.anIntArray1030[var1] = var2;
		var4.anIntArray1031[var1] = var3;
	}

	public static void method219(final String var0, final String var1, final int var2, final int var3)
			throws IOException {
		Class73.anInt602 = var3;
		Class73.anInt607 = var2;

		try {
			Class57.aString539 = System.getProperty("os.name");
		} catch (final Exception var14) {
			Class57.aString539 = "Unknown";
		}

		Class7.aString75 = Class57.aString539.toLowerCase();

		try {
			Class73.aString606 = System.getProperty("user.home");
			if (Class73.aString606 != null)
				Class73.aString606 = Class73.aString606 + "/";
		} catch (final Exception var13) {
			;
		}

		try {
			if (Class7.aString75.startsWith("win")) {
				if (null == Class73.aString606)
					Class73.aString606 = System.getenv("USERPROFILE");
			} else if (Class73.aString606 == null)
				Class73.aString606 = System.getenv("HOME");

			if (Class73.aString606 != null)
				Class73.aString606 = Class73.aString606 + "/";
		} catch (final Exception var12) {
			;
		}

		if (Class73.aString606 == null)
			Class73.aString606 = "~/";

		Class121_Sub1.aStringArray913 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",
				Class73.aString606, "/tmp/", "" };
		aStringArray430 = new String[] { ".jagex_cache_" + Class73.anInt607, ".file_store_" + Class73.anInt607 };
		int var5 = 0;

		int var8;
		File var9;
		label114: while (var5 < 4) {
			Class25.aFile278 = RuntimeException_Sub1.method1009(var0, var1, var5);
			if (!Class25.aFile278.exists())
				Class25.aFile278.mkdirs();

			final File[] var6 = Class25.aFile278.listFiles();
			if (null == var6)
				break;

			final File[] var7 = var6;
			var8 = 0;

			while (true) {
				if (var8 >= var7.length)
					break label114;

				var9 = var7[var8];
				if (!Class37.method197(var9, false)) {
					++var5;
					break;
				}

				++var8;
			}
		}

		final File var4 = Class25.aFile278;
		Class60.aFile542 = var4;
		if (!Class60.aFile542.exists())
			throw new RuntimeException("");
		else {
			Class60.aBool545 = true;

			try {
				final File var16 = new File(Class73.aString606, "random.dat");
				if (var16.exists())
					Class73.aClass132_600 = new Class132(new Class127(var16, "rw", 25L), 24, 0);
				else
					label94: for (int var10 = 0; var10 < aStringArray430.length; ++var10)
						for (var8 = 0; var8 < Class121_Sub1.aStringArray913.length; ++var8) {
							var9 = new File(Class121_Sub1.aStringArray913[var8] + aStringArray430[var10]
									+ File.separatorChar + "random.dat");
							if (var9.exists()) {
								Class73.aClass132_600 = new Class132(new Class127(var9, "rw", 25L), 24, 0);
								break label94;
							}
						}

				if (null == Class73.aClass132_600) {
					final RandomAccessFile var17 = new RandomAccessFile(var16, "rw");
					System.out.printf("RAF @ %s %n", var16.getAbsolutePath());
					var8 = var17.read();
					var17.seek(0L);
					var17.write(var8);
					var17.seek(0L);
					var17.close();
					Class73.aClass132_600 = new Class132(new Class127(var16, "rw", 25L), 24, 0);
				}
			} catch (final IOException var15) {
				;
			}

			Class73.aClass132_605 = new Class132(
					new Class127(Class124_Sub22_Sub9.method706("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			Class73.aClass132_601 = new Class132(
					new Class127(Class124_Sub22_Sub9.method706("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			Class73.aClass132Array604 = new Class132[Class73.anInt602];

			for (int var11 = 0; var11 < Class73.anInt602; ++var11)
				Class73.aClass132Array604[var11] = new Class132(
						new Class127(Class124_Sub22_Sub9.method706("main_file_cache.idx" + var11), "rw", 1048576L),
						6000, 0);

		}
	}

	static final void method220(final Class1 var0) {
		if ((client.anInt2194 == (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7))
				&& ((Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7) == client.anInt2217))
			client.anInt2194 = 0;

		int var5 = client.anInt2090;
		if ((var0 == Class1.aClass1_4) || (Class1.aClass1_2 == var0))
			var5 = 1;

		for (int var4 = 0; var4 < var5; ++var4) {
			Class124_Sub22_Sub19_Sub3_Sub2 var3;
			int var6;
			if (Class1.aClass1_4 == var0) {
				var3 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246;
				var6 = 33538048;
			} else if (Class1.aClass1_2 == var0) {
				var3 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anInt2114];
				var6 = client.anInt2114 << 14;
			} else {
				var3 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var4]];
				var6 = client.anIntArray2128[var4] << 14;
				if ((Class1.aClass1_1 == var0) && (client.anIntArray2128[var4] == client.anInt2114))
					continue;
			}

			if ((null != var3) && var3.method895(125025305) && !var3.aBool1960) {
				var3.aBool1958 = false;
				if (((client.aBool1989 && (client.anInt2090 > 50)) || (client.anInt2090 > 200))
						&& (Class1.aClass1_4 != var0) && (var3.anInt1719 == var3.anInt1675))
					var3.aBool1958 = true;

				final int var1 = var3.anInt1690 >> 7;
				final int var2 = var3.anInt1697 >> 7;
				if ((var1 >= 0) && (var1 < 104) && (var2 >= 0) && (var2 < 104))
					if ((var3.aClass124_Sub22_Sub19_Sub7_1953 != null) && (client.anInt2158 >= var3.anInt1942)
							&& (client.anInt2158 < var3.anInt1949)) {
						var3.aBool1958 = false;
						var3.anInt1948 = Class63.method285(var3.anInt1690, var3.anInt1697, Class134.anInt906);
						Class36.aClass21_380.method108(Class134.anInt906, var3.anInt1690, var3.anInt1697,
								var3.anInt1948, 60, var3, var3.anInt1672, var6, var3.anInt1947, var3.anInt1962,
								var3.anInt1955, var3.anInt1957);
					} else {
						if (((var3.anInt1690 & 127) == 64) && ((var3.anInt1697 & 127) == 64)) {
							if (client.anInt2084 == client.anIntArrayArray2083[var1][var2])
								continue;

							client.anIntArrayArray2083[var1][var2] = client.anInt2084;
						}

						var3.anInt1948 = Class63.method285(var3.anInt1690, var3.anInt1697, Class134.anInt906);
						Class36.aClass21_380.method144(Class134.anInt906, var3.anInt1690, var3.anInt1697,
								var3.anInt1948, 60, var3, var3.anInt1672, var6, var3.aBool1708);
					}
			}
		}

	}

	static void method221(final Class124_Sub17 var0, final int var1, final int var2) {
		if (var0.anInt1158 == 0)
			var0.anInt1166 = var0.anInt1216;
		else if (var0.anInt1158 == 1)
			var0.anInt1166 = ((var1 - var0.anInt1168) / 2) + var0.anInt1216;
		else if (var0.anInt1158 == 2)
			var0.anInt1166 = var1 - var0.anInt1168 - var0.anInt1216;
		else if (var0.anInt1158 == 3)
			var0.anInt1166 = (var1 * var0.anInt1216) >> 14;
		else if (var0.anInt1158 == 4)
			var0.anInt1166 = ((var1 - var0.anInt1168) / 2) + ((var1 * var0.anInt1216) >> 14);
		else
			var0.anInt1166 = var1 - var0.anInt1168 - ((var1 * var0.anInt1216) >> 14);

		if (var0.anInt1148 == 0)
			var0.anInt1223 = var0.anInt1163;
		else if (var0.anInt1148 == 1)
			var0.anInt1223 = var0.anInt1163 + ((var2 - var0.anInt1169) / 2);
		else if (var0.anInt1148 == 2)
			var0.anInt1223 = var2 - var0.anInt1169 - var0.anInt1163;
		else if (var0.anInt1148 == 3)
			var0.anInt1223 = (var0.anInt1163 * var2) >> 14;
		else if (var0.anInt1148 == 4)
			var0.anInt1223 = ((var2 - var0.anInt1169) / 2) + ((var0.anInt1163 * var2) >> 14);
		else
			var0.anInt1223 = var2 - var0.anInt1169 - ((var0.anInt1163 * var2) >> 14);

		if (client.aBool2021 && (var0.anInt1191 == 0)) {
			if (var0.anInt1166 < 0)
				var0.anInt1166 = 0;
			else if ((var0.anInt1168 + var0.anInt1166) > var1)
				var0.anInt1166 = var1 - var0.anInt1168;

			if (var0.anInt1223 < 0)
				var0.anInt1223 = 0;
			else if ((var0.anInt1169 + var0.anInt1223) > var2)
				var0.anInt1223 = var2 - var0.anInt1169;
		}

	}

	static final void method222(final Class21 var0, final Class130[] var1) {
		int var2;
		int var8;
		int var9;
		int var11;
		for (var2 = 0; var2 < 4; ++var2)
			for (var8 = 0; var8 < 104; ++var8)
				for (var9 = 0; var9 < 104; ++var9)
					if ((Class27.aByteArrayArrayArray285[var2][var8][var9] & 1) == 1) {
						var11 = var2;
						if ((Class27.aByteArrayArrayArray285[1][var8][var9] & 2) == 2)
							var11 = var2 - 1;

						if (var11 >= 0)
							var1[var11].method471(var8, var9);
					}

		Class27.anInt299 += (int) (Math.random() * 5.0D) - 2;
		if (Class27.anInt299 < -8)
			Class27.anInt299 = -8;

		if (Class27.anInt299 > 8)
			Class27.anInt299 = 8;

		Class27.anInt300 += (int) (Math.random() * 5.0D) - 2;
		if (Class27.anInt300 < -16)
			Class27.anInt300 = -16;

		if (Class27.anInt300 > 16)
			Class27.anInt300 = 16;

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var13;
		int var14;
		int var17;
		int var18;
		int var23;
		for (var2 = 0; var2 < 4; ++var2) {
			final byte[][] var16 = Class27.aByteArrayArrayArray289[var2];
			var4 = (int) Math.sqrt(5100.0D);
			var3 = (768 * var4) >> 8;

			int var10;
			int var19;
			for (var6 = 1; var6 < 103; ++var6)
				for (var5 = 1; var5 < 103; ++var5) {
					var7 = Class27.anIntArrayArrayArray284[var2][1 + var5][var6]
							- Class27.anIntArrayArrayArray284[var2][var5 - 1][var6];
					var14 = Class27.anIntArrayArrayArray284[var2][var5][1 + var6]
							- Class27.anIntArrayArrayArray284[var2][var5][var6 - 1];
					var18 = (int) Math.sqrt(65536 + (var7 * var7) + (var14 * var14));
					var13 = (var7 << 8) / var18;
					var17 = 65536 / var18;
					var23 = (var14 << 8) / var18;
					var19 = 96 + (((var13 * -50) + (var17 * -10) + (var23 * -50)) / var3);
					var10 = (var16[var5][var6] >> 1) + (var16[var5 + 1][var6] >> 3) + (var16[var5 - 1][var6] >> 2)
							+ (var16[var5][var6 - 1] >> 2) + (var16[var5][var6 + 1] >> 3);
					Class98.anIntArrayArray772[var5][var6] = var19 - var10;
				}

			for (var6 = 0; var6 < 104; ++var6) {
				Class27.anIntArray287[var6] = 0;
				Class64.anIntArray559[var6] = 0;
				Class124_Sub22_Sub11.anIntArray1512[var6] = 0;
				Class27.anIntArray291[var6] = 0;
				Class27.anIntArray292[var6] = 0;
			}

			for (var6 = -5; var6 < 109; ++var6) {
				for (var5 = 0; var5 < 104; ++var5) {
					var7 = 5 + var6;
					if ((var7 >= 0) && (var7 < 104)) {
						var14 = Class27.aByteArrayArrayArray293[var2][var7][var5] & 255;
						if (var14 > 0) {
							final Class124_Sub22_Sub3 var28 = Class124_Sub22_Sub7.method695(var14 - 1);
							Class27.anIntArray287[var5] += var28.anInt1368;
							Class64.anIntArray559[var5] += var28.anInt1369;
							Class124_Sub22_Sub11.anIntArray1512[var5] += var28.anInt1370;
							Class27.anIntArray291[var5] += var28.anInt1366;
							++Class27.anIntArray292[var5];
						}
					}

					var14 = var6 - 5;
					if ((var14 >= 0) && (var14 < 104)) {
						var18 = Class27.aByteArrayArrayArray293[var2][var14][var5] & 255;
						if (var18 > 0) {
							final Class124_Sub22_Sub3 var27 = Class124_Sub22_Sub7.method695(var18 - 1);
							Class27.anIntArray287[var5] -= var27.anInt1368;
							Class64.anIntArray559[var5] -= var27.anInt1369;
							Class124_Sub22_Sub11.anIntArray1512[var5] -= var27.anInt1370;
							Class27.anIntArray291[var5] -= var27.anInt1366;
							--Class27.anIntArray292[var5];
						}
					}
				}

				if ((var6 >= 1) && (var6 < 103)) {
					var5 = 0;
					var7 = 0;
					var14 = 0;
					var18 = 0;
					var13 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var23 = var17 + 5;
						if ((var23 >= 0) && (var23 < 104)) {
							var5 += Class27.anIntArray287[var23];
							var7 += Class64.anIntArray559[var23];
							var14 += Class124_Sub22_Sub11.anIntArray1512[var23];
							var18 += Class27.anIntArray291[var23];
							var13 += Class27.anIntArray292[var23];
						}

						var19 = var17 - 5;
						if ((var19 >= 0) && (var19 < 104)) {
							var5 -= Class27.anIntArray287[var19];
							var7 -= Class64.anIntArray559[var19];
							var14 -= Class124_Sub22_Sub11.anIntArray1512[var19];
							var18 -= Class27.anIntArray291[var19];
							var13 -= Class27.anIntArray292[var19];
						}

						if ((var17 >= 1) && (var17 < 103) && (!client.aBool1989
								|| ((Class27.aByteArrayArrayArray285[0][var6][var17] & 2) != 0)
								|| (((Class27.aByteArrayArrayArray285[var2][var6][var17] & 16) == 0)
										&& (Class124_Sub22_Sub14.method754(var2, var6, var17) == client.anInt2006)))) {
							if (var2 < Class27.anInt290)
								Class27.anInt290 = var2;

							var10 = Class27.aByteArrayArrayArray293[var2][var6][var17] & 255;
							final int var21 = Class57.aByteArrayArrayArray537[var2][var6][var17] & 255;
							if ((var10 > 0) || (var21 > 0)) {
								final int var33 = Class27.anIntArrayArrayArray284[var2][var6][var17];
								final int var34 = Class27.anIntArrayArrayArray284[var2][1 + var6][var17];
								final int var35 = Class27.anIntArrayArrayArray284[var2][var6 + 1][var17 + 1];
								final int var36 = Class27.anIntArrayArrayArray284[var2][var6][1 + var17];
								final int var37 = Class98.anIntArrayArray772[var6][var17];
								final int var44 = Class98.anIntArrayArray772[var6 + 1][var17];
								final int var45 = Class98.anIntArrayArray772[1 + var6][1 + var17];
								final int var39 = Class98.anIntArrayArray772[var6][1 + var17];
								int var30 = -1;
								int var40 = -1;
								int var15;
								int var20;
								int var31;
								if (var10 > 0) {
									var20 = (256 * var5) / var18;
									var31 = var7 / var13;
									var15 = var14 / var13;
									var30 = Class31.method179(var20, var31, var15);
									var20 = (var20 + Class27.anInt299) & 255;
									var15 += Class27.anInt300;
									if (var15 < 0)
										var15 = 0;
									else if (var15 > 255)
										var15 = 255;

									var40 = Class31.method179(var20, var31, var15);
								}

								Class124_Sub22_Sub15 var24;
								if (var2 > 0) {
									boolean var52 = true;
									if ((var10 == 0) && (Class27.aByteArrayArrayArray288[var2][var6][var17] != 0))
										var52 = false;

									if (var21 > 0) {
										var15 = var21 - 1;
										var24 = (Class124_Sub22_Sub15) Class124_Sub22_Sub15.aClass113_1553
												.method434(var15);
										Class124_Sub22_Sub15 var41;
										if (null != var24)
											var41 = var24;
										else {
											final byte[] var43 = Class124_Sub22_Sub15.aClass94_1561.method377(4, var15);
											var24 = new Class124_Sub22_Sub15();
											if (null != var43)
												var24.method756(new Class124_Sub14(var43), var15);

											var24.method755();
											Class124_Sub22_Sub15.aClass113_1553.method435(var24, var15);
											var41 = var24;
										}

										if (!var41.aBool1556)
											var52 = false;
									}

									if (var52 && (var33 == var34) && (var33 == var35) && (var33 == var36))
										Class27.anIntArrayArrayArray304[var2][var6][var17] |= 2340;
								}

								var20 = 0;
								if (var40 != -1)
									var20 = Class124_Sub22_Sub16_Sub3.anIntArray1845[Class73.method313(var40, 96)];

								if (var21 == 0)
									var0.method113(var2, var6, var17, 0, 0, -1, var33, var34, var35, var36,
											Class73.method313(var30, var37), Class73.method313(var30, var44),
											Class73.method313(var30, var45), Class73.method313(var30, var39), 0, 0, 0,
											0, var20, 0);
								else {
									var31 = Class27.aByteArrayArrayArray288[var2][var6][var17] + 1;
									final byte var51 = Class3.aByteArrayArrayArray17[var2][var6][var17];
									final int var22 = var21 - 1;
									Class124_Sub22_Sub15 var29 = (Class124_Sub22_Sub15) Class124_Sub22_Sub15.aClass113_1553
											.method434(var22);
									if (null != var29)
										var24 = var29;
									else {
										final byte[] var38 = Class124_Sub22_Sub15.aClass94_1561.method377(4, var22);
										var29 = new Class124_Sub22_Sub15();
										if (var38 != null)
											var29.method756(new Class124_Sub14(var38), var22);

										var29.method755();
										Class124_Sub22_Sub15.aClass113_1553.method435(var29, var22);
										var24 = var29;
									}

									int var42 = var24.anInt1555;
									int var32;
									int var46;
									int var47;
									int var48;
									if (var42 >= 0) {
										var46 = Class124_Sub22_Sub16_Sub3.anInterface2_1828.method10(var42,
												-1139712507);
										var47 = -1;
									} else if (var24.anInt1554 == 16711935) {
										var47 = -2;
										var42 = -1;
										var46 = -2;
									} else {
										var47 = Class31.method179(var24.anInt1558, var24.anInt1559, var24.anInt1563);
										var48 = (var24.anInt1558 + Class27.anInt299) & 255;
										var32 = var24.anInt1563 + Class27.anInt300;
										if (var32 < 0)
											var32 = 0;
										else if (var32 > 255)
											var32 = 255;

										var46 = Class31.method179(var48, var24.anInt1559, var32);
									}

									var48 = 0;
									if (var46 != -2)
										var48 = Class124_Sub22_Sub16_Sub3.anIntArray1845[Class86.method342(var46, 96)];

									if (var24.anInt1557 != -1) {
										var32 = (Class27.anInt299 + var24.anInt1552) & 255;
										int var49 = var24.anInt1560 + Class27.anInt300;
										if (var49 < 0)
											var49 = 0;
										else if (var49 > 255)
											var49 = 255;

										var46 = Class31.method179(var32, var24.anInt1562, var49);
										var48 = Class124_Sub22_Sub16_Sub3.anIntArray1845[Class86.method342(var46, 96)];
									}

									var0.method113(var2, var6, var17, var31, var51, var42, var33, var34, var35, var36,
											Class73.method313(var30, var37), Class73.method313(var30, var44),
											Class73.method313(var30, var45), Class73.method313(var30, var39),
											Class86.method342(var47, var37), Class86.method342(var47, var44),
											Class86.method342(var47, var45), Class86.method342(var47, var39), var20,
											var48);
								}
							}
						}
					}
				}
			}

			for (var6 = 1; var6 < 103; ++var6)
				for (var5 = 1; var5 < 103; ++var5)
					var0.method102(var2, var5, var6, Class124_Sub22_Sub14.method754(var2, var5, var6));

			Class27.aByteArrayArrayArray293[var2] = null;
			Class57.aByteArrayArrayArray537[var2] = null;
			Class27.aByteArrayArrayArray288[var2] = null;
			Class3.aByteArrayArrayArray17[var2] = null;
			Class27.aByteArrayArrayArray289[var2] = null;
		}

		var0.method123(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2)
			for (var8 = 0; var8 < 104; ++var8)
				if ((Class27.aByteArrayArrayArray285[1][var2][var8] & 2) == 2)
					var0.method100(var2, var8);

		var2 = 1;
		var8 = 2;
		var9 = 4;

		for (var11 = 0; var11 < 4; ++var11) {
			if (var11 > 0) {
				var2 <<= 3;
				var8 <<= 3;
				var9 <<= 3;
			}

			for (int var12 = 0; var12 <= var11; ++var12)
				for (int var26 = 0; var26 <= 104; ++var26)
					for (int var25 = 0; var25 <= 104; ++var25) {
						short var50;
						if ((Class27.anIntArrayArrayArray304[var12][var25][var26] & var2) != 0) {
							var4 = var26;
							var3 = var26;
							var6 = var12;

							for (var5 = var12; (var4 > 0)
									&& ((Class27.anIntArrayArrayArray304[var12][var25][var4 - 1] & var2) != 0); --var4)
								;

							while ((var3 < 104)
									&& ((Class27.anIntArrayArrayArray304[var12][var25][var3 + 1] & var2) != 0))
								++var3;

							label502: while (var6 > 0) {
								for (var7 = var4; var7 <= var3; ++var7)
									if ((Class27.anIntArrayArrayArray304[var6 - 1][var25][var7] & var2) == 0)
										break label502;

								--var6;
							}

							label491: while (var5 < var11) {
								for (var7 = var4; var7 <= var3; ++var7)
									if ((Class27.anIntArrayArrayArray304[1 + var5][var25][var7] & var2) == 0)
										break label491;

								++var5;
							}

							var7 = ((1 + var5) - var6) * (1 + (var3 - var4));
							if (var7 >= 8) {
								var50 = 240;
								var18 = Class27.anIntArrayArrayArray284[var5][var25][var4] - var50;
								var13 = Class27.anIntArrayArrayArray284[var6][var25][var4];
								Class21.method106(var11, 1, 128 * var25, 128 * var25, var4 * 128, 128 + (var3 * 128),
										var18, var13);

								for (var17 = var6; var17 <= var5; ++var17)
									for (var23 = var4; var23 <= var3; ++var23)
										Class27.anIntArrayArrayArray304[var17][var25][var23] &= ~var2;
							}
						}

						if ((Class27.anIntArrayArrayArray304[var12][var25][var26] & var8) != 0) {
							var4 = var25;
							var3 = var25;
							var6 = var12;

							for (var5 = var12; (var4 > 0)
									&& ((Class27.anIntArrayArrayArray304[var12][var4 - 1][var26] & var8) != 0); --var4)
								;

							while ((var3 < 104)
									&& ((Class27.anIntArrayArrayArray304[var12][var3 + 1][var26] & var8) != 0))
								++var3;

							label555: while (var6 > 0) {
								for (var7 = var4; var7 <= var3; ++var7)
									if ((Class27.anIntArrayArrayArray304[var6 - 1][var7][var26] & var8) == 0)
										break label555;

								--var6;
							}

							label544: while (var5 < var11) {
								for (var7 = var4; var7 <= var3; ++var7)
									if ((Class27.anIntArrayArrayArray304[1 + var5][var7][var26] & var8) == 0)
										break label544;

								++var5;
							}

							var7 = (1 + (var3 - var4)) * ((var5 + 1) - var6);
							if (var7 >= 8) {
								var50 = 240;
								var18 = Class27.anIntArrayArrayArray284[var5][var4][var26] - var50;
								var13 = Class27.anIntArrayArrayArray284[var6][var4][var26];
								Class21.method106(var11, 2, 128 * var4, 128 + (var3 * 128), 128 * var26, 128 * var26,
										var18, var13);

								for (var17 = var6; var17 <= var5; ++var17)
									for (var23 = var4; var23 <= var3; ++var23)
										Class27.anIntArrayArrayArray304[var17][var23][var26] &= ~var8;
							}
						}

						if ((Class27.anIntArrayArrayArray304[var12][var25][var26] & var9) != 0) {
							var4 = var25;
							var3 = var25;
							var6 = var26;

							for (var5 = var26; (var6 > 0)
									&& ((Class27.anIntArrayArrayArray304[var12][var25][var6 - 1] & var9) != 0); --var6)
								;

							while ((var5 < 104)
									&& ((Class27.anIntArrayArrayArray304[var12][var25][1 + var5] & var9) != 0))
								++var5;

							label608: while (var4 > 0) {
								for (var7 = var6; var7 <= var5; ++var7)
									if ((Class27.anIntArrayArrayArray304[var12][var4 - 1][var7] & var9) == 0)
										break label608;

								--var4;
							}

							label597: while (var3 < 104) {
								for (var7 = var6; var7 <= var5; ++var7)
									if ((Class27.anIntArrayArrayArray304[var12][1 + var3][var7] & var9) == 0)
										break label597;

								++var3;
							}

							if ((((var3 - var4) + 1) * (1 + (var5 - var6))) >= 4) {
								var7 = Class27.anIntArrayArrayArray284[var12][var4][var6];
								Class21.method106(var11, 4, 128 * var4, 128 + (128 * var3), var6 * 128,
										128 + (128 * var5), var7, var7);

								for (var14 = var4; var14 <= var3; ++var14)
									for (var18 = var6; var18 <= var5; ++var18)
										Class27.anIntArrayArrayArray304[var12][var14][var18] &= ~var9;
							}
						}
					}
		}

	}
}
