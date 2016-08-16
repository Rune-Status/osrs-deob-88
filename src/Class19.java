import java.util.Random;

public class Class19 {
	int[] anIntArray167 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray171 = new int[] { 0, 0, 0, 0, 0 };
	int[] anIntArray172 = new int[] { 0, 0, 0, 0, 0 };
	int anInt180 = 0;
	int anInt174 = 100;
	int anInt166 = 500;
	int anInt178 = 0;
	static int[] anIntArray173 = new int['\u8000'];
	static int[] anIntArray181;
	static int[] anIntArray179;
	static int[] anIntArray177;
	static int[] anIntArray183;
	static int[] anIntArray184;
	static int[] anIntArray185;
	static int[] anIntArray186;
	Class17 aClass17_182;
	Class17 aClass17_163;
	Class17 aClass17_164;
	Class17 aClass17_165;
	Class17 aClass17_176;
	Class17 aClass17_170;
	Class17 aClass17_168;
	Class17 aClass17_169;
	Class15 aClass15_175;
	Class17 aClass17_162;

	final int method90(final int var1, final int var2, final int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2)
				: (var3 != 2
						? (var3 == 3 ? (((var1 & 32767) * var2) >> 14) - var2
								: (var3 == 4 ? anIntArray173[(var1 / 2607) & 32767] * var2 : 0))
						: (anIntArray181[var1 & 32767] * var2) >> 14);
	}

	final int[] method91(final int var1, final int var2) {
		Class59.method271(anIntArray179, 0, var1);
		if (var2 < 10)
			return anIntArray179;
		else {
			final double var5 = var1 / (var2 + 0.0D);
			aClass17_182.method83();
			aClass17_163.method83();
			int var10 = 0;
			int var18 = 0;
			int var9 = 0;
			if (aClass17_164 != null) {
				aClass17_164.method83();
				aClass17_165.method83();
				var10 = (int) (((aClass17_164.anInt151 - aClass17_164.anInt150) * 32.768D) / var5);
				var18 = (int) ((aClass17_164.anInt150 * 32.768D) / var5);
			}

			int var12 = 0;
			int var13 = 0;
			int var14 = 0;
			if (aClass17_176 != null) {
				aClass17_176.method83();
				aClass17_170.method83();
				var12 = (int) (((aClass17_176.anInt151 - aClass17_176.anInt150) * 32.768D) / var5);
				var13 = (int) ((aClass17_176.anInt150 * 32.768D) / var5);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11)
				if (anIntArray167[var11] != 0) {
					anIntArray177[var11] = 0;
					anIntArray183[var11] = (int) (anIntArray172[var11] * var5);
					anIntArray184[var11] = (anIntArray167[var11] << 14) / 100;
					anIntArray185[var11] = (int) (((aClass17_182.anInt151 - aClass17_182.anInt150) * 32.768D
							* Math.pow(1.0057929410678534D, anIntArray171[var11])) / var5);
					anIntArray186[var11] = (int) ((aClass17_182.anInt150 * 32.768D) / var5);
				}

			int var4;
			int var7;
			int var16;
			int var17;
			for (var11 = 0; var11 < var1; ++var11) {
				var4 = aClass17_182.method84(var1);
				var16 = aClass17_163.method84(var1);
				if (aClass17_164 != null) {
					var7 = aClass17_164.method84(var1);
					var17 = aClass17_165.method84(var1);
					var4 += method90(var9, var17, aClass17_164.anInt152) >> 1;
					var9 += ((var7 * var10) >> 16) + var18;
				}

				if (aClass17_176 != null) {
					var7 = aClass17_176.method84(var1);
					var17 = aClass17_170.method84(var1);
					var16 = (var16 * ((method90(var14, var17, aClass17_176.anInt152) >> 1) + '\u8000')) >> 15;
					var14 += ((var7 * var12) >> 16) + var13;
				}

				for (var7 = 0; var7 < 5; ++var7)
					if (anIntArray167[var7] != 0) {
						var17 = var11 + anIntArray183[var7];
						if (var17 < var1) {
							anIntArray179[var17] += method90(anIntArray177[var7], (var16 * anIntArray184[var7]) >> 15,
									aClass17_182.anInt152);
							anIntArray177[var7] += ((var4 * anIntArray185[var7]) >> 16) + anIntArray186[var7];
						}
					}
			}

			int var15;
			if (aClass17_168 != null) {
				aClass17_168.method83();
				aClass17_169.method83();
				var11 = 0;
				boolean var20 = true;

				for (var7 = 0; var7 < var1; ++var7) {
					var17 = aClass17_168.method84(var1);
					var15 = aClass17_169.method84(var1);
					if (var20)
						var4 = aClass17_168.anInt150 + (((aClass17_168.anInt151 - aClass17_168.anInt150) * var17) >> 8);
					else
						var4 = aClass17_168.anInt150 + (((aClass17_168.anInt151 - aClass17_168.anInt150) * var15) >> 8);

					var11 += 256;
					if (var11 >= var4) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20)
						anIntArray179[var7] = 0;
				}
			}

			if ((anInt180 > 0) && (anInt174 > 0)) {
				var11 = (int) (anInt180 * var5);

				for (var4 = var11; var4 < var1; ++var4)
					anIntArray179[var4] += (anIntArray179[var4 - var11] * anInt174) / 100;
			}

			if ((aClass15_175.anIntArray139[0] > 0) || (aClass15_175.anIntArray139[1] > 0)) {
				aClass17_162.method83();
				var11 = aClass17_162.method84(var1 + 1);
				var4 = aClass15_175.method75(0, var11 / 65536.0F);
				var16 = aClass15_175.method75(1, var11 / 65536.0F);
				if (var1 >= (var4 + var16)) {
					var7 = 0;
					var17 = var16;
					if (var16 > (var1 - var4))
						var17 = var1 - var4;

					int var8;
					while (var7 < var17) {
						var15 = (int) (((long) anIntArray179[var7 + var4] * (long) Class15.anInt140) >> 16);

						for (var8 = 0; var8 < var4; ++var8)
							var15 += (int) (((long) anIntArray179[(var7 + var4) - 1 - var8]
									* (long) Class15.anIntArrayArray141[0][var8]) >> 16);

						for (var8 = 0; var8 < var7; ++var8)
							var15 -= (int) (((long) anIntArray179[var7 - 1 - var8]
									* (long) Class15.anIntArrayArray141[1][var8]) >> 16);

						anIntArray179[var7] = var15;
						var11 = aClass17_162.method84(var1 + 1);
						++var7;
					}

					var17 = 128;

					while (true) {
						if (var17 > (var1 - var4))
							var17 = var1 - var4;

						int var3;
						while (var7 < var17) {
							var8 = (int) (((long) anIntArray179[var7 + var4] * (long) Class15.anInt140) >> 16);

							for (var3 = 0; var3 < var4; ++var3)
								var8 += (int) (((long) anIntArray179[(var7 + var4) - 1 - var3]
										* (long) Class15.anIntArrayArray141[0][var3]) >> 16);

							for (var3 = 0; var3 < var16; ++var3)
								var8 -= (int) (((long) anIntArray179[var7 - 1 - var3]
										* (long) Class15.anIntArrayArray141[1][var3]) >> 16);

							anIntArray179[var7] = var8;
							var11 = aClass17_162.method84(var1 + 1);
							++var7;
						}

						if (var7 >= (var1 - var4)) {
							while (var7 < var1) {
								var8 = 0;

								for (var3 = (var7 + var4) - var1; var3 < var4; ++var3)
									var8 += (int) (((long) anIntArray179[(var7 + var4) - 1 - var3]
											* (long) Class15.anIntArrayArray141[0][var3]) >> 16);

								for (var3 = 0; var3 < var16; ++var3)
									var8 -= (int) (((long) anIntArray179[var7 - 1 - var3]
											* (long) Class15.anIntArrayArray141[1][var3]) >> 16);

								anIntArray179[var7] = var8;
								aClass17_162.method84(var1 + 1);
								++var7;
							}
							break;
						}

						var4 = aClass15_175.method75(0, var11 / 65536.0F);
						var16 = aClass15_175.method75(1, var11 / 65536.0F);
						var17 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (anIntArray179[var11] < -32768)
					anIntArray179[var11] = -32768;

				if (anIntArray179[var11] > 32767)
					anIntArray179[var11] = 32767;
			}

			return anIntArray179;
		}
	}

	static {
		final Random var1 = new Random(0L);

		int var0;
		for (var0 = 0; var0 < '\u8000'; ++var0)
			anIntArray173[var0] = (var1.nextInt() & 2) - 1;

		anIntArray181 = new int['\u8000'];

		for (var0 = 0; var0 < '\u8000'; ++var0)
			anIntArray181[var0] = (int) (Math.sin(var0 / 5215.1903D) * 16384.0D);

		anIntArray179 = new int[220500];
		anIntArray177 = new int[5];
		anIntArray183 = new int[5];
		anIntArray184 = new int[5];
		anIntArray185 = new int[5];
		anIntArray186 = new int[5];
	}

	final void method92(final RSBuf var1) {
		aClass17_182 = new Class17();
		aClass17_182.method81(var1);
		aClass17_163 = new Class17();
		aClass17_163.method81(var1);
		int var2 = var1.method558();
		if (var2 != 0) {
			--var1.pos;
			aClass17_164 = new Class17();
			aClass17_164.method81(var1);
			aClass17_165 = new Class17();
			aClass17_165.method81(var1);
		}

		var2 = var1.method558();
		if (var2 != 0) {
			--var1.pos;
			aClass17_176 = new Class17();
			aClass17_176.method81(var1);
			aClass17_170 = new Class17();
			aClass17_170.method81(var1);
		}

		var2 = var1.method558();
		if (var2 != 0) {
			--var1.pos;
			aClass17_168 = new Class17();
			aClass17_168.method81(var1);
			aClass17_169 = new Class17();
			aClass17_169.method81(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			final int var4 = var1.getsmart((byte) -48);
			if (var4 == 0)
				break;

			anIntArray167[var3] = var4;
			anIntArray171[var3] = var1.method601();
			anIntArray172[var3] = var1.getsmart((byte) -12);
		}

		anInt180 = var1.getsmart((byte) -107);
		anInt174 = var1.getsmart((byte) -26);
		anInt166 = var1.method560();
		anInt178 = var1.method560();
		aClass15_175 = new Class15();
		aClass17_162 = new Class17();
		aClass15_175.method76(var1, aClass17_162);
	}
}
