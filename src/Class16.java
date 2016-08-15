public class Class16 {
	int anInt144;
	int anInt145;
	int[][] anIntArrayArray146;

	byte[] method78(byte[] var1) {
		if (anIntArrayArray146 != null) {
			final int var9 = 14 + (int) (((long) anInt145 * (long) var1.length) / anInt144);
			final int[] var3 = new int[var9];
			int var5 = 0;
			int var2 = 0;

			int var8;
			for (var8 = 0; var8 < var1.length; ++var8) {
				final byte var6 = var1[var8];
				final int[] var7 = anIntArrayArray146[var2];

				int var4;
				for (var4 = 0; var4 < 14; ++var4)
					var3[var4 + var5] += var6 * var7[var4];

				var2 += anInt145;
				var4 = var2 / anInt144;
				var5 += var4;
				var2 -= anInt144 * var4;
			}

			var1 = new byte[var9];

			for (var8 = 0; var8 < var9; ++var8) {
				final int var10 = (var3[var8] + '\u8000') >> 16;
				if (var10 < -128)
					var1[var8] = -128;
				else if (var10 > 127)
					var1[var8] = 127;
				else
					var1[var8] = (byte) var10;
			}
		}

		return var1;
	}

	public Class16(int var1, int var2) {
		if (var1 != var2) {
			final int var8 = Class124_Sub22_Sub6.method688(var1, var2);
			var1 /= var8;
			var2 /= var8;
			anInt144 = var1;
			anInt145 = var2;
			anIntArrayArray146 = new int[var1][14];

			for (int var3 = 0; var3 < var1; ++var3) {
				final int[] var4 = anIntArrayArray146[var3];
				final double var11 = 6.0D + ((double) var3 / (double) var1);
				int var5 = (int) Math.floor((var11 - 7.0D) + 1.0D);
				if (var5 < 0)
					var5 = 0;

				int var15 = (int) Math.ceil(var11 + 7.0D);
				if (var15 > 14)
					var15 = 14;

				for (final double var9 = (double) var2 / (double) var1; var5 < var15; ++var5) {
					final double var13 = 3.141592653589793D * (var5 - var11);
					double var6 = var9;
					if ((var13 < -1.0E-4D) || (var13 > 1.0E-4D))
						var6 = var9 * (Math.sin(var13) / var13);

					var6 *= 0.54D + (0.46D * Math.cos(0.2243994752564138D * (var5 - var11)));
					var4[var5] = (int) Math.floor((65536.0D * var6) + 0.5D);
				}
			}

		}
	}

	int method79(int var1) {
		if (anIntArrayArray146 != null)
			var1 = (int) (((long) anInt145 * (long) var1) / anInt144);

		return var1;
	}

	int method80(int var1) {
		if (anIntArrayArray146 != null)
			var1 = (int) (((long) anInt145 * (long) var1) / anInt144) + 6;

		return var1;
	}
}
