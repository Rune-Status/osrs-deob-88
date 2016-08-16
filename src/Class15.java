public class Class15 {
	static float aFloat142;
	static int anInt140;
	static float[][] aFloatArrayArray136 = new float[2][8];
	static int[][] anIntArrayArray141 = new int[2][8];
	int[] anIntArray139 = new int[2];
	int[][][] anIntArrayArrayArray137 = new int[2][2][4];
	int[][][] anIntArrayArrayArray138 = new int[2][2][4];
	int[] anIntArray143 = new int[2];

	static float method73(final float var0) {
		final float var1 = 32.703197F * (float) Math.pow(2.0D, var0);
		return (var1 * 3.1415927F) / 11025.0F;
	}

	float method74(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray138[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray138[var1][1][var2] - anIntArrayArrayArray138[var1][0][var2]));
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	int method75(final int var1, final float var2) {
		float var3;
		if (var1 == 0) {
			var3 = anIntArray143[0] + ((anIntArray143[1] - anIntArray143[0]) * var2);
			var3 *= 0.0030517578F;
			aFloat142 = (float) Math.pow(0.1D, var3 / 20.0F);
			anInt140 = (int) (aFloat142 * 65536.0F);
		}

		if (anIntArray139[var1] == 0)
			return 0;
		else {
			var3 = method74(var1, 0, var2);
			aFloatArrayArray136[var1][0] = -2.0F * var3 * (float) Math.cos(method77(var1, 0, var2));
			aFloatArrayArray136[var1][1] = var3 * var3;

			int var4;
			for (var4 = 1; var4 < anIntArray139[var1]; ++var4) {
				var3 = method74(var1, var4, var2);
				final float var6 = -2.0F * var3 * (float) Math.cos(method77(var1, var4, var2));
				final float var5 = var3 * var3;
				aFloatArrayArray136[var1][(var4 * 2) + 1] = aFloatArrayArray136[var1][(var4 * 2) - 1] * var5;
				aFloatArrayArray136[var1][var4 * 2] = (aFloatArrayArray136[var1][(var4 * 2) - 1] * var6)
						+ (aFloatArrayArray136[var1][(var4 * 2) - 2] * var5);

				for (int var7 = (var4 * 2) - 1; var7 >= 2; --var7)
					aFloatArrayArray136[var1][var7] += (aFloatArrayArray136[var1][var7 - 1] * var6)
							+ (aFloatArrayArray136[var1][var7 - 2] * var5);

				aFloatArrayArray136[var1][1] += (aFloatArrayArray136[var1][0] * var6) + var5;
				aFloatArrayArray136[var1][0] += var6;
			}

			if (var1 == 0)
				for (var4 = 0; var4 < (anIntArray139[0] * 2); ++var4)
					aFloatArrayArray136[0][var4] *= aFloat142;

			for (var4 = 0; var4 < (anIntArray139[var1] * 2); ++var4)
				anIntArrayArray141[var1][var4] = (int) (aFloatArrayArray136[var1][var4] * 65536.0F);

			return anIntArray139[var1] * 2;
		}
	}

	final void method76(final RSBuf var1, final Class17 var2) {
		final int var3 = var1.readByteU();
		anIntArray139[0] = var3 >> 4;
		anIntArray139[1] = var3 & 15;
		if (var3 != 0) {
			anIntArray143[0] = var1.readShortU();
			anIntArray143[1] = var1.readShortU();
			final int var5 = var1.readByteU();

			int var4;
			int var6;
			for (var4 = 0; var4 < 2; ++var4)
				for (var6 = 0; var6 < anIntArray139[var4]; ++var6) {
					anIntArrayArrayArray137[var4][0][var6] = var1.readShortU();
					anIntArrayArrayArray138[var4][0][var6] = var1.readShortU();
				}

			for (var4 = 0; var4 < 2; ++var4)
				for (var6 = 0; var6 < anIntArray139[var4]; ++var6)
					if ((var5 & (1 << (var4 * 4) << var6)) != 0) {
						anIntArrayArrayArray137[var4][1][var6] = var1.readShortU();
						anIntArrayArrayArray138[var4][1][var6] = var1.readShortU();
					} else {
						anIntArrayArrayArray137[var4][1][var6] = anIntArrayArrayArray137[var4][0][var6];
						anIntArrayArrayArray138[var4][1][var6] = anIntArrayArrayArray138[var4][0][var6];
					}

			if ((var5 != 0) || (anIntArray143[1] != anIntArray143[0]))
				var2.method82(var1);
		} else {
			final int[] var7 = anIntArray143;
			anIntArray143[1] = 0;
			var7[0] = 0;
		}

	}

	float method77(final int var1, final int var2, final float var3) {
		float var4 = anIntArrayArrayArray137[var1][0][var2]
				+ (var3 * (anIntArrayArrayArray137[var1][1][var2] - anIntArrayArrayArray137[var1][0][var2]));
		var4 *= 1.2207031E-4F;
		return method73(var4);
	}
}
