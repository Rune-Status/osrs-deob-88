public class Class6 {
	int anInt62;
	int anInt61;
	int[] anIntArray64;
	int[] anIntArray63;
	float[][] aFloatArrayArray60;
	int[] anIntArray65;

	Class6() {
		client.method502(24);
		anInt62 = client.method502(16);
		anInt61 = client.method502(24);
		anIntArray64 = new int[anInt61];
		final boolean var2 = client.method496() != 0;
		int var3;
		int var4;
		int var7;
		if (var2) {
			var3 = 0;

			for (var4 = client.method502(5) + 1; var3 < anInt61; ++var4) {
				final int var5 = client.method502(Def10.method714(anInt61 - var3));

				for (var7 = 0; var7 < var5; ++var7)
					anIntArray64[var3++] = var4;
			}
		} else {
			final boolean var14 = client.method496() != 0;

			for (var4 = 0; var4 < anInt61; ++var4)
				if (var14 && (client.method496() == 0))
					anIntArray64[var4] = 0;
				else
					anIntArray64[var4] = client.method502(5) + 1;
		}

		method29();
		var3 = client.method502(4);
		if (var3 > 0) {
			final float var15 = client.method501(client.method502(32));
			final float var16 = client.method501(client.method502(32));
			var7 = client.method502(4) + 1;
			final boolean var11 = client.method496() != 0;
			int var10;
			if (var3 == 1)
				var10 = method32(anInt61, anInt62);
			else
				var10 = anInt61 * anInt62;

			anIntArray63 = new int[var10];

			int var8;
			for (var8 = 0; var8 < var10; ++var8)
				anIntArray63[var8] = client.method502(var7);

			aFloatArrayArray60 = new float[anInt61][anInt62];
			int var1;
			int var6;
			float var9;
			if (var3 == 1)
				for (var8 = 0; var8 < anInt61; ++var8) {
					var9 = 0.0F;
					var1 = 1;

					for (var6 = 0; var6 < anInt62; ++var6) {
						final int var12 = (var8 / var1) % var10;
						final float var13 = (anIntArray63[var12] * var16) + var15 + var9;
						aFloatArrayArray60[var8][var6] = var13;
						if (var11)
							var9 = var13;

						var1 *= var10;
					}
				}
			else
				for (var8 = 0; var8 < anInt61; ++var8) {
					var9 = 0.0F;
					var1 = var8 * anInt62;

					for (var6 = 0; var6 < anInt62; ++var6) {
						final float var17 = (anIntArray63[var1] * var16) + var15 + var9;
						aFloatArrayArray60[var8][var6] = var17;
						if (var11)
							var9 = var17;

						++var1;
					}
				}
		}

	}

	void method29() {
		final int[] var1 = new int[anInt61];
		final int[] var6 = new int[33];

		int var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var9;
		int var11;
		for (var4 = 0; var4 < anInt61; ++var4) {
			var5 = anIntArray64[var4];
			if (var5 != 0) {
				var3 = 1 << (32 - var5);
				var2 = var6[var5];
				var1[var4] = var2;
				int var10;
				if ((var2 & var3) != 0)
					var7 = var6[var5 - 1];
				else {
					var7 = var2 | var3;

					for (var9 = var5 - 1; var9 >= 1; --var9) {
						var10 = var6[var9];
						if (var10 != var2)
							break;

						var11 = 1 << (32 - var9);
						if ((var10 & var11) != 0) {
							var6[var9] = var6[var9 - 1];
							break;
						}

						var6[var9] = var10 | var11;
					}
				}

				var6[var5] = var7;

				for (var9 = var5 + 1; var9 <= 32; ++var9) {
					var10 = var6[var9];
					if (var10 == var2)
						var6[var9] = var7;
				}
			}
		}

		anIntArray65 = new int[8];
		int var12 = 0;

		for (var4 = 0; var4 < anInt61; ++var4) {
			var5 = anIntArray64[var4];
			if (var5 != 0) {
				var3 = var1[var4];
				var2 = 0;

				for (var7 = 0; var7 < var5; ++var7) {
					var9 = Integer.MIN_VALUE >>> var7;
					if ((var3 & var9) != 0) {
						if (anIntArray65[var2] == 0)
							anIntArray65[var2] = var12;

						var2 = anIntArray65[var2];
					} else
						++var2;

					if (var2 >= anIntArray65.length) {
						final int[] var8 = new int[anIntArray65.length * 2];

						for (var11 = 0; var11 < anIntArray65.length; ++var11)
							var8[var11] = anIntArray65[var11];

						anIntArray65 = var8;
					}

					var9 >>>= 1;
				}

				anIntArray65[var2] = ~var4;
				if (var2 >= var12)
					var12 = var2 + 1;
			}
		}

	}

	int method30() {
		int var1;
		for (var1 = 0; anIntArray65[var1] >= 0; var1 = client.method496() != 0 ? anIntArray65[var1] : var1 + 1)
			;

		return ~anIntArray65[var1];
	}

	float[] method31() {
		return aFloatArrayArray60[method30()];
	}

	static int method32(final int var0, final int var1) {
		int var2;
		for (var2 = (int) Math.pow(var0, 1.0D / var1) + 1; CSD.method519(var2, var1) > var0; --var2)
			;

		return var2;
	}
}
