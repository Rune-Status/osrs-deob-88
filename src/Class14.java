public class Class14 {
	int anInt132 = Class124_Sub3.method502(16);
	int anInt129 = Class124_Sub3.method502(24);
	int anInt131 = Class124_Sub3.method502(24);
	int anInt130 = Class124_Sub3.method502(24) + 1;
	int anInt133 = Class124_Sub3.method502(6) + 1;
	int anInt134 = Class124_Sub3.method502(8);
	int[] anIntArray135;

	void method72(final float[] var1, final int var2, final boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4)
			var1[var4] = 0.0F;

		if (!var3) {
			var4 = Class124_Sub3.aClass6Array937[anInt134].anInt62;
			final int var10 = anInt131 - anInt129;
			final int var11 = var10 / anInt130;
			final int[] var14 = new int[var11];

			for (int var16 = 0; var16 < 8; ++var16) {
				int var13 = 0;

				while (var13 < var11) {
					int var15;
					int var17;
					if (var16 == 0) {
						var15 = Class124_Sub3.aClass6Array937[anInt134].method30();

						for (var17 = var4 - 1; var17 >= 0; --var17) {
							if ((var13 + var17) < var11)
								var14[var13 + var17] = var15 % anInt133;

							var15 /= anInt133;
						}
					}

					for (var15 = 0; var15 < var4; ++var15) {
						var17 = var14[var13];
						final int var18 = anIntArray135[(var17 * 8) + var16];
						if (var18 >= 0) {
							final int var7 = anInt129 + (var13 * anInt130);
							final Class6 var6 = Class124_Sub3.aClass6Array937[var18];
							int var8;
							if (anInt132 == 0) {
								var8 = anInt130 / var6.anInt62;

								for (int var12 = 0; var12 < var8; ++var12) {
									final float[] var19 = var6.method31();

									for (int var20 = 0; var20 < var6.anInt62; ++var20)
										var1[var7 + var12 + (var20 * var8)] += var19[var20];
								}
							} else {
								var8 = 0;

								while (var8 < anInt130) {
									final float[] var9 = var6.method31();

									for (int var5 = 0; var5 < var6.anInt62; ++var5) {
										var1[var7 + var8] += var9[var5];
										++var8;
									}
								}
							}
						}

						++var13;
						if (var13 >= var11)
							break;
					}
				}
			}

		}
	}

	Class14() {
		final int[] var4 = new int[anInt133];

		int var1;
		for (var1 = 0; var1 < anInt133; ++var1) {
			int var2 = 0;
			final int var3 = Class124_Sub3.method502(3);
			final boolean var5 = Class124_Sub3.method496() != 0;
			if (var5)
				var2 = Class124_Sub3.method502(5);

			var4[var1] = (var2 << 3) | var3;
		}

		anIntArray135 = new int[anInt133 * 8];

		for (var1 = 0; var1 < (anInt133 * 8); ++var1)
			anIntArray135[var1] = (var4[var1 >> 3] & (1 << (var1 & 7))) != 0 ? Class124_Sub3.method502(8) : -1;

	}
}
