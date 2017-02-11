public class Def19 extends JagMap {
	static int locX;
	static int loyY;
	static CacheArch aClass94_1441;
	static Class113 aClass113_1437 = new Class113(64);
	public boolean aBool1438 = false;

	void method694(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readByteU();
			if (var2 == 0)
				return;

			method696(var1, var2);
		}
	}

	public static Def1 method695(final int var0) {
		Def1 var1 = (Def1) Def1.aClass113_1371.forId(var0);
		if (null != var1)
			return var1;
		else {
			final byte[] var2 = Def1.aClass94_1365.decode(1, var0);
			var1 = new Def1();
			if (var2 != null)
				var1.method659(new RSBuf(var2), var0);

			var1.method658();
			Def1.aClass113_1371.map(var1, var0);
			return var1;
		}
	}

	void method696(final RSBuf var1, final int var2) {
		if (var2 == 2)
			aBool1438 = true;

	}

	static final void method697(int var0, int var1, int var2, int var3) {
		++client.anInt2084;
		Class43.method220(Class1.aClass1_4);
		boolean var9 = false;
		int var8;
		if (client.anInt2114 >= 0)
			for (var8 = 0; var8 < client.anInt2090; ++var8)
				if (client.anIntArray2128[var8] == client.anInt2114) {
					var9 = true;
					break;
				}

		if (var9)
			Class43.method220(Class1.aClass1_2);

		Applet_Sub1.method1054(true);
		Class43.method220(var9 ? Class1.aClass1_1 : Class1.aClass1_3);
		Applet_Sub1.method1054(false);

		int var20;
		for (Class124_Sub22_Sub19_Sub5 var14 = (Class124_Sub22_Sub19_Sub5) client.aClass111_2117
				.method428(); var14 != null; var14 = (Class124_Sub22_Sub19_Sub5) client.aClass111_2117.method430())
			if ((var14.anInt1792 == Class134.anInt906) && (client.anInt2158 <= var14.anInt1798)) {
				if (client.anInt2158 >= var14.anInt1803) {
					if (var14.anInt1797 > 0) {
						final Class124_Sub22_Sub19_Sub3_Sub1 var12 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var14.anInt1797
								- 1];
						if ((var12 != null) && (var12.anInt1690 >= 0) && (var12.anInt1690 < 13312)
								&& (var12.anInt1697 >= 0) && (var12.anInt1697 < 13312))
							var14.method953(var12.anInt1690, var12.anInt1697,
									Class63.method285(var12.anInt1690, var12.anInt1697, var14.anInt1792)
											- var14.anInt1796,
									client.anInt2158);
					}

					if (var14.anInt1797 < 0) {
						var20 = -var14.anInt1797 - 1;
						Class124_Sub22_Sub19_Sub3_Sub2 var31;
						if (var20 == client.pid)
							var31 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246;
						else
							var31 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var20];

						if ((null != var31) && (var31.anInt1690 >= 0) && (var31.anInt1690 < 13312)
								&& (var31.anInt1697 >= 0) && (var31.anInt1697 < 13312))
							var14.method953(var31.anInt1690, var31.anInt1697,
									Class63.method285(var31.anInt1690, var31.anInt1697, var14.anInt1792)
											- var14.anInt1796,
									client.anInt2158);
					}

					var14.method952(client.anInt2111);
					Class36.aClass21_380.method144(Class134.anInt906, (int) var14.aDouble1802, (int) var14.aDouble1804,
							(int) var14.aDouble1791, 60, var14, var14.anInt1811, -1, false);
				}
			} else
				var14.method450();

		Class124_Sub22_Sub21.method883();
		Class124_Sub22_Sub5.method677(var0, var1, var2, var3, true);
		var0 = client.anInt2245;
		var1 = client.anInt2238;
		var2 = client.anInt2247;
		var3 = client.anInt2248;
		Class124_Sub22_Sub16.method764(var0, var1, var0 + var2, var1 + var3);
		Class124_Sub22_Sub16_Sub3.method970();
		int var24;
		if (!client.aBool2231) {
			var8 = client.anInt2076;
			if ((client.anInt2187 / 256) > var8)
				var8 = client.anInt2187 / 256;

			if (client.aBoolArray2232[4] && ((128 + client.anIntArray2054[4]) > var8))
				var8 = 128 + client.anIntArray2054[4];

			var24 = (client.anInt2255 + client.anInt2050) & 2047;
			client.method844(Class124_Sub11.anInt1046,
					Class63.method285(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690,
							Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697, Class134.anInt906) - 50,
					Class87.anInt689, var8, var24, (var8 * 3) + 600);
		}

		int var4;
		int var6;
		int var7;
		int var10;
		int var15;
		int var16;
		int var17;
		if (!client.aBool2231) {
			if (Class57.aClass22_538.aBool248)
				var24 = Class134.anInt906;
			else {
				var20 = 3;
				if (CSD.anInt1003 < 310) {
					var15 = Class45.anInt445 >> 7;
					var6 = Class48.anInt479 >> 7;
					var16 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7;
					var7 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7;
					if ((Class27.aByteArrayArrayArray285[Class134.anInt906][var15][var6] & 4) != 0)
						var20 = Class134.anInt906;

					if (var16 > var15)
						var4 = var16 - var15;
					else
						var4 = var15 - var16;

					if (var7 > var6)
						var10 = var7 - var6;
					else
						var10 = var6 - var7;

					int var11;
					if (var4 > var10) {
						var11 = (65536 * var10) / var4;
						var17 = '\u8000';

						while (var15 != var16) {
							if (var15 < var16)
								++var15;
							else if (var15 > var16)
								--var15;

							if ((Class27.aByteArrayArrayArray285[Class134.anInt906][var15][var6] & 4) != 0)
								var20 = Class134.anInt906;

							var17 += var11;
							if (var17 >= 65536) {
								var17 -= 65536;
								if (var6 < var7)
									++var6;
								else if (var6 > var7)
									--var6;

								if ((Class27.aByteArrayArrayArray285[Class134.anInt906][var15][var6] & 4) != 0)
									var20 = Class134.anInt906;
							}
						}
					} else {
						var11 = (var4 * 65536) / var10;
						var17 = '\u8000';

						while (var6 != var7) {
							if (var6 < var7)
								++var6;
							else if (var6 > var7)
								--var6;

							if ((Class27.aByteArrayArrayArray285[Class134.anInt906][var15][var6] & 4) != 0)
								var20 = Class134.anInt906;

							var17 += var11;
							if (var17 >= 65536) {
								var17 -= 65536;
								if (var15 < var16)
									++var15;
								else if (var15 > var16)
									--var15;

								if ((Class27.aByteArrayArrayArray285[Class134.anInt906][var15][var6] & 4) != 0)
									var20 = Class134.anInt906;
							}
						}
					}
				}

				if ((Class27.aByteArrayArrayArray285[Class134.anInt906][Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7][Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7]
						& 4) != 0)
					var20 = Class134.anInt906;

				var24 = var20;
			}

			var8 = var24;
		} else
			var8 = client.method841();

		var24 = Class45.anInt445;
		var20 = Class2.anInt14;
		var15 = Class48.anInt479;
		var6 = CSD.anInt1003;
		var16 = Class27.anInt301;

		for (var7 = 0; var7 < 5; ++var7)
			if (client.aBoolArray2232[var7]) {
				var4 = (int) (((Math.random() * ((client.anIntArray2123[var7] * 2) + 1)) - client.anIntArray2123[var7])
						+ (Math.sin((client.anIntArray2235[var7] / 100.0D) * client.anIntArray2236[var7])
								* client.anIntArray2054[var7]));
				if (var7 == 0)
					Class45.anInt445 += var4;

				if (var7 == 1)
					Class2.anInt14 += var4;

				if (var7 == 2)
					Class48.anInt479 += var4;

				if (var7 == 3)
					Class27.anInt301 = (Class27.anInt301 + var4) & 2047;

				if (var7 == 4) {
					CSD.anInt1003 += var4;
					if (CSD.anInt1003 < 128)
						CSD.anInt1003 = 128;

					if (CSD.anInt1003 > 383)
						CSD.anInt1003 = 383;
				}
			}

		var7 = Class81.anInt652;
		var4 = Class81.anInt653;
		if (Class81.anInt650 != 0) {
			var7 = Class81.anInt658;
			var4 = Class81.anInt655;
		}

		if ((var7 >= var0) && (var7 < (var2 + var0)) && (var4 >= var1) && (var4 < (var1 + var3))) {
			Class124_Sub22_Sub19_Sub7.aBool1873 = true;
			Class124_Sub22_Sub19_Sub7.anInt1905 = 0;
			Class124_Sub22_Sub19_Sub7.anInt1869 = var7 - var0;
			Class124_Sub22_Sub19_Sub7.anInt1904 = var4 - var1;
		} else {
			Class124_Sub22_Sub19_Sub7.aBool1873 = false;
			Class124_Sub22_Sub19_Sub7.anInt1905 = 0;
		}

		Def15.method751();
		Class124_Sub22_Sub16.method768(var0, var1, var2, var3, 0);
		Def15.method751();
		var10 = Class124_Sub22_Sub16_Sub3.anInt1834;
		Class124_Sub22_Sub16_Sub3.anInt1834 = client.anInt2249;
		Class36.aClass21_380.method135(Class45.anInt445, Class2.anInt14, Class48.anInt479, CSD.anInt1003,
				Class27.anInt301, var8);
		Class124_Sub22_Sub16_Sub3.anInt1834 = var10;
		Def15.method751();
		Class36.aClass21_380.method146();
		client.anInt2074 = 0;
		boolean var30 = false;
		var17 = -1;

		int var5;
		for (var5 = -1; var5 < (client.anInt2090 + client.anInt2022); ++var5) {
			Object var13;
			if (var5 == -1)
				var13 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246;
			else if (var5 < client.anInt2090) {
				var13 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var5]];
				if (client.anIntArray2128[var5] == client.anInt2114) {
					var30 = true;
					var17 = var5;
					continue;
				}
			} else
				var13 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[client.anIntArray2023[var5 - client.anInt2090]];

			client.method1046((Class124_Sub22_Sub19_Sub3) var13, var5, var0, var1);
		}

		if (var30)
			client.method1046(client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anInt2114],
					var17, var0, var1);

		for (var5 = 0; var5 < client.anInt2074; ++var5) {
			final int var27 = client.anIntArray2033[var5];
			int var23 = client.anIntArray2077[var5];
			final int var28 = client.anIntArray2103[var5];
			final int var26 = client.anIntArray2078[var5];
			boolean var25 = true;

			while (var25) {
				var25 = false;

				for (int var22 = 0; var22 < var5; ++var22)
					if (((2 + var23) > (client.anIntArray2077[var22] - client.anIntArray2078[var22]))
							&& ((var23 - var26) < (client.anIntArray2077[var22] + 2))
							&& ((var27 - var28) < (client.anIntArray2103[var22] + client.anIntArray2033[var22]))
							&& ((var28 + var27) > (client.anIntArray2033[var22] - client.anIntArray2103[var22]))
							&& ((client.anIntArray2077[var22] - client.anIntArray2078[var22]) < var23)) {
						var23 = client.anIntArray2077[var22] - client.anIntArray2078[var22];
						var25 = true;
					}
			}

			client.anInt2085 = client.anIntArray2033[var5];
			client.anInt2152 = client.anIntArray2077[var5] = var23;
			final String var21 = client.aStringArray2243[var5];
			if (client.anInt2131 == 0) {
				int var19 = 16776960;
				if (client.anIntArray2119[var5] < 6)
					var19 = client.anIntArray2096[client.anIntArray2119[var5]];

				if (client.anIntArray2119[var5] == 6)
					var19 = (client.anInt2084 % 20) < 10 ? 16711680 : 16776960;

				if (client.anIntArray2119[var5] == 7)
					var19 = (client.anInt2084 % 20) < 10 ? 255 : '\uffff';

				if (client.anIntArray2119[var5] == 8)
					var19 = (client.anInt2084 % 20) < 10 ? '\ub000' : 8454016;

				int var18;
				if (client.anIntArray2119[var5] == 9) {
					var18 = 150 - client.anIntArray1982[var5];
					if (var18 < 50)
						var19 = (1280 * var18) + 16711680;
					else if (var18 < 100)
						var19 = 16776960 - (327680 * (var18 - 50));
					else if (var18 < 150)
						var19 = ((var18 - 100) * 5) + '\uff00';
				}

				if (client.anIntArray2119[var5] == 10) {
					var18 = 150 - client.anIntArray1982[var5];
					if (var18 < 50)
						var19 = 16711680 + (var18 * 5);
					else if (var18 < 100)
						var19 = 16711935 - (327680 * (var18 - 50));
					else if (var18 < 150)
						var19 = ((327680 * (var18 - 100)) + 255) - ((var18 - 100) * 5);
				}

				if (client.anIntArray2119[var5] == 11) {
					var18 = 150 - client.anIntArray1982[var5];
					if (var18 < 50)
						var19 = 16777215 - (327685 * var18);
					else if (var18 < 100)
						var19 = ((var18 - 50) * 327685) + '\uff00';
					else if (var18 < 150)
						var19 = 16777215 - (327680 * (var18 - 100));
				}

				if (client.anIntArray2081[var5] == 0)
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1021(var21, var0 + client.anInt2085,
							client.anInt2152 + var1, var19, 0);

				if (client.anIntArray2081[var5] == 1)
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1022(var21, var0 + client.anInt2085,
							client.anInt2152 + var1, var19, 0, client.anInt2084);

				if (client.anIntArray2081[var5] == 2)
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1037(var21, client.anInt2085 + var0,
							var1 + client.anInt2152, var19, 0, client.anInt2084);

				if (client.anIntArray2081[var5] == 3)
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1028(var21, var0 + client.anInt2085,
							client.anInt2152 + var1, var19, 0, client.anInt2084, 150 - client.anIntArray1982[var5]);

				if (client.anIntArray2081[var5] == 4) {
					var18 = ((150 - client.anIntArray1982[var5])
							* (Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1018(var21) + 100)) / 150;
					Class124_Sub22_Sub16.method778((client.anInt2085 + var0) - 50, var1, 50 + var0 + client.anInt2085,
							var1 + var3);
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1020(var21,
							(var0 + client.anInt2085 + 50) - var18, client.anInt2152 + var1, var19, 0);
					Class124_Sub22_Sub16.method764(var0, var1, var2 + var0, var3 + var1);
				}

				if (client.anIntArray2081[var5] == 5) {
					var18 = 150 - client.anIntArray1982[var5];
					int var29 = 0;
					if (var18 < 25)
						var29 = var18 - 25;
					else if (var18 > 125)
						var29 = var18 - 125;

					Class124_Sub22_Sub16.method778(var0,
							(var1 + client.anInt2152) - Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.anInt1934 - 1,
							var2 + var0, var1 + client.anInt2152 + 5);
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1021(var21, var0 + client.anInt2085,
							var29 + var1 + client.anInt2152, var19, 0);
					Class124_Sub22_Sub16.method764(var0, var1, var2 + var0, var1 + var3);
				}
			} else
				Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1021(var21, client.anInt2085 + var0,
						client.anInt2152 + var1, 16776960, 0);
		}

		Class124_Sub11.method538(var0, var1);
		((Class31) Class124_Sub22_Sub16_Sub3.anInterface2_1828).method178(client.anInt2111);
		InvIdk.method528();
		Class45.anInt445 = var24;
		Class2.anInt14 = var20;
		Class48.anInt479 = var15;
		CSD.anInt1003 = var6;
		Class27.anInt301 = var16;
		if (client.aBool1993) {
			final byte var32 = 0;
			var17 = var32 + Class92.anInt716 + Class92.anInt719;
			if (var17 == 0)
				client.aBool1993 = false;
		}

		if (client.aBool1993) {
			Class124_Sub22_Sub16.method768(var0, var1, var2, var3, 0);
			InvIdk.method523("Loading - please wait.", false);
		}

	}
}
