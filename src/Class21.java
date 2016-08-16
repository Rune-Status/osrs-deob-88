public class Class21 {
	int anInt197 = 0;
	int anInt196 = 0;
	public static int anInt214 = -1;
	public static int anInt222 = -1;
	static int anInt226;
	static boolean aBool217 = false;
	static int anInt218 = 0;
	static int anInt219 = 0;
	static int anInt220 = 0;
	public static boolean aBool192 = true;
	static int anInt194 = 0;
	static int anInt241 = 0;
	static Class46[] aClass46Array202 = new Class46[100];
	static int anInt223 = 4;
	static int[] anIntArray224;
	static Class42[][] aClass42ArrayArray210;
	static Class42[] aClass42Array227;
	static Class111 aClass111_200;
	static int[] anIntArray229;
	static int[] anIntArray221;
	static int[] anIntArray231;
	static int[] anIntArray232;
	static int[] anIntArray233;
	static int[] anIntArray234;
	static int[] anIntArray228;
	static boolean[][][][] aBoolArrayArrayArrayArray238;
	static int anInt242;
	static int anInt243;
	static int anInt244;
	static int anInt245;
	static int anInt240;
	static int anInt201;
	static int anInt212;
	static int anInt213;
	static int anInt205;
	static int anInt215;
	static int anInt203;
	static boolean[][] aBoolArrayArray239;
	static int anInt209;
	static int anInt198;
	static int anInt230;
	static int anInt207;
	static int anInt208;
	static int anInt199;
	static int anInt193;
	static int anInt204;
	static int anInt206;
	Class46[] aClass46Array195 = new Class46[5000];
	int[][] anIntArrayArray190 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int[][] anIntArrayArray216 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	int anInt191;
	int anInt211;
	int anInt236;
	Class124_Sub5[][][] aClass124_Sub5ArrayArrayArray225;
	int[][][] anIntArrayArrayArray235;
	int[][][] anIntArrayArrayArray237;

	static final int method97(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	public void method98() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt191; ++var1)
			for (var2 = 0; var2 < anInt211; ++var2)
				for (int var3 = 0; var3 < anInt236; ++var3)
					aClass124_Sub5ArrayArrayArray225[var1][var2][var3] = null;

		for (var1 = 0; var1 < anInt223; ++var1) {
			for (var2 = 0; var2 < anIntArray224[var1]; ++var2)
				aClass42ArrayArray210[var1][var2] = null;

			anIntArray224[var1] = 0;
		}

		for (var1 = 0; var1 < anInt197; ++var1)
			aClass46Array195[var1] = null;

		anInt197 = 0;

		for (var1 = 0; var1 < aClass46Array202.length; ++var1)
			aClass46Array202[var1] = null;

	}

	public void method99(final int var1) {
		anInt196 = var1;

		for (int var2 = 0; var2 < anInt211; ++var2)
			for (int var3 = 0; var3 < anInt236; ++var3)
				if (aClass124_Sub5ArrayArrayArray225[var1][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var1][var2][var3] = new Class124_Sub5(var1, var2, var3);

	}

	public void method100(final int var1, final int var2) {
		final Class124_Sub5 var3 = aClass124_Sub5ArrayArrayArray225[0][var1][var2];

		for (int var5 = 0; var5 < 3; ++var5) {
			final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var5][var1][var2] = aClass124_Sub5ArrayArrayArray225[var5
					+ 1][var1][var2];
			if (var4 != null) {
				--var4.anInt966;

				for (int var6 = 0; var6 < var4.anInt976; ++var6) {
					final Class46 var7 = var4.aClass46Array977[var6];
					if ((((var7.anInt463 >> 29) & 3) == 2) && (var7.anInt457 == var1) && (var7.anInt465 == var2))
						--var7.anInt459;
				}
			}
		}

		if (aClass124_Sub5ArrayArrayArray225[0][var1][var2] == null)
			aClass124_Sub5ArrayArrayArray225[0][var1][var2] = new Class124_Sub5(0, var1, var2);

		aClass124_Sub5ArrayArrayArray225[0][var1][var2].aClass124_Sub5_980 = var3;
		aClass124_Sub5ArrayArrayArray225[3][var1][var2] = null;
	}

	void method101(final Class33 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7) {
		int var8 = var1.anIntArray350.length;

		int var12;
		int var15;
		int var16;
		int var17;
		int var18;
		for (var15 = 0; var15 < var8; ++var15) {
			var16 = var1.anIntArray350[var15] - anInt209;
			var17 = var1.anIntArray347[var15] - anInt198;
			var18 = var1.anIntArray348[var15] - anInt230;
			var12 = ((var18 * var4) + (var16 * var5)) >> 16;
			var18 = ((var18 * var5) - (var16 * var4)) >> 16;
			var16 = var12;
			var12 = ((var17 * var3) - (var18 * var2)) >> 16;
			var18 = ((var17 * var2) + (var18 * var3)) >> 16;
			if (var18 < 50)
				return;

			if (var1.anIntArray353 != null) {
				Class33.anIntArray351[var15] = var16;
				Class33.anIntArray364[var15] = var12;
				Class33.anIntArray365[var15] = var18;
			}

			Class33.anIntArray361[var15] = Class124_Sub22_Sub16_Sub3.anInt1835
					+ ((var16 * Class124_Sub22_Sub16_Sub3.anInt1834) / var18);
			Class33.anIntArray357[var15] = Class124_Sub22_Sub16_Sub3.anInt1836
					+ ((var12 * Class124_Sub22_Sub16_Sub3.anInt1834) / var18);
		}

		Class124_Sub22_Sub16_Sub3.anInt1831 = 0;
		var8 = var1.anIntArray363.length;

		for (var15 = 0; var15 < var8; ++var15) {
			var16 = var1.anIntArray363[var15];
			var17 = var1.anIntArray346[var15];
			var18 = var1.anIntArray354[var15];
			var12 = Class33.anIntArray361[var16];
			final int var13 = Class33.anIntArray361[var17];
			final int var14 = Class33.anIntArray361[var18];
			final int var9 = Class33.anIntArray357[var16];
			final int var10 = Class33.anIntArray357[var17];
			final int var11 = Class33.anIntArray357[var18];
			if ((((var12 - var13) * (var11 - var10)) - ((var9 - var10) * (var14 - var13))) > 0) {
				Class124_Sub22_Sub16_Sub3.aBool1842 = false;
				if ((var12 < 0) || (var13 < 0) || (var14 < 0) || (var12 > Class124_Sub22_Sub16_Sub3.anInt1837)
						|| (var13 > Class124_Sub22_Sub16_Sub3.anInt1837)
						|| (var14 > Class124_Sub22_Sub16_Sub3.anInt1837))
					Class124_Sub22_Sub16_Sub3.aBool1842 = true;

				if (aBool217 && method138(anInt219, anInt220, var9, var10, var11, var12, var13, var14)) {
					anInt214 = var6;
					anInt222 = var7;
				}

				if ((var1.anIntArray353 != null) && (var1.anIntArray353[var15] != -1)) {
					if (!aBool192) {
						if (var1.aBool356)
							Class124_Sub22_Sub16_Sub3.method969(var9, var10, var11, var12, var13, var14,
									var1.anIntArray349[var15], var1.anIntArray352[var15], var1.anIntArray362[var15],
									Class33.anIntArray351[0], Class33.anIntArray351[1], Class33.anIntArray351[3],
									Class33.anIntArray364[0], Class33.anIntArray364[1], Class33.anIntArray364[3],
									Class33.anIntArray365[0], Class33.anIntArray365[1], Class33.anIntArray365[3],
									var1.anIntArray353[var15]);
						else
							Class124_Sub22_Sub16_Sub3.method969(var9, var10, var11, var12, var13, var14,
									var1.anIntArray349[var15], var1.anIntArray352[var15], var1.anIntArray362[var15],
									Class33.anIntArray351[var16], Class33.anIntArray351[var17],
									Class33.anIntArray351[var18], Class33.anIntArray364[var16],
									Class33.anIntArray364[var17], Class33.anIntArray364[var18],
									Class33.anIntArray365[var16], Class33.anIntArray365[var17],
									Class33.anIntArray365[var18], var1.anIntArray353[var15]);
					} else {
						final int var19 = Class124_Sub22_Sub16_Sub3.anInterface2_1828
								.method10(var1.anIntArray353[var15], 1598640759);
						Class124_Sub22_Sub16_Sub3.method982(var9, var10, var11, var12, var13, var14,
								method97(var19, var1.anIntArray349[var15]), method97(var19, var1.anIntArray352[var15]),
								method97(var19, var1.anIntArray362[var15]));
					}
				} else if (var1.anIntArray349[var15] != 12345678)
					Class124_Sub22_Sub16_Sub3.method982(var9, var10, var11, var12, var13, var14,
							var1.anIntArray349[var15], var1.anIntArray352[var15], var1.anIntArray362[var15]);
			}
		}

	}

	public void method102(final int var1, final int var2, final int var3, final int var4) {
		final Class124_Sub5 var5 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var5 != null)
			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].anInt979 = var4;
	}

	public void method103(final int var1, final int var2, final int var3, final int var4,
			final Class124_Sub22_Sub19 var5, final int var6, final int var7) {
		if (var5 != null) {
			final Class44 var8 = new Class44();
			var8.aClass124_Sub22_Sub19_438 = var5;
			var8.anInt434 = (var2 * 128) + 64;
			var8.anInt433 = (var3 * 128) + 64;
			var8.anInt436 = var4;
			var8.anInt437 = var6;
			var8.anInt435 = var7;
			if (aClass124_Sub5ArrayArrayArray225[var1][var2][var3] == null)
				aClass124_Sub5ArrayArrayArray225[var1][var2][var3] = new Class124_Sub5(var1, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass44_972 = var8;
		}
	}

	void method104() {
		final int var1 = anIntArray224[anInt241];
		final Class42[] var5 = aClass42ArrayArray210[anInt241];
		anInt226 = 0;

		for (int var6 = 0; var6 < var1; ++var6) {
			final Class42 var2 = var5[var6];
			int var3;
			int var4;
			int var7;
			int var9;
			boolean var13;
			if (var2.anInt412 == 1) {
				var7 = (var2.anInt422 - anInt207) + 25;
				if ((var7 >= 0) && (var7 <= 50)) {
					var4 = (var2.anInt410 - anInt208) + 25;
					if (var4 < 0)
						var4 = 0;

					var3 = (var2.anInt411 - anInt208) + 25;
					if (var3 > 50)
						var3 = 50;

					var13 = false;

					while (var4 <= var3)
						if (aBoolArrayArray239[var7][var4++]) {
							var13 = true;
							break;
						}

					if (var13) {
						var9 = anInt209 - var2.anInt413;
						if (var9 > 32)
							var2.anInt408 = 1;
						else {
							if (var9 >= -32)
								continue;

							var2.anInt408 = 2;
							var9 = -var9;
						}

						var2.anInt418 = ((var2.anInt415 - anInt230) << 8) / var9;
						var2.anInt423 = ((var2.anInt416 - anInt230) << 8) / var9;
						var2.anInt424 = ((var2.anInt421 - anInt198) << 8) / var9;
						var2.anInt425 = ((var2.anInt419 - anInt198) << 8) / var9;
						aClass42Array227[anInt226++] = var2;
					}
				}
			} else if (var2.anInt412 == 2) {
				var7 = (var2.anInt410 - anInt208) + 25;
				if ((var7 >= 0) && (var7 <= 50)) {
					var4 = (var2.anInt422 - anInt207) + 25;
					if (var4 < 0)
						var4 = 0;

					var3 = (var2.anInt409 - anInt207) + 25;
					if (var3 > 50)
						var3 = 50;

					var13 = false;

					while (var4 <= var3)
						if (aBoolArrayArray239[var4++][var7]) {
							var13 = true;
							break;
						}

					if (var13) {
						var9 = anInt230 - var2.anInt415;
						if (var9 > 32)
							var2.anInt408 = 3;
						else {
							if (var9 >= -32)
								continue;

							var2.anInt408 = 4;
							var9 = -var9;
						}

						var2.anInt420 = ((var2.anInt413 - anInt209) << 8) / var9;
						var2.anInt417 = ((var2.anInt414 - anInt209) << 8) / var9;
						var2.anInt424 = ((var2.anInt421 - anInt198) << 8) / var9;
						var2.anInt425 = ((var2.anInt419 - anInt198) << 8) / var9;
						aClass42Array227[anInt226++] = var2;
					}
				}
			} else if (var2.anInt412 == 4) {
				var7 = var2.anInt421 - anInt198;
				if (var7 > 128) {
					var4 = (var2.anInt410 - anInt208) + 25;
					if (var4 < 0)
						var4 = 0;

					var3 = (var2.anInt411 - anInt208) + 25;
					if (var3 > 50)
						var3 = 50;

					if (var4 <= var3) {
						int var10 = (var2.anInt422 - anInt207) + 25;
						if (var10 < 0)
							var10 = 0;

						var9 = (var2.anInt409 - anInt207) + 25;
						if (var9 > 50)
							var9 = 50;

						boolean var11 = false;

						label175: for (int var8 = var10; var8 <= var9; ++var8)
							for (int var12 = var4; var12 <= var3; ++var12)
								if (aBoolArrayArray239[var8][var12]) {
									var11 = true;
									break label175;
								}

						if (var11) {
							var2.anInt408 = 5;
							var2.anInt420 = ((var2.anInt413 - anInt209) << 8) / var7;
							var2.anInt417 = ((var2.anInt414 - anInt209) << 8) / var7;
							var2.anInt418 = ((var2.anInt415 - anInt230) << 8) / var7;
							var2.anInt423 = ((var2.anInt416 - anInt230) << 8) / var7;
							aClass42Array227[anInt226++] = var2;
						}
					}
				}
			}
		}

	}

	public void method105(final int var1, final int var2, final int var3, final int var4,
			final Class124_Sub22_Sub19 var5, final Class124_Sub22_Sub19 var6, final int var7, final int var8,
			final int var9, final int var10, final int var11, final int var12) {
		if (var5 != null) {
			final Class36 var13 = new Class36();
			var13.anInt385 = var11;
			var13.anInt379 = var12;
			var13.anInt378 = (var2 * 128) + 64;
			var13.anInt376 = (var3 * 128) + 64;
			var13.anInt387 = var4;
			var13.aClass124_Sub22_Sub19_383 = var5;
			var13.aClass124_Sub22_Sub19_377 = var6;
			var13.anInt386 = var7;
			var13.anInt384 = var8;
			var13.anInt381 = var9;
			var13.anInt382 = var10;

			for (int var14 = var1; var14 >= 0; --var14)
				if (aClass124_Sub5ArrayArrayArray225[var14][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var14][var2][var3] = new Class124_Sub5(var14, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass36_973 = var13;
		}
	}

	public static void method106(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7) {
		final Class42 var8 = new Class42();
		var8.anInt422 = var2 / 128;
		var8.anInt409 = var3 / 128;
		var8.anInt410 = var4 / 128;
		var8.anInt411 = var5 / 128;
		var8.anInt412 = var1;
		var8.anInt413 = var2;
		var8.anInt414 = var3;
		var8.anInt415 = var4;
		var8.anInt416 = var5;
		var8.anInt421 = var6;
		var8.anInt419 = var7;
		aClass42ArrayArray210[var0][anIntArray224[var0]++] = var8;
	}

	public void method107(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 != null)
			for (int var5 = 0; var5 < var4.anInt976; ++var5) {
				final Class46 var6 = var4.aClass46Array977[var5];
				if ((((var6.anInt463 >> 29) & 3) == 2) && (var6.anInt457 == var2) && (var6.anInt465 == var3)) {
					method122(var6);
					return;
				}
			}
	}

	public boolean method108(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class124_Sub22_Sub19 var6, final int var7, final int var8, final int var9, final int var10,
			final int var11, final int var12) {
		return var6 == null ? true
				: method119(var1, var9, var10, (var11 - var9) + 1, (var12 - var10) + 1, var2, var3, var4, var6, var7,
						true, var8, 0);
	}

	public void method109(final int var1, final int var2, final int var3, final int var4,
			final Class124_Sub22_Sub19 var5, final Class124_Sub22_Sub19 var6, final int var7, final int var8,
			final int var9, final int var10) {
		if ((var5 != null) || (var6 != null)) {
			final Class30 var11 = new Class30();
			var11.anInt326 = var9;
			var11.anInt327 = var10;
			var11.anInt324 = (var2 * 128) + 64;
			var11.anInt321 = (var3 * 128) + 64;
			var11.anInt322 = var4;
			var11.aClass124_Sub22_Sub19_328 = var5;
			var11.aClass124_Sub22_Sub19_325 = var6;
			var11.anInt323 = var7;
			var11.anInt320 = var8;

			for (int var12 = var1; var12 >= 0; --var12)
				if (aClass124_Sub5ArrayArrayArray225[var12][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var12][var2][var3] = new Class124_Sub5(var12, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass30_981 = var11;
		}
	}

	public void method110(final int var1, final int var2, final int var3, final int var4) {
		final Class124_Sub5 var5 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var5 != null) {
			final Class36 var6 = var5.aClass36_973;
			if (var6 != null) {
				var6.anInt381 = (var6.anInt381 * var4) / 16;
				var6.anInt382 = (var6.anInt382 * var4) / 16;
			}
		}
	}

	void method111(final Model var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		boolean var7 = true;
		int var15 = var3;
		final int var20 = var3 + var5;
		final int var18 = var4 - 1;
		final int var12 = var4 + var6;

		for (int var13 = var2; var13 <= (var2 + 1); ++var13)
			if (var13 != anInt191) {
				for (int var8 = var15; var8 <= var20; ++var8)
					if ((var8 >= 0) && (var8 < anInt211))
						for (int var11 = var18; var11 <= var12; ++var11)
							if ((var11 >= 0) && (var11 < anInt236) && (!var7 || (var8 >= var20) || (var11 >= var12)
									|| ((var11 < var4) && (var8 != var3)))) {
								final Class124_Sub5 var14 = aClass124_Sub5ArrayArrayArray225[var13][var8][var11];
								if (var14 != null) {
									final int var21 = ((anIntArrayArrayArray237[var13][var8][var11]
											+ anIntArrayArrayArray237[var13][var8 + 1][var11]
											+ anIntArrayArrayArray237[var13][var8][var11 + 1]
											+ anIntArrayArrayArray237[var13][var8 + 1][var11 + 1]) / 4)
											- ((anIntArrayArrayArray237[var2][var3][var4]
													+ anIntArrayArrayArray237[var2][var3 + 1][var4]
													+ anIntArrayArrayArray237[var2][var3][var4 + 1]
													+ anIntArrayArrayArray237[var2][var3 + 1][var4 + 1]) / 4);
									final Class30 var16 = var14.aClass30_981;
									if (var16 != null) {
										Model var17;
										if (var16.aClass124_Sub22_Sub19_328 instanceof Model) {
											var17 = (Model) var16.aClass124_Sub22_Sub19_328;
											Model.method944(var1, var17,
													((var8 - var3) * 128) + ((1 - var5) * 64), var21,
													((var11 - var4) * 128) + ((1 - var6) * 64), var7);
										}

										if (var16.aClass124_Sub22_Sub19_325 instanceof Model) {
											var17 = (Model) var16.aClass124_Sub22_Sub19_325;
											Model.method944(var1, var17,
													((var8 - var3) * 128) + ((1 - var5) * 64), var21,
													((var11 - var4) * 128) + ((1 - var6) * 64), var7);
										}
									}

									for (int var19 = 0; var19 < var14.anInt976; ++var19) {
										final Class46 var9 = var14.aClass46Array977[var19];
										if ((var9 != null)
												&& (var9.aClass124_Sub22_Sub19_455 instanceof Model)) {
											final Model var22 = (Model) var9.aClass124_Sub22_Sub19_455;
											final int var10 = (var9.anInt462 - var9.anInt457) + 1;
											final int var23 = (var9.anInt460 - var9.anInt465) + 1;
											Model.method944(var1, var22,
													((var9.anInt457 - var3) * 128) + ((var10 - var5) * 64), var21,
													((var9.anInt465 - var4) * 128) + ((var23 - var6) * 64), var7);
										}
									}
								}
							}

				--var15;
				var7 = false;
			}

	}

	public void method112(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 != null)
			var4.aClass36_973 = null;
	}

	public void method113(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, final int var10, final int var11,
			final int var12, final int var13, final int var14, final int var15, final int var16, final int var17,
			final int var18, final int var19, final int var20) {
		Class28 var21;
		int var22;
		if (var4 == 0) {
			var21 = new Class28(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass124_Sub5ArrayArrayArray225[var22][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var22][var2][var3] = new Class124_Sub5(var22, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass28_970 = var21;
		} else if (var4 != 1) {
			final Class33 var23 = new Class33(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12,
					var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass124_Sub5ArrayArrayArray225[var22][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var22][var2][var3] = new Class124_Sub5(var22, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass33_974 = var23;
		} else {
			var21 = new Class28(var15, var16, var17, var18, var6, var20,
					(var7 == var8) && (var7 == var9) && (var7 == var10));

			for (var22 = var1; var22 >= 0; --var22)
				if (aClass124_Sub5ArrayArrayArray225[var22][var2][var3] == null)
					aClass124_Sub5ArrayArrayArray225[var22][var2][var3] = new Class124_Sub5(var22, var2, var3);

			aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass28_970 = var21;
		}
	}

	public void method114(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 != null)
			var4.aClass38_975 = null;
	}

	boolean method115(final int var1, final int var2, final int var3) {
		final int var4 = anIntArrayArrayArray235[var1][var2][var3];
		if (var4 != -anInt203) {
			if (var4 == anInt203)
				return true;
			else {
				final int var5 = var2 << 7;
				final int var6 = var3 << 7;
				if (method133(var5 + 1, anIntArrayArrayArray237[var1][var2][var3], var6 + 1)
						&& method133((var5 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var3], var6 + 1)
						&& method133((var5 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var3 + 1],
								(var6 + 128) - 1)
						&& method133(var5 + 1, anIntArrayArrayArray237[var1][var2][var3 + 1], (var6 + 128) - 1)) {
					anIntArrayArrayArray235[var1][var2][var3] = anInt203;
					return true;
				} else {
					anIntArrayArrayArray235[var1][var2][var3] = -anInt203;
					return false;
				}
			}
		} else
			return false;
	}

	public Class36 method116(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return var4 != null ? var4.aClass36_973 : null;
	}

	public Class46 method117(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 == null)
			return null;
		else {
			for (int var6 = 0; var6 < var4.anInt976; ++var6) {
				final Class46 var5 = var4.aClass46Array977[var6];
				if ((((var5.anInt463 >> 29) & 3) == 2) && (var5.anInt457 == var2) && (var5.anInt465 == var3))
					return var5;
			}

			return null;
		}
	}

	public Class44 method118(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return (var4 != null) && (var4.aClass44_972 != null) ? var4.aClass44_972 : null;
	}

	boolean method119(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final Class124_Sub22_Sub19 var9, final int var10, final boolean var11,
			final int var12, final int var13) {
		int var15;
		for (int var14 = var2; var14 < (var2 + var4); ++var14)
			for (var15 = var3; var15 < (var3 + var5); ++var15) {
				if ((var14 < 0) || (var15 < 0) || (var14 >= anInt211) || (var15 >= anInt236))
					return false;

				final Class124_Sub5 var17 = aClass124_Sub5ArrayArrayArray225[var1][var14][var15];
				if ((var17 != null) && (var17.anInt976 >= 5))
					return false;
			}

		final Class46 var16 = new Class46();
		var16.anInt463 = var12;
		var16.anInt464 = var13;
		var16.anInt459 = var1;
		var16.anInt466 = var6;
		var16.anInt454 = var7;
		var16.anInt453 = var8;
		var16.aClass124_Sub22_Sub19_455 = var9;
		var16.anInt452 = var10;
		var16.anInt457 = var2;
		var16.anInt465 = var3;
		var16.anInt462 = (var2 + var4) - 1;
		var16.anInt460 = (var3 + var5) - 1;

		for (var15 = var2; var15 < (var2 + var4); ++var15)
			for (int var19 = var3; var19 < (var3 + var5); ++var19) {
				int var20 = 0;
				if (var15 > var2)
					++var20;

				if (var15 < ((var2 + var4) - 1))
					var20 += 4;

				if (var19 > var3)
					var20 += 8;

				if (var19 < ((var3 + var5) - 1))
					var20 += 2;

				for (int var18 = var1; var18 >= 0; --var18)
					if (aClass124_Sub5ArrayArrayArray225[var18][var15][var19] == null)
						aClass124_Sub5ArrayArrayArray225[var18][var15][var19] = new Class124_Sub5(var18, var15, var19);

				final Class124_Sub5 var21 = aClass124_Sub5ArrayArrayArray225[var1][var15][var19];
				var21.aClass46Array977[var21.anInt976] = var16;
				var21.anIntArray978[var21.anInt976] = var20;
				var21.anInt968 |= var20;
				++var21.anInt976;
			}

		if (var11)
			aClass46Array195[anInt197++] = var16;

		return true;
	}

	public int method120(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return (var4 != null) && (var4.aClass36_973 != null) ? var4.aClass36_973.anInt385 : 0;
	}

	public int method121(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 == null)
			return 0;
		else {
			for (int var6 = 0; var6 < var4.anInt976; ++var6) {
				final Class46 var5 = var4.aClass46Array977[var6];
				if ((((var5.anInt463 >> 29) & 3) == 2) && (var5.anInt457 == var2) && (var5.anInt465 == var3))
					return var5.anInt463;
			}

			return 0;
		}
	}

	void method122(final Class46 var1) {
		for (int var2 = var1.anInt457; var2 <= var1.anInt462; ++var2)
			for (int var4 = var1.anInt465; var4 <= var1.anInt460; ++var4) {
				final Class124_Sub5 var5 = aClass124_Sub5ArrayArrayArray225[var1.anInt459][var2][var4];
				if (var5 != null) {
					int var3;
					for (var3 = 0; var3 < var5.anInt976; ++var3)
						if (var5.aClass46Array977[var3] == var1) {
							--var5.anInt976;

							for (int var6 = var3; var6 < var5.anInt976; ++var6) {
								var5.aClass46Array977[var6] = var5.aClass46Array977[var6 + 1];
								var5.anIntArray978[var6] = var5.anIntArray978[var6 + 1];
							}

							var5.aClass46Array977[var5.anInt976] = null;
							break;
						}

					var5.anInt968 = 0;

					for (var3 = 0; var3 < var5.anInt976; ++var3)
						var5.anInt968 |= var5.anIntArray978[var3];
				}
			}

	}

	public void method123(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt191; ++var4)
			for (int var5 = 0; var5 < anInt211; ++var5)
				for (int var6 = 0; var6 < anInt236; ++var6) {
					final Class124_Sub5 var9 = aClass124_Sub5ArrayArrayArray225[var4][var5][var6];
					if (var9 != null) {
						final Class30 var7 = var9.aClass30_981;
						Model var8;
						if ((var7 != null) && (var7.aClass124_Sub22_Sub19_328 instanceof Model)) {
							final Model var12 = (Model) var7.aClass124_Sub22_Sub19_328;
							method111(var12, var4, var5, var6, 1, 1);
							if (var7.aClass124_Sub22_Sub19_325 instanceof Model) {
								var8 = (Model) var7.aClass124_Sub22_Sub19_325;
								method111(var8, var4, var5, var6, 1, 1);
								Model.method944(var12, var8, 0, 0, 0, false);
								var7.aClass124_Sub22_Sub19_325 = var8.method945(var8.aShort1778, var8.aShort1779, var1,
										var2, var3);
							}

							var7.aClass124_Sub22_Sub19_328 = var12.method945(var12.aShort1778, var12.aShort1779, var1,
									var2, var3);
						}

						for (int var11 = 0; var11 < var9.anInt976; ++var11) {
							final Class46 var13 = var9.aClass46Array977[var11];
							if ((var13 != null)
									&& (var13.aClass124_Sub22_Sub19_455 instanceof Model)) {
								final Model var10 = (Model) var13.aClass124_Sub22_Sub19_455;
								method111(var10, var4, var5, var6, (var13.anInt462 - var13.anInt457) + 1,
										(var13.anInt460 - var13.anInt465) + 1);
								var13.aClass124_Sub22_Sub19_455 = var10.method945(var10.aShort1778, var10.aShort1779,
										var1, var2, var3);
							}
						}

						final Class44 var14 = var9.aClass44_972;
						if ((var14 != null) && (var14.aClass124_Sub22_Sub19_438 instanceof Model)) {
							var8 = (Model) var14.aClass124_Sub22_Sub19_438;
							method124(var8, var4, var5, var6);
							var14.aClass124_Sub22_Sub19_438 = var8.method945(var8.aShort1778, var8.aShort1779, var1,
									var2, var3);
						}
					}
				}

	}

	void method124(final Model var1, final int var2, final int var3, final int var4) {
		Class124_Sub5 var5;
		Model var6;
		if (var3 < anInt211) {
			var5 = aClass124_Sub5ArrayArrayArray225[var2][var3 + 1][var4];
			if ((var5 != null) && (var5.aClass44_972 != null)
					&& (var5.aClass44_972.aClass124_Sub22_Sub19_438 instanceof Model)) {
				var6 = (Model) var5.aClass44_972.aClass124_Sub22_Sub19_438;
				Model.method944(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt211) {
			var5 = aClass124_Sub5ArrayArrayArray225[var2][var3][var4 + 1];
			if ((var5 != null) && (var5.aClass44_972 != null)
					&& (var5.aClass44_972.aClass124_Sub22_Sub19_438 instanceof Model)) {
				var6 = (Model) var5.aClass44_972.aClass124_Sub22_Sub19_438;
				Model.method944(var1, var6, 0, 0, 128, true);
			}
		}

		if ((var3 < anInt211) && (var4 < anInt236)) {
			var5 = aClass124_Sub5ArrayArrayArray225[var2][var3 + 1][var4 + 1];
			if ((var5 != null) && (var5.aClass44_972 != null)
					&& (var5.aClass44_972.aClass124_Sub22_Sub19_438 instanceof Model)) {
				var6 = (Model) var5.aClass44_972.aClass124_Sub22_Sub19_438;
				Model.method944(var1, var6, 128, 0, 128, true);
			}
		}

		if ((var3 < anInt211) && (var4 > 0)) {
			var5 = aClass124_Sub5ArrayArrayArray225[var2][var3 + 1][var4 - 1];
			if ((var5 != null) && (var5.aClass44_972 != null)
					&& (var5.aClass44_972.aClass124_Sub22_Sub19_438 instanceof Model)) {
				var6 = (Model) var5.aClass44_972.aClass124_Sub22_Sub19_438;
				Model.method944(var1, var6, 128, 0, -128, true);
			}
		}

	}

	public void method125(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 != null)
			var4.aClass30_981 = null;
	}

	public int method126(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return (var4 != null) && (var4.aClass44_972 != null) ? var4.aClass44_972.anInt437 : 0;
	}

	public void method127(final int var1, final int var2, final int var3) {
		aBool217 = true;
		anInt218 = var1;
		anInt219 = var2;
		anInt220 = var3;
		anInt214 = -1;
		anInt222 = -1;
	}

	public void method128(final int var1, final int var2, final int var3, final int var4,
			final Class124_Sub22_Sub19 var5, final int var6, final Class124_Sub22_Sub19 var7,
			final Class124_Sub22_Sub19 var8) {
		final Class38 var9 = new Class38();
		var9.aClass124_Sub22_Sub19_393 = var5;
		var9.anInt391 = (var2 * 128) + 64;
		var9.anInt390 = (var3 * 128) + 64;
		var9.anInt397 = var4;
		var9.anInt395 = var6;
		var9.aClass124_Sub22_Sub19_392 = var7;
		var9.aClass124_Sub22_Sub19_394 = var8;
		int var12 = 0;
		final Class124_Sub5 var11 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var11 != null)
			for (int var13 = 0; var13 < var11.anInt976; ++var13)
				if (((var11.aClass46Array977[var13].anInt464 & 256) == 256)
						&& (var11.aClass46Array977[var13].aClass124_Sub22_Sub19_455 instanceof Class124_Sub22_Sub19_Sub7)) {
					final Class124_Sub22_Sub19_Sub7 var10 = (Class124_Sub22_Sub19_Sub7) var11.aClass46Array977[var13].aClass124_Sub22_Sub19_455;
					var10.method989();
					if (var10.anInt1605 > var12)
						var12 = var10.anInt1605;
				}

		var9.anInt396 = var12;
		if (aClass124_Sub5ArrayArrayArray225[var1][var2][var3] == null)
			aClass124_Sub5ArrayArrayArray225[var1][var2][var3] = new Class124_Sub5(var1, var2, var3);

		aClass124_Sub5ArrayArrayArray225[var1][var2][var3].aClass38_975 = var9;
	}

	public boolean method129(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final Class124_Sub22_Sub19 var7, final int var8, final int var9, final int var10) {
		if (var7 != null) {
			final int var11 = (var2 * 128) + (64 * var5);
			final int var12 = (var3 * 128) + (64 * var6);
			return method119(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		} else
			return true;
	}

	boolean method130(final int var1, final int var2, final int var3, final int var4) {
		if (!method115(var1, var2, var3))
			return false;
		else {
			final int var10 = var2 << 7;
			final int var5 = var3 << 7;
			final int var6 = anIntArrayArrayArray237[var1][var2][var3] - 1;
			final int var7 = var6 - 120;
			final int var8 = var6 - 230;
			final int var9 = var6 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var10 > anInt209) {
						if (!method133(var10, var6, var5))
							return false;

						if (!method133(var10, var6, var5 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method133(var10, var7, var5))
							return false;

						if (!method133(var10, var7, var5 + 128))
							return false;
					}

					if (!method133(var10, var8, var5))
						return false;

					if (!method133(var10, var8, var5 + 128))
						return false;

					return true;
				}

				if (var4 == 2) {
					if (var5 < anInt230) {
						if (!method133(var10, var6, var5 + 128))
							return false;

						if (!method133(var10 + 128, var6, var5 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method133(var10, var7, var5 + 128))
							return false;

						if (!method133(var10 + 128, var7, var5 + 128))
							return false;
					}

					if (!method133(var10, var8, var5 + 128))
						return false;

					if (!method133(var10 + 128, var8, var5 + 128))
						return false;

					return true;
				}

				if (var4 == 4) {
					if (var10 < anInt209) {
						if (!method133(var10 + 128, var6, var5))
							return false;

						if (!method133(var10 + 128, var6, var5 + 128))
							return false;
					}

					if (var1 > 0) {
						if (!method133(var10 + 128, var7, var5))
							return false;

						if (!method133(var10 + 128, var7, var5 + 128))
							return false;
					}

					if (method133(var10 + 128, var8, var5)) {
						if (!method133(var10 + 128, var8, var5 + 128))
							return false;

						return true;
					}

					return false;
				}

				if (var4 == 8) {
					if (var5 > anInt230) {
						if (!method133(var10, var6, var5))
							return false;

						if (!method133(var10 + 128, var6, var5))
							return false;
					}

					if (var1 > 0) {
						if (!method133(var10, var7, var5))
							return false;

						if (!method133(var10 + 128, var7, var5))
							return false;
					}

					if (!method133(var10, var8, var5))
						return false;

					if (!method133(var10 + 128, var8, var5))
						return false;

					return true;
				}
			}

			return !method133(var10 + 64, var9, var5 + 64) ? false
					: (var4 == 16 ? method133(var10, var8, var5 + 128)
							: (var4 == 32 ? method133(var10 + 128, var8, var5 + 128)
									: (var4 == 64 ? method133(var10 + 128, var8, var5)
											: (var4 == 128 ? method133(var10, var8, var5) : true))));
		}
	}

	public Class30 method131(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return var4 != null ? var4.aClass30_981 : null;
	}

	boolean method132(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6) {
		int var7;
		int var8;
		if ((var2 == var3) && (var4 == var5)) {
			if (!method115(var1, var2, var4))
				return false;
			else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return method133(var7 + 1, anIntArrayArrayArray237[var1][var2][var4] - var6, var8 + 1)
						&& method133((var7 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var4] - var6, var8 + 1)
						&& method133((var7 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var4 + 1] - var6,
								(var8 + 128) - 1)
						&& method133(var7 + 1, anIntArrayArrayArray237[var1][var2][var4 + 1] - var6, (var8 + 128) - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7)
				for (var8 = var4; var8 <= var5; ++var8)
					if (anIntArrayArrayArray235[var1][var7][var8] == -anInt203)
						return false;

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			final int var10 = anIntArrayArrayArray237[var1][var2][var4] - var6;
			if (!method133(var7, var10, var8))
				return false;
			else {
				final int var9 = (var3 << 7) - 1;
				if (!method133(var9, var10, var8))
					return false;
				else {
					final int var11 = (var5 << 7) - 1;
					if (!method133(var7, var10, var11))
						return false;
					else if (!method133(var9, var10, var11))
						return false;
					else
						return true;
				}
			}
		}
	}

	boolean method133(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt226; ++var4) {
			final Class42 var5 = aClass42Array227[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.anInt408 == 1) {
				var6 = var5.anInt413 - var1;
				if (var6 > 0) {
					var9 = var5.anInt415 + ((var5.anInt418 * var6) >> 8);
					var8 = var5.anInt416 + ((var5.anInt423 * var6) >> 8);
					var7 = var5.anInt421 + ((var5.anInt424 * var6) >> 8);
					var10 = var5.anInt419 + ((var5.anInt425 * var6) >> 8);
					if ((var3 >= var9) && (var3 <= var8) && (var2 >= var7) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt408 == 2) {
				var6 = var1 - var5.anInt413;
				if (var6 > 0) {
					var9 = var5.anInt415 + ((var5.anInt418 * var6) >> 8);
					var8 = var5.anInt416 + ((var5.anInt423 * var6) >> 8);
					var7 = var5.anInt421 + ((var5.anInt424 * var6) >> 8);
					var10 = var5.anInt419 + ((var5.anInt425 * var6) >> 8);
					if ((var3 >= var9) && (var3 <= var8) && (var2 >= var7) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt408 == 3) {
				var6 = var5.anInt415 - var3;
				if (var6 > 0) {
					var9 = var5.anInt413 + ((var5.anInt420 * var6) >> 8);
					var8 = var5.anInt414 + ((var5.anInt417 * var6) >> 8);
					var7 = var5.anInt421 + ((var5.anInt424 * var6) >> 8);
					var10 = var5.anInt419 + ((var5.anInt425 * var6) >> 8);
					if ((var1 >= var9) && (var1 <= var8) && (var2 >= var7) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt408 == 4) {
				var6 = var3 - var5.anInt415;
				if (var6 > 0) {
					var9 = var5.anInt413 + ((var5.anInt420 * var6) >> 8);
					var8 = var5.anInt414 + ((var5.anInt417 * var6) >> 8);
					var7 = var5.anInt421 + ((var5.anInt424 * var6) >> 8);
					var10 = var5.anInt419 + ((var5.anInt425 * var6) >> 8);
					if ((var1 >= var9) && (var1 <= var8) && (var2 >= var7) && (var2 <= var10))
						return true;
				}
			} else if (var5.anInt408 == 5) {
				var6 = var2 - var5.anInt421;
				if (var6 > 0) {
					var9 = var5.anInt413 + ((var5.anInt420 * var6) >> 8);
					var8 = var5.anInt414 + ((var5.anInt417 * var6) >> 8);
					var7 = var5.anInt415 + ((var5.anInt418 * var6) >> 8);
					var10 = var5.anInt416 + ((var5.anInt423 * var6) >> 8);
					if ((var1 >= var9) && (var1 <= var8) && (var3 >= var7) && (var3 <= var10))
						return true;
				}
			}
		}

		return false;
	}

	static {
		anIntArray224 = new int[anInt223];
		aClass42ArrayArray210 = new Class42[anInt223][500];
		anInt226 = 0;
		aClass42Array227 = new Class42[500];
		aClass111_200 = new Class111();
		anIntArray229 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
		anIntArray221 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
		anIntArray231 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		anIntArray232 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		anIntArray233 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray234 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		anIntArray228 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		aBoolArrayArrayArrayArray238 = new boolean[8][32][51][51];
	}

	public static void method134(final int[] var0, final int var1, final int var2, final int var3, final int var4) {
		anInt242 = 0;
		anInt243 = 0;
		anInt244 = var3;
		anInt245 = var4;
		anInt240 = var3 / 2;
		anInt201 = var4 / 2;
		final boolean[][][][] var6 = new boolean[9][32][53][53];

		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 128; var8 <= 384; var8 += 32)
			for (var7 = 0; var7 < 2048; var7 += 64) {
				anInt212 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var8];
				anInt213 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var8];
				anInt205 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var7];
				anInt215 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var7];
				var9 = (var8 - 128) / 32;
				var5 = var7 / 64;

				for (int var12 = -26; var12 <= 26; ++var12)
					for (var10 = -26; var10 <= 26; ++var10) {
						var11 = var12 * 128;
						final int var15 = var10 * 128;
						boolean var13 = false;

						for (int var14 = -var1; var14 <= var2; var14 += 128)
							if (method145(var11, var0[var9] + var14, var15)) {
								var13 = true;
								break;
							}

						var6[var9][var5][var12 + 25 + 1][var10 + 25 + 1] = var13;
					}
			}

		for (var8 = 0; var8 < 8; ++var8)
			for (var7 = 0; var7 < 32; ++var7)
				for (var9 = -25; var9 < 25; ++var9)
					for (var5 = -25; var5 < 25; ++var5) {
						boolean var16 = false;

						label96: for (var10 = -1; var10 <= 1; ++var10)
							for (var11 = -1; var11 <= 1; ++var11) {
								if (var6[var8][var7][var9 + var10 + 25 + 1][var5 + var11 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var6[var8][(var7 + 1) % 31][var9 + var10 + 25 + 1][var5 + var11 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var6[var8 + 1][var7][var9 + var10 + 25 + 1][var5 + var11 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var6[var8 + 1][(var7 + 1) % 31][var9 + var10 + 25 + 1][var5 + var11 + 25 + 1]) {
									var16 = true;
									break label96;
								}
							}

						aBoolArrayArrayArrayArray238[var8][var7][var9 + 25][var5 + 25] = var16;
					}

	}

	public void method135(int var1, final int var2, int var3, final int var4, final int var5, final int var6) {
		if (var1 < 0)
			var1 = 0;
		else if (var1 >= (anInt211 * 128))
			var1 = (anInt211 * 128) - 1;

		if (var3 < 0)
			var3 = 0;
		else if (var3 >= (anInt236 * 128))
			var3 = (anInt236 * 128) - 1;

		++anInt203;
		anInt212 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var4];
		anInt213 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var4];
		anInt205 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var5];
		anInt215 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var5];
		aBoolArrayArray239 = aBoolArrayArrayArrayArray238[(var4 - 128) / 32][var5 / 64];
		anInt209 = var1;
		anInt198 = var2;
		anInt230 = var3;
		anInt207 = var1 / 128;
		anInt208 = var3 / 128;
		anInt241 = var6;
		anInt199 = anInt207 - 25;
		if (anInt199 < 0)
			anInt199 = 0;

		anInt193 = anInt208 - 25;
		if (anInt193 < 0)
			anInt193 = 0;

		anInt204 = anInt207 + 25;
		if (anInt204 > anInt211)
			anInt204 = anInt211;

		anInt206 = anInt208 + 25;
		if (anInt206 > anInt236)
			anInt206 = anInt236;

		method104();
		anInt194 = 0;

		int var8;
		Class124_Sub5[][] var9;
		int var12;
		int var13;
		for (var12 = anInt196; var12 < anInt191; ++var12) {
			var9 = aClass124_Sub5ArrayArrayArray225[var12];

			for (var8 = anInt199; var8 < anInt204; ++var8)
				for (var13 = anInt193; var13 < anInt206; ++var13) {
					final Class124_Sub5 var14 = var9[var8][var13];
					if (var14 != null)
						if ((var14.anInt979 > var6)
								|| (!aBoolArrayArray239[(var8 - anInt207) + 25][(var13 - anInt208) + 25]
										&& ((anIntArrayArrayArray237[var12][var8][var13] - var2) < 2000))) {
							var14.aBool971 = false;
							var14.aBool982 = false;
							var14.anInt984 = 0;
						} else {
							var14.aBool971 = true;
							var14.aBool982 = true;
							if (var14.anInt976 > 0)
								var14.aBool988 = true;
							else
								var14.aBool988 = false;

							++anInt194;
						}
				}
		}

		Class124_Sub5 var7;
		int var10;
		int var11;
		int var15;
		int var16;
		for (var12 = anInt196; var12 < anInt191; ++var12) {
			var9 = aClass124_Sub5ArrayArrayArray225[var12];

			for (var8 = -25; var8 <= 0; ++var8) {
				var13 = anInt207 + var8;
				var10 = anInt207 - var8;
				if ((var13 >= anInt199) || (var10 < anInt204))
					for (var15 = -25; var15 <= 0; ++var15) {
						var11 = anInt208 + var15;
						var16 = anInt208 - var15;
						if (var13 >= anInt199) {
							if (var11 >= anInt193) {
								var7 = var9[var13][var11];
								if ((var7 != null) && var7.aBool971)
									method137(var7, true);
							}

							if (var16 < anInt206) {
								var7 = var9[var13][var16];
								if ((var7 != null) && var7.aBool971)
									method137(var7, true);
							}
						}

						if (var10 < anInt204) {
							if (var11 >= anInt193) {
								var7 = var9[var10][var11];
								if ((var7 != null) && var7.aBool971)
									method137(var7, true);
							}

							if (var16 < anInt206) {
								var7 = var9[var10][var16];
								if ((var7 != null) && var7.aBool971)
									method137(var7, true);
							}
						}

						if (anInt194 == 0) {
							aBool217 = false;
							return;
						}
					}
			}
		}

		for (var12 = anInt196; var12 < anInt191; ++var12) {
			var9 = aClass124_Sub5ArrayArrayArray225[var12];

			for (var8 = -25; var8 <= 0; ++var8) {
				var13 = anInt207 + var8;
				var10 = anInt207 - var8;
				if ((var13 >= anInt199) || (var10 < anInt204))
					for (var15 = -25; var15 <= 0; ++var15) {
						var11 = anInt208 + var15;
						var16 = anInt208 - var15;
						if (var13 >= anInt199) {
							if (var11 >= anInt193) {
								var7 = var9[var13][var11];
								if ((var7 != null) && var7.aBool971)
									method137(var7, false);
							}

							if (var16 < anInt206) {
								var7 = var9[var13][var16];
								if ((var7 != null) && var7.aBool971)
									method137(var7, false);
							}
						}

						if (var10 < anInt204) {
							if (var11 >= anInt193) {
								var7 = var9[var10][var11];
								if ((var7 != null) && var7.aBool971)
									method137(var7, false);
							}

							if (var16 < anInt206) {
								var7 = var9[var10][var16];
								if ((var7 != null) && var7.aBool971)
									method137(var7, false);
							}
						}

						if (anInt194 == 0) {
							aBool217 = false;
							return;
						}
					}
			}
		}

		aBool217 = false;
	}

	public int method136(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		return (var4 != null) && (var4.aClass30_981 != null) ? var4.aClass30_981.anInt326 : 0;
	}

	void method137(final Class124_Sub5 var1, boolean var2) {
		aClass111_200.method424(var1);

		while (true) {
			Class124_Sub5 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Class124_Sub5[][] var8;
			Class124_Sub5 var9;
			int var11;
			int var16;
			int var17;
			int var18;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do
								do
									while (true) {
										Class30 var10;
										Class46 var12;
										boolean var13;
										int var14;
										int var19;
										int var20;
										Class124_Sub5 var36;
										while (true) {
											do {
												var3 = (Class124_Sub5) aClass111_200.method427();
												if (var3 == null)
													return;
											} while (!var3.aBool982);

											var4 = var3.anInt967;
											var5 = var3.anInt983;
											var6 = var3.anInt966;
											var7 = var3.anInt969;
											var8 = aClass124_Sub5ArrayArrayArray225[var6];
											if (!var3.aBool971)
												break;

											if (var2) {
												if (var6 > 0) {
													var9 = aClass124_Sub5ArrayArrayArray225[var6 - 1][var4][var5];
													if ((var9 != null) && var9.aBool982)
														continue;
												}

												if ((var4 <= anInt207) && (var4 > anInt199)) {
													var9 = var8[var4 - 1][var5];
													if ((var9 != null) && var9.aBool982
															&& (var9.aBool971 || ((var3.anInt968 & 1) == 0)))
														continue;
												}

												if ((var4 >= anInt207) && (var4 < (anInt204 - 1))) {
													var9 = var8[var4 + 1][var5];
													if ((var9 != null) && var9.aBool982
															&& (var9.aBool971 || ((var3.anInt968 & 4) == 0)))
														continue;
												}

												if ((var5 <= anInt208) && (var5 > anInt193)) {
													var9 = var8[var4][var5 - 1];
													if ((var9 != null) && var9.aBool982
															&& (var9.aBool971 || ((var3.anInt968 & 8) == 0)))
														continue;
												}

												if ((var5 >= anInt208) && (var5 < (anInt206 - 1))) {
													var9 = var8[var4][var5 + 1];
													if ((var9 != null) && var9.aBool982
															&& (var9.aBool971 || ((var3.anInt968 & 2) == 0)))
														continue;
												}
											} else
												var2 = true;

											var3.aBool971 = false;
											if (var3.aClass124_Sub5_980 != null) {
												var9 = var3.aClass124_Sub5_980;
												if (var9.aClass28_970 != null) {
													if (!method115(0, var4, var5))
														method143(var9.aClass28_970, 0, anInt212, anInt213, anInt205,
																anInt215, var4, var5);
												} else if ((var9.aClass33_974 != null) && !method115(0, var4, var5))
													method101(var9.aClass33_974, anInt212, anInt213, anInt205, anInt215,
															var4, var5);

												var10 = var9.aClass30_981;
												if (var10 != null)
													var10.aClass124_Sub22_Sub19_328.method833(0, anInt212, anInt213,
															anInt205, anInt215, var10.anInt324 - anInt209,
															var10.anInt322 - anInt198, var10.anInt321 - anInt230,
															var10.anInt326);

												for (var11 = 0; var11 < var9.anInt976; ++var11) {
													var12 = var9.aClass46Array977[var11];
													if (var12 != null)
														var12.aClass124_Sub22_Sub19_455.method833(var12.anInt452,
																anInt212, anInt213, anInt205, anInt215,
																var12.anInt466 - anInt209, var12.anInt453 - anInt198,
																var12.anInt454 - anInt230, var12.anInt463);
												}
											}

											var13 = false;
											if (var3.aClass28_970 != null) {
												if (!method115(var7, var4, var5)) {
													var13 = true;
													if ((var3.aClass28_970.anInt308 != 12345678)
															|| (aBool217 && (var6 <= anInt218)))
														method143(var3.aClass28_970, var7, anInt212, anInt213, anInt205,
																anInt215, var4, var5);
												}
											} else if ((var3.aClass33_974 != null) && !method115(var7, var4, var5)) {
												var13 = true;
												method101(var3.aClass33_974, anInt212, anInt213, anInt205, anInt215,
														var4, var5);
											}

											var14 = 0;
											var11 = 0;
											final Class30 var31 = var3.aClass30_981;
											final Class36 var15 = var3.aClass36_973;
											if ((var31 != null) || (var15 != null)) {
												if (anInt207 == var4)
													++var14;
												else if (anInt207 < var4)
													var14 += 2;

												if (anInt208 == var5)
													var14 += 3;
												else if (anInt208 > var5)
													var14 += 6;

												var11 = anIntArray229[var14];
												var3.anInt987 = anIntArray231[var14];
											}

											if (var31 != null) {
												if ((var31.anInt323 & anIntArray221[var14]) != 0) {
													if (var31.anInt323 == 16) {
														var3.anInt984 = 3;
														var3.anInt985 = anIntArray232[var14];
														var3.anInt986 = 3 - var3.anInt985;
													} else if (var31.anInt323 == 32) {
														var3.anInt984 = 6;
														var3.anInt985 = anIntArray233[var14];
														var3.anInt986 = 6 - var3.anInt985;
													} else if (var31.anInt323 == 64) {
														var3.anInt984 = 12;
														var3.anInt985 = anIntArray234[var14];
														var3.anInt986 = 12 - var3.anInt985;
													} else {
														var3.anInt984 = 9;
														var3.anInt985 = anIntArray228[var14];
														var3.anInt986 = 9 - var3.anInt985;
													}
												} else
													var3.anInt984 = 0;

												if (((var31.anInt323 & var11) != 0)
														&& !method130(var7, var4, var5, var31.anInt323))
													var31.aClass124_Sub22_Sub19_328.method833(0, anInt212, anInt213,
															anInt205, anInt215, var31.anInt324 - anInt209,
															var31.anInt322 - anInt198, var31.anInt321 - anInt230,
															var31.anInt326);

												if (((var31.anInt320 & var11) != 0)
														&& !method130(var7, var4, var5, var31.anInt320))
													var31.aClass124_Sub22_Sub19_325.method833(0, anInt212, anInt213,
															anInt205, anInt215, var31.anInt324 - anInt209,
															var31.anInt322 - anInt198, var31.anInt321 - anInt230,
															var31.anInt326);
											}

											if ((var15 != null) && !method140(var7, var4, var5,
													var15.aClass124_Sub22_Sub19_383.anInt1605))
												if ((var15.anInt386 & var11) != 0)
													var15.aClass124_Sub22_Sub19_383.method833(0, anInt212, anInt213,
															anInt205, anInt215,
															(var15.anInt378 - anInt209) + var15.anInt381,
															var15.anInt387 - anInt198,
															(var15.anInt376 - anInt230) + var15.anInt382,
															var15.anInt385);
												else if (var15.anInt386 == 256) {
													var16 = var15.anInt378 - anInt209;
													var17 = var15.anInt387 - anInt198;
													var18 = var15.anInt376 - anInt230;
													var19 = var15.anInt384;
													if ((var19 != 1) && (var19 != 2))
														var20 = var16;
													else
														var20 = -var16;

													int var21;
													if ((var19 != 2) && (var19 != 3))
														var21 = var18;
													else
														var21 = -var18;

													if (var21 < var20)
														var15.aClass124_Sub22_Sub19_383.method833(0, anInt212, anInt213,
																anInt205, anInt215, var16 + var15.anInt381, var17,
																var18 + var15.anInt382, var15.anInt385);
													else if (var15.aClass124_Sub22_Sub19_377 != null)
														var15.aClass124_Sub22_Sub19_377.method833(0, anInt212, anInt213,
																anInt205, anInt215, var16, var17, var18,
																var15.anInt385);
												}

											if (var13) {
												final Class44 var22 = var3.aClass44_972;
												if (var22 != null)
													var22.aClass124_Sub22_Sub19_438.method833(0, anInt212, anInt213,
															anInt205, anInt215, var22.anInt434 - anInt209,
															var22.anInt436 - anInt198, var22.anInt433 - anInt230,
															var22.anInt437);

												final Class38 var23 = var3.aClass38_975;
												if ((var23 != null) && (var23.anInt396 == 0)) {
													if (var23.aClass124_Sub22_Sub19_392 != null)
														var23.aClass124_Sub22_Sub19_392.method833(0, anInt212, anInt213,
																anInt205, anInt215, var23.anInt391 - anInt209,
																var23.anInt397 - anInt198, var23.anInt390 - anInt230,
																var23.anInt395);

													if (var23.aClass124_Sub22_Sub19_394 != null)
														var23.aClass124_Sub22_Sub19_394.method833(0, anInt212, anInt213,
																anInt205, anInt215, var23.anInt391 - anInt209,
																var23.anInt397 - anInt198, var23.anInt390 - anInt230,
																var23.anInt395);

													if (var23.aClass124_Sub22_Sub19_393 != null)
														var23.aClass124_Sub22_Sub19_393.method833(0, anInt212, anInt213,
																anInt205, anInt215, var23.anInt391 - anInt209,
																var23.anInt397 - anInt198, var23.anInt390 - anInt230,
																var23.anInt395);
												}
											}

											var16 = var3.anInt968;
											if (var16 != 0) {
												if ((var4 < anInt207) && ((var16 & 4) != 0)) {
													var36 = var8[var4 + 1][var5];
													if ((var36 != null) && var36.aBool982)
														aClass111_200.method424(var36);
												}

												if ((var5 < anInt208) && ((var16 & 2) != 0)) {
													var36 = var8[var4][var5 + 1];
													if ((var36 != null) && var36.aBool982)
														aClass111_200.method424(var36);
												}

												if ((var4 > anInt207) && ((var16 & 1) != 0)) {
													var36 = var8[var4 - 1][var5];
													if ((var36 != null) && var36.aBool982)
														aClass111_200.method424(var36);
												}

												if ((var5 > anInt208) && ((var16 & 8) != 0)) {
													var36 = var8[var4][var5 - 1];
													if ((var36 != null) && var36.aBool982)
														aClass111_200.method424(var36);
												}
											}
											break;
										}

										if (var3.anInt984 != 0) {
											var13 = true;

											for (var14 = 0; var14 < var3.anInt976; ++var14)
												if ((var3.aClass46Array977[var14].anInt458 != anInt203)
														&& ((var3.anIntArray978[var14]
																& var3.anInt984) == var3.anInt985)) {
													var13 = false;
													break;
												}

											if (var13) {
												var10 = var3.aClass30_981;
												if (!method130(var7, var4, var5, var10.anInt323))
													var10.aClass124_Sub22_Sub19_328.method833(0, anInt212, anInt213,
															anInt205, anInt215, var10.anInt324 - anInt209,
															var10.anInt322 - anInt198, var10.anInt321 - anInt230,
															var10.anInt326);

												var3.anInt984 = 0;
											}
										}

										if (!var3.aBool988)
											break;

										try {
											final int var33 = var3.anInt976;
											var3.aBool988 = false;
											var14 = 0;

											label561: for (var11 = 0; var11 < var33; ++var11) {
												var12 = var3.aClass46Array977[var11];
												if (var12.anInt458 != anInt203) {
													for (var24 = var12.anInt457; var24 <= var12.anInt462; ++var24)
														for (var16 = var12.anInt465; var16 <= var12.anInt460; ++var16) {
															var36 = var8[var24][var16];
															if (var36.aBool971) {
																var3.aBool988 = true;
																continue label561;
															}

															if (var36.anInt984 != 0) {
																var18 = 0;
																if (var24 > var12.anInt457)
																	++var18;

																if (var24 < var12.anInt462)
																	var18 += 4;

																if (var16 > var12.anInt465)
																	var18 += 8;

																if (var16 < var12.anInt460)
																	var18 += 2;

																if ((var18 & var36.anInt984) == var3.anInt986) {
																	var3.aBool988 = true;
																	continue label561;
																}
															}
														}

													aClass46Array202[var14++] = var12;
													var24 = anInt207 - var12.anInt457;
													var16 = var12.anInt462 - anInt207;
													if (var16 > var24)
														var24 = var16;

													var17 = anInt208 - var12.anInt465;
													var18 = var12.anInt460 - anInt208;
													if (var18 > var17)
														var12.anInt461 = var24 + var18;
													else
														var12.anInt461 = var24 + var17;
												}
											}

											while (var14 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var14; ++var24) {
													final Class46 var35 = aClass46Array202[var24];
													if (var35.anInt458 != anInt203)
														if (var35.anInt461 > var11) {
															var11 = var35.anInt461;
															var25 = var24;
														} else if (var35.anInt461 == var11) {
															var17 = var35.anInt466 - anInt209;
															var18 = var35.anInt454 - anInt230;
															var19 = aClass46Array202[var25].anInt466 - anInt209;
															var20 = aClass46Array202[var25].anInt454 - anInt230;
															if (((var17 * var17) + (var18 * var18)) > ((var19 * var19)
																	+ (var20 * var20)))
																var25 = var24;
														}
												}

												if (var25 == -1)
													break;

												final Class46 var34 = aClass46Array202[var25];
												var34.anInt458 = anInt203;
												if (!method132(var7, var34.anInt457, var34.anInt462, var34.anInt465,
														var34.anInt460, var34.aClass124_Sub22_Sub19_455.anInt1605))
													var34.aClass124_Sub22_Sub19_455.method833(var34.anInt452, anInt212,
															anInt213, anInt205, anInt215, var34.anInt466 - anInt209,
															var34.anInt453 - anInt198, var34.anInt454 - anInt230,
															var34.anInt463);

												for (var16 = var34.anInt457; var16 <= var34.anInt462; ++var16)
													for (var17 = var34.anInt465; var17 <= var34.anInt460; ++var17) {
														final Class124_Sub5 var26 = var8[var16][var17];
														if (var26.anInt984 != 0)
															aClass111_200.method424(var26);
														else if (((var16 != var4) || (var17 != var5)) && var26.aBool982)
															aClass111_200.method424(var26);
													}
											}

											if (!var3.aBool988)
												break;
										} catch (final Exception var28) {
											var3.aBool988 = false;
											break;
										}
									}
								while (!var3.aBool982);
							while (var3.anInt984 != 0);

							if ((var4 > anInt207) || (var4 <= anInt199))
								break;

							var9 = var8[var4 - 1][var5];
						} while ((var9 != null) && var9.aBool982);

						if ((var4 < anInt207) || (var4 >= (anInt204 - 1)))
							break;

						var9 = var8[var4 + 1][var5];
					} while ((var9 != null) && var9.aBool982);

					if ((var5 > anInt208) || (var5 <= anInt193))
						break;

					var9 = var8[var4][var5 - 1];
				} while ((var9 != null) && var9.aBool982);

				if ((var5 < anInt208) || (var5 >= (anInt206 - 1)))
					break;

				var9 = var8[var4][var5 + 1];
			} while ((var9 != null) && var9.aBool982);

			var3.aBool982 = false;
			--anInt194;
			final Class38 var32 = var3.aClass38_975;
			if ((var32 != null) && (var32.anInt396 != 0)) {
				if (var32.aClass124_Sub22_Sub19_392 != null)
					var32.aClass124_Sub22_Sub19_392.method833(0, anInt212, anInt213, anInt205, anInt215,
							var32.anInt391 - anInt209, var32.anInt397 - anInt198 - var32.anInt396,
							var32.anInt390 - anInt230, var32.anInt395);

				if (var32.aClass124_Sub22_Sub19_394 != null)
					var32.aClass124_Sub22_Sub19_394.method833(0, anInt212, anInt213, anInt205, anInt215,
							var32.anInt391 - anInt209, var32.anInt397 - anInt198 - var32.anInt396,
							var32.anInt390 - anInt230, var32.anInt395);

				if (var32.aClass124_Sub22_Sub19_393 != null)
					var32.aClass124_Sub22_Sub19_393.method833(0, anInt212, anInt213, anInt205, anInt215,
							var32.anInt391 - anInt209, var32.anInt397 - anInt198 - var32.anInt396,
							var32.anInt390 - anInt230, var32.anInt395);
			}

			if (var3.anInt987 != 0) {
				final Class36 var29 = var3.aClass36_973;
				if ((var29 != null) && !method140(var7, var4, var5, var29.aClass124_Sub22_Sub19_383.anInt1605))
					if ((var29.anInt386 & var3.anInt987) != 0)
						var29.aClass124_Sub22_Sub19_383.method833(0, anInt212, anInt213, anInt205, anInt215,
								(var29.anInt378 - anInt209) + var29.anInt381, var29.anInt387 - anInt198,
								(var29.anInt376 - anInt230) + var29.anInt382, var29.anInt385);
					else if (var29.anInt386 == 256) {
						var11 = var29.anInt378 - anInt209;
						var25 = var29.anInt387 - anInt198;
						var24 = var29.anInt376 - anInt230;
						var16 = var29.anInt384;
						if ((var16 != 1) && (var16 != 2))
							var17 = var11;
						else
							var17 = -var11;

						if ((var16 != 2) && (var16 != 3))
							var18 = var24;
						else
							var18 = -var24;

						if (var18 >= var17)
							var29.aClass124_Sub22_Sub19_383.method833(0, anInt212, anInt213, anInt205, anInt215,
									var11 + var29.anInt381, var25, var24 + var29.anInt382, var29.anInt385);
						else if (var29.aClass124_Sub22_Sub19_377 != null)
							var29.aClass124_Sub22_Sub19_377.method833(0, anInt212, anInt213, anInt205, anInt215, var11,
									var25, var24, var29.anInt385);
					}

				final Class30 var27 = var3.aClass30_981;
				if (var27 != null) {
					if (((var27.anInt320 & var3.anInt987) != 0) && !method130(var7, var4, var5, var27.anInt320))
						var27.aClass124_Sub22_Sub19_325.method833(0, anInt212, anInt213, anInt205, anInt215,
								var27.anInt324 - anInt209, var27.anInt322 - anInt198, var27.anInt321 - anInt230,
								var27.anInt326);

					if (((var27.anInt323 & var3.anInt987) != 0) && !method130(var7, var4, var5, var27.anInt323))
						var27.aClass124_Sub22_Sub19_328.method833(0, anInt212, anInt213, anInt205, anInt215,
								var27.anInt324 - anInt209, var27.anInt322 - anInt198, var27.anInt321 - anInt230,
								var27.anInt326);
				}
			}

			Class124_Sub5 var30;
			if (var6 < (anInt191 - 1)) {
				var30 = aClass124_Sub5ArrayArrayArray225[var6 + 1][var4][var5];
				if ((var30 != null) && var30.aBool982)
					aClass111_200.method424(var30);
			}

			if (var4 < anInt207) {
				var30 = var8[var4 + 1][var5];
				if ((var30 != null) && var30.aBool982)
					aClass111_200.method424(var30);
			}

			if (var5 < anInt208) {
				var30 = var8[var4][var5 + 1];
				if ((var30 != null) && var30.aBool982)
					aClass111_200.method424(var30);
			}

			if (var4 > anInt207) {
				var30 = var8[var4 - 1][var5];
				if ((var30 != null) && var30.aBool982)
					aClass111_200.method424(var30);
			}

			if (var5 > anInt208) {
				var30 = var8[var4][var5 - 1];
				if ((var30 != null) && var30.aBool982)
					aClass111_200.method424(var30);
			}
		}
	}

	boolean method138(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		if ((var2 < var3) && (var2 < var4) && (var2 < var5))
			return false;
		else if ((var2 > var3) && (var2 > var4) && (var2 > var5))
			return false;
		else if ((var1 < var6) && (var1 < var7) && (var1 < var8))
			return false;
		else if ((var1 > var6) && (var1 > var7) && (var1 > var8))
			return false;
		else {
			final int var9 = ((var2 - var3) * (var7 - var6)) - ((var1 - var6) * (var4 - var3));
			final int var10 = ((var2 - var5) * (var6 - var8)) - ((var1 - var8) * (var3 - var5));
			final int var11 = ((var2 - var4) * (var8 - var7)) - ((var1 - var7) * (var5 - var4));
			return ((var9 * var11) > 0) && ((var11 * var10) > 0);
		}
	}

	public void method139(final int var1, final int var2, final int var3) {
		final Class124_Sub5 var4 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var4 != null)
			var4.aClass44_972 = null;
	}

	boolean method140(final int var1, final int var2, final int var3, final int var4) {
		if (!method115(var1, var2, var3))
			return false;
		else {
			final int var5 = var2 << 7;
			final int var6 = var3 << 7;
			return method133(var5 + 1, anIntArrayArrayArray237[var1][var2][var3] - var4, var6 + 1)
					&& method133((var5 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var3] - var4, var6 + 1)
					&& method133((var5 + 128) - 1, anIntArrayArrayArray237[var1][var2 + 1][var3 + 1] - var4,
							(var6 + 128) - 1)
					&& method133(var5 + 1, anIntArrayArrayArray237[var1][var2][var3 + 1] - var4, (var6 + 128) - 1);
		}
	}

	public int method141(final int var1, final int var2, final int var3, final int var4) {
		final Class124_Sub5 var5 = aClass124_Sub5ArrayArrayArray225[var1][var2][var3];
		if (var5 == null)
			return -1;
		else if ((var5.aClass30_981 != null) && (var5.aClass30_981.anInt326 == var4))
			return var5.aClass30_981.anInt327 & 255;
		else if ((var5.aClass36_973 != null) && (var5.aClass36_973.anInt385 == var4))
			return var5.aClass36_973.anInt379 & 255;
		else if ((var5.aClass44_972 != null) && (var5.aClass44_972.anInt437 == var4))
			return var5.aClass44_972.anInt435 & 255;
		else {
			for (int var6 = 0; var6 < var5.anInt976; ++var6)
				if (var5.aClass46Array977[var6].anInt463 == var4)
					return var5.aClass46Array977[var6].anInt464 & 255;

			return -1;
		}
	}

	public void method142(final int[] var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		final Class124_Sub5 var7 = aClass124_Sub5ArrayArrayArray225[var4][var5][var6];
		if (var7 != null) {
			final Class28 var8 = var7.aClass28_970;
			int var10;
			if (var8 != null) {
				final int var9 = var8.anInt312;
				if (var9 != 0)
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var9;
						var1[var2 + 1] = var9;
						var1[var2 + 2] = var9;
						var1[var2 + 3] = var9;
						var2 += var3;
					}
			} else {
				final Class33 var12 = var7.aClass33_974;
				if (var12 != null) {
					var10 = var12.anInt355;
					final int var17 = var12.anInt358;
					final int var18 = var12.anInt359;
					final int var13 = var12.anInt360;
					final int[] var14 = anIntArrayArray190[var10];
					final int[] var15 = anIntArrayArray216[var17];
					int var16 = 0;
					int var11;
					if (var18 != 0)
						for (var11 = 0; var11 < 4; ++var11) {
							var1[var2] = var14[var15[var16++]] == 0 ? var18 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var18 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var18 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var18 : var13;
							var2 += var3;
						}
					else
						for (var11 = 0; var11 < 4; ++var11) {
							if (var14[var15[var16++]] != 0)
								var1[var2] = var13;

							if (var14[var15[var16++]] != 0)
								var1[var2 + 1] = var13;

							if (var14[var15[var16++]] != 0)
								var1[var2 + 2] = var13;

							if (var14[var15[var16++]] != 0)
								var1[var2 + 3] = var13;

							var2 += var3;
						}

				}
			}
		}
	}

	public Class21(final int var1, final int var2, final int var3, final int[][][] var4) {
		anInt191 = var1;
		anInt211 = var2;
		anInt236 = var3;
		aClass124_Sub5ArrayArrayArray225 = new Class124_Sub5[var1][var2][var3];
		anIntArrayArrayArray235 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray237 = var4;
		method98();
	}

	void method143(final Class28 var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt209;
		int var22;
		int var13 = var22 = (var8 << 7) - anInt230;
		int var11;
		int var12 = var11 = var10 + 128;
		int var14;
		int var15 = var14 = var13 + 128;
		int var25 = anIntArrayArrayArray237[var2][var7][var8] - anInt198;
		int var29 = anIntArrayArrayArray237[var2][var7 + 1][var8] - anInt198;
		int var28 = anIntArrayArrayArray237[var2][var7 + 1][var8 + 1] - anInt198;
		final int var23 = anIntArrayArrayArray237[var2][var7][var8 + 1] - anInt198;
		int var26 = ((var13 * var5) + (var10 * var6)) >> 16;
		var13 = ((var13 * var6) - (var10 * var5)) >> 16;
		var10 = var26;
		var26 = ((var25 * var4) - (var13 * var3)) >> 16;
		var13 = ((var25 * var3) + (var13 * var4)) >> 16;
		var25 = var26;
		if (var13 >= 50) {
			var26 = ((var22 * var5) + (var12 * var6)) >> 16;
			var22 = ((var22 * var6) - (var12 * var5)) >> 16;
			var12 = var26;
			var26 = ((var29 * var4) - (var22 * var3)) >> 16;
			var22 = ((var29 * var3) + (var22 * var4)) >> 16;
			var29 = var26;
			if (var22 >= 50) {
				var26 = ((var15 * var5) + (var11 * var6)) >> 16;
				var15 = ((var15 * var6) - (var11 * var5)) >> 16;
				var11 = var26;
				var26 = ((var28 * var4) - (var15 * var3)) >> 16;
				var15 = ((var28 * var3) + (var15 * var4)) >> 16;
				var28 = var26;
				if (var15 >= 50) {
					var26 = ((var14 * var5) + (var9 * var6)) >> 16;
					var14 = ((var14 * var6) - (var9 * var5)) >> 16;
					var9 = var26;
					var26 = ((var23 * var4) - (var14 * var3)) >> 16;
					var14 = ((var23 * var3) + (var14 * var4)) >> 16;
					if (var14 >= 50) {
						final int var24 = Class124_Sub22_Sub16_Sub3.anInt1835
								+ ((var10 * Class124_Sub22_Sub16_Sub3.anInt1834) / var13);
						final int var30 = Class124_Sub22_Sub16_Sub3.anInt1836
								+ ((var25 * Class124_Sub22_Sub16_Sub3.anInt1834) / var13);
						final int var21 = Class124_Sub22_Sub16_Sub3.anInt1835
								+ ((var12 * Class124_Sub22_Sub16_Sub3.anInt1834) / var22);
						final int var18 = Class124_Sub22_Sub16_Sub3.anInt1836
								+ ((var29 * Class124_Sub22_Sub16_Sub3.anInt1834) / var22);
						final int var19 = Class124_Sub22_Sub16_Sub3.anInt1835
								+ ((var11 * Class124_Sub22_Sub16_Sub3.anInt1834) / var15);
						final int var16 = Class124_Sub22_Sub16_Sub3.anInt1836
								+ ((var28 * Class124_Sub22_Sub16_Sub3.anInt1834) / var15);
						final int var20 = Class124_Sub22_Sub16_Sub3.anInt1835
								+ ((var9 * Class124_Sub22_Sub16_Sub3.anInt1834) / var14);
						final int var17 = Class124_Sub22_Sub16_Sub3.anInt1836
								+ ((var26 * Class124_Sub22_Sub16_Sub3.anInt1834) / var14);
						Class124_Sub22_Sub16_Sub3.anInt1831 = 0;
						int var27;
						if ((((var19 - var20) * (var18 - var17)) - ((var16 - var17) * (var21 - var20))) > 0) {
							Class124_Sub22_Sub16_Sub3.aBool1842 = false;
							if ((var19 < 0) || (var20 < 0) || (var21 < 0)
									|| (var19 > Class124_Sub22_Sub16_Sub3.anInt1837)
									|| (var20 > Class124_Sub22_Sub16_Sub3.anInt1837)
									|| (var21 > Class124_Sub22_Sub16_Sub3.anInt1837))
								Class124_Sub22_Sub16_Sub3.aBool1842 = true;

							if (aBool217 && method138(anInt219, anInt220, var16, var17, var18, var19, var20, var21)) {
								anInt214 = var7;
								anInt222 = var8;
							}

							if (var1.anInt306 == -1) {
								if (var1.anInt308 != 12345678)
									Class124_Sub22_Sub16_Sub3.method982(var16, var17, var18, var19, var20, var21,
											var1.anInt308, var1.anInt309, var1.anInt310);
							} else if (!aBool192) {
								if (var1.aBool307)
									Class124_Sub22_Sub16_Sub3.method969(var16, var17, var18, var19, var20, var21,
											var1.anInt308, var1.anInt309, var1.anInt310, var10, var12, var9, var25,
											var29, var26, var13, var22, var14, var1.anInt306);
								else
									Class124_Sub22_Sub16_Sub3.method969(var16, var17, var18, var19, var20, var21,
											var1.anInt308, var1.anInt309, var1.anInt310, var11, var9, var12, var28,
											var26, var29, var15, var14, var22, var1.anInt306);
							} else {
								var27 = Class124_Sub22_Sub16_Sub3.anInterface2_1828.method10(var1.anInt306,
										-2100373276);
								Class124_Sub22_Sub16_Sub3.method982(var16, var17, var18, var19, var20, var21,
										method97(var27, var1.anInt308), method97(var27, var1.anInt309),
										method97(var27, var1.anInt310));
							}
						}

						if ((((var24 - var21) * (var17 - var18)) - ((var30 - var18) * (var20 - var21))) > 0) {
							Class124_Sub22_Sub16_Sub3.aBool1842 = false;
							if ((var24 < 0) || (var21 < 0) || (var20 < 0)
									|| (var24 > Class124_Sub22_Sub16_Sub3.anInt1837)
									|| (var21 > Class124_Sub22_Sub16_Sub3.anInt1837)
									|| (var20 > Class124_Sub22_Sub16_Sub3.anInt1837))
								Class124_Sub22_Sub16_Sub3.aBool1842 = true;

							if (aBool217 && method138(anInt219, anInt220, var30, var18, var17, var24, var21, var20)) {
								anInt214 = var7;
								anInt222 = var8;
							}

							if (var1.anInt306 == -1) {
								if (var1.anInt313 != 12345678)
									Class124_Sub22_Sub16_Sub3.method982(var30, var18, var17, var24, var21, var20,
											var1.anInt313, var1.anInt310, var1.anInt309);
							} else if (!aBool192)
								Class124_Sub22_Sub16_Sub3.method969(var30, var18, var17, var24, var21, var20,
										var1.anInt313, var1.anInt310, var1.anInt309, var10, var12, var9, var25, var29,
										var26, var13, var22, var14, var1.anInt306);
							else {
								var27 = Class124_Sub22_Sub16_Sub3.anInterface2_1828.method10(var1.anInt306, -163182500);
								Class124_Sub22_Sub16_Sub3.method982(var30, var18, var17, var24, var21, var20,
										method97(var27, var1.anInt313), method97(var27, var1.anInt310),
										method97(var27, var1.anInt309));
							}
						}

					}
				}
			}
		}
	}

	public boolean method144(final int var1, final int var2, final int var3, final int var4, final int var5,
			final Class124_Sub22_Sub19 var6, final int var7, final int var8, final boolean var9) {
		if (var6 == null)
			return true;
		else {
			int var10 = var2 - var5;
			int var11 = var3 - var5;
			int var12 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if ((var7 > 640) && (var7 < 1408))
					var13 += 128;

				if ((var7 > 1152) && (var7 < 1920))
					var12 += 128;

				if ((var7 > 1664) || (var7 < 384))
					var11 -= 128;

				if ((var7 > 128) && (var7 < 896))
					var10 -= 128;
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return method119(var1, var10, var11, (var12 - var10) + 1, (var13 - var11) + 1, var2, var3, var4, var6, var7,
					true, var8, 0);
		}
	}

	static boolean method145(final int var0, final int var1, final int var2) {
		final int var3 = ((var2 * anInt205) + (var0 * anInt215)) >> 16;
		final int var6 = ((var2 * anInt215) - (var0 * anInt205)) >> 16;
		final int var4 = ((var1 * anInt212) + (var6 * anInt213)) >> 16;
		final int var7 = ((var1 * anInt213) - (var6 * anInt212)) >> 16;
		if ((var4 >= 50) && (var4 <= 3500)) {
			final int var5 = anInt240 + ((var3 * Class124_Sub22_Sub16_Sub3.anInt1834) / var4);
			final int var8 = anInt201 + ((var7 * Class124_Sub22_Sub16_Sub3.anInt1834) / var4);
			return (var5 >= anInt242) && (var5 <= anInt244) && (var8 >= anInt243) && (var8 <= anInt245);
		} else
			return false;
	}

	public void method146() {
		for (int var1 = 0; var1 < anInt197; ++var1) {
			final Class46 var2 = aClass46Array195[var1];
			method122(var2);
			aClass46Array195[var1] = null;
		}

		anInt197 = 0;
	}
}
