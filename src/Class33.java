public final class Class33 {
	static int[] anIntArray361 = new int[6];
	static int[] anIntArray357 = new int[6];
	static int[] anIntArray351 = new int[6];
	static int[] anIntArray364 = new int[6];
	static int[] anIntArray365 = new int[6];
	static int[][] anIntArrayArray366 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
			{ 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 },
			{ 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	static int[][] anIntArrayArray367 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
			{ 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
			{ 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
			{ 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
			{ 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
			{ 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 },
			{ 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 },
			{ 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	boolean aBool356 = true;
	int anInt355;
	int anInt358;
	int anInt359;
	int anInt360;
	int[] anIntArray350;
	int[] anIntArray347;
	int[] anIntArray348;
	int[] anIntArray363;
	int[] anIntArray346;
	int[] anIntArray354;
	int[] anIntArray349;
	int[] anIntArray352;
	int[] anIntArray362;
	int[] anIntArray353;

	Class33(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12,
			final int var13, final int var14, final int var15, final int var16, final int var17, final int var18,
			final int var19) {
		if ((var6 != var7) || (var6 != var8) || (var6 != var9))
			aBool356 = false;

		anInt355 = var1;
		anInt358 = var2;
		anInt359 = var18;
		anInt360 = var19;
		final short var23 = 128;
		final int var26 = var23 / 2;
		final int var36 = var23 / 4;
		final int var35 = (var23 * 3) / 4;
		final int[] var27 = anIntArrayArray366[var1];
		final int var25 = var27.length;
		anIntArray350 = new int[var25];
		anIntArray347 = new int[var25];
		anIntArray348 = new int[var25];
		final int[] var30 = new int[var25];
		final int[] var31 = new int[var25];
		final int var32 = var4 * var23;
		final int var22 = var5 * var23;

		int var20;
		int var21;
		int var24;
		int var29;
		int var33;
		int var34;
		for (int var28 = 0; var28 < var25; ++var28) {
			var21 = var27[var28];
			if (((var21 & 1) == 0) && (var21 <= 8))
				var21 = ((var21 - var2 - var2 - 1) & 7) + 1;

			if ((var21 > 8) && (var21 <= 12))
				var21 = ((var21 - 9 - var2) & 3) + 9;

			if ((var21 > 12) && (var21 <= 16))
				var21 = ((var21 - 13 - var2) & 3) + 13;

			if (var21 == 1) {
				var34 = var32;
				var24 = var22;
				var29 = var6;
				var20 = var10;
				var33 = var14;
			} else if (var21 == 2) {
				var34 = var32 + var26;
				var24 = var22;
				var29 = (var6 + var7) >> 1;
				var20 = (var10 + var11) >> 1;
				var33 = (var14 + var15) >> 1;
			} else if (var21 == 3) {
				var34 = var32 + var23;
				var24 = var22;
				var29 = var7;
				var20 = var11;
				var33 = var15;
			} else if (var21 == 4) {
				var34 = var32 + var23;
				var24 = var22 + var26;
				var29 = (var7 + var8) >> 1;
				var20 = (var11 + var12) >> 1;
				var33 = (var15 + var16) >> 1;
			} else if (var21 == 5) {
				var34 = var32 + var23;
				var24 = var22 + var23;
				var29 = var8;
				var20 = var12;
				var33 = var16;
			} else if (var21 == 6) {
				var34 = var32 + var26;
				var24 = var22 + var23;
				var29 = (var8 + var9) >> 1;
				var20 = (var12 + var13) >> 1;
				var33 = (var16 + var17) >> 1;
			} else if (var21 == 7) {
				var34 = var32;
				var24 = var22 + var23;
				var29 = var9;
				var20 = var13;
				var33 = var17;
			} else if (var21 == 8) {
				var34 = var32;
				var24 = var22 + var26;
				var29 = (var9 + var6) >> 1;
				var20 = (var13 + var10) >> 1;
				var33 = (var17 + var14) >> 1;
			} else if (var21 == 9) {
				var34 = var32 + var26;
				var24 = var22 + var36;
				var29 = (var6 + var7) >> 1;
				var20 = (var10 + var11) >> 1;
				var33 = (var14 + var15) >> 1;
			} else if (var21 == 10) {
				var34 = var32 + var35;
				var24 = var22 + var26;
				var29 = (var7 + var8) >> 1;
				var20 = (var11 + var12) >> 1;
				var33 = (var15 + var16) >> 1;
			} else if (var21 == 11) {
				var34 = var32 + var26;
				var24 = var22 + var35;
				var29 = (var8 + var9) >> 1;
				var20 = (var12 + var13) >> 1;
				var33 = (var16 + var17) >> 1;
			} else if (var21 == 12) {
				var34 = var32 + var36;
				var24 = var22 + var26;
				var29 = (var9 + var6) >> 1;
				var20 = (var13 + var10) >> 1;
				var33 = (var17 + var14) >> 1;
			} else if (var21 == 13) {
				var34 = var32 + var36;
				var24 = var22 + var36;
				var29 = var6;
				var20 = var10;
				var33 = var14;
			} else if (var21 == 14) {
				var34 = var32 + var35;
				var24 = var22 + var36;
				var29 = var7;
				var20 = var11;
				var33 = var15;
			} else if (var21 == 15) {
				var34 = var32 + var35;
				var24 = var22 + var35;
				var29 = var8;
				var20 = var12;
				var33 = var16;
			} else {
				var34 = var32 + var36;
				var24 = var22 + var35;
				var29 = var9;
				var20 = var13;
				var33 = var17;
			}

			anIntArray350[var28] = var34;
			anIntArray347[var28] = var29;
			anIntArray348[var28] = var24;
			var30[var28] = var20;
			var31[var28] = var33;
		}

		final int[] var38 = anIntArrayArray367[var1];
		var21 = var38.length / 4;
		anIntArray363 = new int[var21];
		anIntArray346 = new int[var21];
		anIntArray354 = new int[var21];
		anIntArray349 = new int[var21];
		anIntArray352 = new int[var21];
		anIntArray362 = new int[var21];
		if (var3 != -1)
			anIntArray353 = new int[var21];

		var34 = 0;

		for (var24 = 0; var24 < var21; ++var24) {
			var29 = var38[var34];
			var20 = var38[var34 + 1];
			var33 = var38[var34 + 2];
			int var37 = var38[var34 + 3];
			var34 += 4;
			if (var20 < 4)
				var20 = (var20 - var2) & 3;

			if (var33 < 4)
				var33 = (var33 - var2) & 3;

			if (var37 < 4)
				var37 = (var37 - var2) & 3;

			anIntArray363[var24] = var20;
			anIntArray346[var24] = var33;
			anIntArray354[var24] = var37;
			if (var29 == 0) {
				anIntArray349[var24] = var30[var20];
				anIntArray352[var24] = var30[var33];
				anIntArray362[var24] = var30[var37];
				if (anIntArray353 != null)
					anIntArray353[var24] = -1;
			} else {
				anIntArray349[var24] = var31[var20];
				anIntArray352[var24] = var31[var33];
				anIntArray362[var24] = var31[var37];
				if (anIntArray353 != null)
					anIntArray353[var24] = var3;
			}
		}

		var24 = var6;
		var29 = var7;
		if (var7 < var6)
			var24 = var7;

		if (var7 > var7)
			var29 = var7;

		if (var8 < var24)
			var24 = var8;

		if (var8 > var29)
			var29 = var8;

		if (var9 < var24)
			var24 = var9;

		if (var9 > var29)
			var29 = var9;

		var24 /= 14;
		var29 /= 14;
	}
}
