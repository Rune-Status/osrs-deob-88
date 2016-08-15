public class Class63 {
	int[] anIntArray556;
	byte[] aByteArray555;
	int[] anIntArray554;

	public Class63(final byte[] var1) {
		final int var4 = var1.length;
		anIntArray556 = new int[var4];
		aByteArray555 = var1;
		final int[] var5 = new int[33];
		anIntArray554 = new int[8];
		int var8 = 0;

		for (int var7 = 0; var7 < var4; ++var7) {
			final byte var2 = var1[var7];
			if (var2 != 0) {
				final int var12 = 1 << (32 - var2);
				final int var9 = var5[var2];
				anIntArray556[var7] = var9;
				int var3;
				int var6;
				int var10;
				int var11;
				if ((var9 & var12) != 0)
					var6 = var5[var2 - 1];
				else {
					var6 = var9 | var12;

					for (var3 = var2 - 1; var3 >= 1; --var3) {
						var10 = var5[var3];
						if (var9 != var10)
							break;

						var11 = 1 << (32 - var3);
						if ((var10 & var11) != 0) {
							var5[var3] = var5[var3 - 1];
							break;
						}

						var5[var3] = var10 | var11;
					}
				}

				var5[var2] = var6;

				for (var3 = var2 + 1; var3 <= 32; ++var3)
					if (var5[var3] == var9)
						var5[var3] = var6;

				var3 = 0;

				for (var10 = 0; var10 < var2; ++var10) {
					var11 = Integer.MIN_VALUE >>> var10;
					if ((var9 & var11) != 0) {
						if (anIntArray554[var3] == 0)
							anIntArray554[var3] = var8;

						var3 = anIntArray554[var3];
					} else
						++var3;

					if (var3 >= anIntArray554.length) {
						final int[] var13 = new int[2 * anIntArray554.length];

						for (int var14 = 0; var14 < anIntArray554.length; ++var14)
							var13[var14] = anIntArray554[var14];

						anIntArray554 = var13;
					}

					var11 >>>= 1;
				}

				anIntArray554[var3] = ~var7;
				if (var3 >= var8)
					var8 = var3 + 1;
			}
		}

	}

	public int method282(final byte[] var1, final int var2, final byte[] var3, int var4, int var5) {
		if (var5 == 0)
			return 0;
		else {
			int var6 = 0;
			var5 += var4;
			int var8 = var2;

			while (true) {
				final byte var9 = var1[var8];
				if (var9 < 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				int var7;
				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 64) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 32) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 16) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 8) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 4) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 2) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				if ((var9 & 1) != 0)
					var6 = anIntArray554[var6];
				else
					++var6;

				if ((var7 = anIntArray554[var6]) < 0) {
					var3[var4++] = (byte) (~var7);
					if (var4 >= var5)
						break;

					var6 = 0;
				}

				++var8;
			}

			return (1 + var8) - var2;
		}
	}

	static Class23 method283() {
		return Class23.anInt258 < Class23.anInt257 ? Class23.aClass23Array256[++Class23.anInt258 - 1] : null;
	}

	public int method284(final byte[] var1, int var2, int var3, final byte[] var4, final int var5) {
		int var6 = 0;
		int var12 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			final int var10 = var1[var2] & 255;
			final int var8 = anIntArray556[var10];
			final byte var13 = aByteArray555[var10];
			if (var13 == 0)
				throw new RuntimeException("");

			int var7 = var12 >> 3;
			int var9 = var12 & 7;
			var6 &= -var9 >> 31;
			final int var11 = (((var9 + var13) - 1) >> 3) + var7;
			var9 += 24;
			var4[var7] = (byte) (var6 |= var8 >>> var9);
			if (var7 < var11) {
				++var7;
				var9 -= 8;
				var4[var7] = (byte) (var6 = var8 >>> var9);
				if (var7 < var11) {
					++var7;
					var9 -= 8;
					var4[var7] = (byte) (var6 = var8 >>> var9);
					if (var7 < var11) {
						++var7;
						var9 -= 8;
						var4[var7] = (byte) (var6 = var8 >>> var9);
						if (var7 < var11) {
							++var7;
							var9 -= 8;
							var4[var7] = (byte) (var6 = var8 << -var9);
						}
					}
				}
			}

			var12 += var13;
		}

		return ((7 + var12) >> 3) - var5;
	}

	static final int method285(final int var0, final int var1, final int var2) {
		final int var3 = var0 >> 7;
		final int var8 = var1 >> 7;
		if ((var3 >= 0) && (var8 >= 0) && (var3 <= 103) && (var8 <= 103)) {
			int var7 = var2;
			if ((var2 < 3) && ((Class27.aByteArrayArrayArray285[1][var3][var8] & 2) == 2))
				var7 = var2 + 1;

			final int var9 = var0 & 127;
			final int var5 = var1 & 127;
			final int var4 = ((var9 * Class27.anIntArrayArrayArray284[var7][var3 + 1][var8])
					+ (Class27.anIntArrayArrayArray284[var7][var3][var8] * (128 - var9))) >> 7;
			final int var6 = ((Class27.anIntArrayArrayArray284[var7][var3][1 + var8] * (128 - var9))
					+ (var9 * Class27.anIntArrayArrayArray284[var7][var3 + 1][var8 + 1])) >> 7;
			return ((var4 * (128 - var5)) + (var5 * var6)) >> 7;
		} else
			return 0;
	}
}
