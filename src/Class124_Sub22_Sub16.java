public class Class124_Sub22_Sub16 extends Class124_Sub22 {
	public static int anInt1564 = 0;
	public static int anInt1568 = 0;
	protected static int anInt1569 = 0;
	protected static int anInt1567 = 0;
	public static int[] anIntArray1570;
	public static int anInt1565;
	public static int anInt1566;

	public static void method763() {
		anInt1569 = 0;
		anInt1564 = 0;
		anInt1567 = anInt1565;
		anInt1568 = anInt1566;
	}

	public static void method764(int var0, int var1, int var2, int var3) {
		if (var0 < 0)
			var0 = 0;

		if (var1 < 0)
			var1 = 0;

		if (var2 > anInt1565)
			var2 = anInt1565;

		if (var3 > anInt1566)
			var3 = anInt1566;

		anInt1569 = var0;
		anInt1564 = var1;
		anInt1567 = var2;
		anInt1568 = var3;
	}

	public static void method765(final int[] var0) {
		var0[0] = anInt1569;
		var0[1] = anInt1564;
		var0[2] = anInt1567;
		var0[3] = anInt1568;
	}

	public static void method766(final int[] var0) {
		anInt1569 = var0[0];
		anInt1564 = var0[1];
		anInt1567 = var0[2];
		anInt1568 = var0[3];
	}

	public static void method767(int var0, int var1, int var2, int var3, int var4, final int var5) {
		if (var0 < anInt1569) {
			var2 -= anInt1569 - var0;
			var0 = anInt1569;
		}

		if (var1 < anInt1564) {
			var3 -= anInt1564 - var1;
			var1 = anInt1564;
		}

		if ((var0 + var2) > anInt1567)
			var2 = anInt1567 - var0;

		if ((var1 + var3) > anInt1568)
			var3 = anInt1568 - var1;

		var4 = ((((var4 & 16711935) * var5) >> 8) & 16711935) + ((((var4 & '\uff00') * var5) >> 8) & '\uff00');
		final int var8 = 256 - var5;
		final int var9 = anInt1565 - var2;
		int var10 = var0 + (var1 * anInt1565);

		for (int var6 = 0; var6 < var3; ++var6) {
			for (int var7 = -var2; var7 < 0; ++var7) {
				int var11 = anIntArray1570[var10];
				var11 = ((((var11 & 16711935) * var8) >> 8) & 16711935)
						+ ((((var11 & '\uff00') * var8) >> 8) & '\uff00');
				anIntArray1570[var10++] = var4 + var11;
			}

			var10 += var9;
		}

	}

	public static void method768(int var0, int var1, int var2, int var3, final int var4) {
		if (var0 < anInt1569) {
			var2 -= anInt1569 - var0;
			var0 = anInt1569;
		}

		if (var1 < anInt1564) {
			var3 -= anInt1564 - var1;
			var1 = anInt1564;
		}

		if ((var0 + var2) > anInt1567)
			var2 = anInt1567 - var0;

		if ((var1 + var3) > anInt1568)
			var3 = anInt1568 - var1;

		final int var6 = anInt1565 - var2;
		int var7 = var0 + (var1 * anInt1565);

		for (int var8 = -var3; var8 < 0; ++var8) {
			for (int var5 = -var2; var5 < 0; ++var5)
				anIntArray1570[var7++] = var4;

			var7 += var6;
		}

	}

	public static void method769(final int var0, final int var1, final int var2, final int var3, final int var4) {
		method776(var0, var1, var2, var4);
		method776(var0, (var1 + var3) - 1, var2, var4);
		method772(var0, var1, var3, var4);
		method772((var0 + var2) - 1, var1, var3, var4);
	}

	public static void method770(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		method771(var0, var1, var2, var4, var5);
		method771(var0, (var1 + var3) - 1, var2, var4, var5);
		if (var3 >= 3) {
			method773(var0, var1 + 1, var3 - 2, var4, var5);
			method773((var0 + var2) - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static void method771(int var0, final int var1, int var2, final int var3, final int var4) {
		if ((var1 >= anInt1564) && (var1 < anInt1568)) {
			if (var0 < anInt1569) {
				var2 -= anInt1569 - var0;
				var0 = anInt1569;
			}

			if ((var0 + var2) > anInt1567)
				var2 = anInt1567 - var0;

			final int var5 = 256 - var4;
			final int var8 = ((var3 >> 16) & 255) * var4;
			final int var9 = ((var3 >> 8) & 255) * var4;
			final int var10 = (var3 & 255) * var4;
			int var6 = var0 + (var1 * anInt1565);

			for (int var11 = 0; var11 < var2; ++var11) {
				final int var7 = ((anIntArray1570[var6] >> 16) & 255) * var5;
				final int var12 = ((anIntArray1570[var6] >> 8) & 255) * var5;
				final int var13 = (anIntArray1570[var6] & 255) * var5;
				final int var14 = (((var8 + var7) >> 8) << 16) + (((var9 + var12) >> 8) << 8) + ((var10 + var13) >> 8);
				anIntArray1570[var6++] = var14;
			}

		}
	}

	public static void method772(final int var0, int var1, int var2, final int var3) {
		if ((var0 >= anInt1569) && (var0 < anInt1567)) {
			if (var1 < anInt1564) {
				var2 -= anInt1564 - var1;
				var1 = anInt1564;
			}

			if ((var1 + var2) > anInt1568)
				var2 = anInt1568 - var1;

			final int var4 = var0 + (var1 * anInt1565);

			for (int var5 = 0; var5 < var2; ++var5)
				anIntArray1570[var4 + (var5 * anInt1565)] = var3;

		}
	}

	static void method773(final int var0, int var1, int var2, final int var3, final int var4) {
		if ((var0 >= anInt1569) && (var0 < anInt1567)) {
			if (var1 < anInt1564) {
				var2 -= anInt1564 - var1;
				var1 = anInt1564;
			}

			if ((var1 + var2) > anInt1568)
				var2 = anInt1568 - var1;

			final int var5 = 256 - var4;
			final int var13 = ((var3 >> 16) & 255) * var4;
			final int var8 = ((var3 >> 8) & 255) * var4;
			final int var9 = (var3 & 255) * var4;
			int var6 = var0 + (var1 * anInt1565);

			for (int var10 = 0; var10 < var2; ++var10) {
				final int var11 = ((anIntArray1570[var6] >> 16) & 255) * var5;
				final int var7 = ((anIntArray1570[var6] >> 8) & 255) * var5;
				final int var12 = (anIntArray1570[var6] & 255) * var5;
				final int var14 = (((var13 + var11) >> 8) << 16) + (((var8 + var7) >> 8) << 8) + ((var9 + var12) >> 8);
				anIntArray1570[var6] = var14;
				var6 += anInt1565;
			}

		}
	}

	public static void method774(int var0, int var1, int var2, int var3, final int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0)
				method776(var0, var1, var2 + 1, var4);
			else
				method776(var0 + var2, var1, -var2 + 1, var4);

		} else if (var2 == 0) {
			if (var3 >= 0)
				method772(var0, var1, var3 + 1, var4);
			else
				method772(var0, var1 + var3, -var3 + 1, var4);

		} else {
			if ((var2 + var3) < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '\u8000';
				var3 <<= 16;
				var5 = (int) Math.floor(((double) var3 / (double) var2) + 0.5D);
				var2 += var0;
				if (var0 < anInt1569) {
					var1 += var5 * (anInt1569 - var0);
					var0 = anInt1569;
				}

				if (var2 >= anInt1567)
					var2 = anInt1567 - 1;

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if ((var6 >= anInt1564) && (var6 < anInt1568))
						anIntArray1570[var0 + (var6 * anInt1565)] = var4;

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += '\u8000';
				var2 <<= 16;
				var5 = (int) Math.floor(((double) var2 / (double) var3) + 0.5D);
				var3 += var1;
				if (var1 < anInt1564) {
					var0 += var5 * (anInt1564 - var1);
					var1 = anInt1564;
				}

				if (var3 >= anInt1568)
					var3 = anInt1568 - 1;

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if ((var6 >= anInt1569) && (var6 < anInt1567))
						anIntArray1570[var6 + (var1 * anInt1565)] = var4;

					var0 += var5;
					++var1;
				}
			}

		}
	}

	public static void method775(int var0, int var1, final int var2, final int[] var3, final int[] var4) {
		int var5 = var0 + (var1 * anInt1565);

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0)
				anIntArray1570[var6++] = var2;

			var5 += anInt1565;
		}

	}

	public static void method776(int var0, final int var1, int var2, final int var3) {
		if ((var1 >= anInt1564) && (var1 < anInt1568)) {
			if (var0 < anInt1569) {
				var2 -= anInt1569 - var0;
				var0 = anInt1569;
			}

			if ((var0 + var2) > anInt1567)
				var2 = anInt1567 - var0;

			final int var5 = var0 + (var1 * anInt1565);

			for (int var4 = 0; var4 < var2; ++var4)
				anIntArray1570[var5 + var4] = var3;

		}
	}

	public static void method777() {
		int var0 = 0;

		int var1;
		for (var1 = (anInt1565 * anInt1566) - 7; var0 < var1; anIntArray1570[var0++] = 0) {
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
			anIntArray1570[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray1570[var0++] = 0)
			;

	}

	public static void method778(final int var0, final int var1, final int var2, final int var3) {
		if (anInt1569 < var0)
			anInt1569 = var0;

		if (anInt1564 < var1)
			anInt1564 = var1;

		if (anInt1567 > var2)
			anInt1567 = var2;

		if (anInt1568 > var3)
			anInt1568 = var3;

	}

	public static void method779(int var0, int var1, int var2, int var3, final int var4, final int var5) {
		int var6 = 0;
		final int var7 = 65536 / var3;
		if (var0 < anInt1569) {
			var2 -= anInt1569 - var0;
			var0 = anInt1569;
		}

		if (var1 < anInt1564) {
			var6 += (anInt1564 - var1) * var7;
			var3 -= anInt1564 - var1;
			var1 = anInt1564;
		}

		if ((var0 + var2) > anInt1567)
			var2 = anInt1567 - var0;

		if ((var1 + var3) > anInt1568)
			var3 = anInt1568 - var1;

		final int var8 = anInt1565 - var2;
		int var14 = var0 + (var1 * anInt1565);

		for (int var10 = -var3; var10 < 0; ++var10) {
			final int var11 = (65536 - var6) >> 8;
			final int var12 = var6 >> 8;
			final int var13 = (((((var4 & 16711935) * var11) + ((var5 & 16711935) * var12)) & -16711936)
					+ ((((var4 & '\uff00') * var11) + ((var5 & '\uff00') * var12)) & 16711680)) >>> 8;

			for (int var9 = -var2; var9 < 0; ++var9)
				anIntArray1570[var14++] = var13;

			var14 += var8;
			var6 += var7;
		}

	}

	public static void method780(final int[] var0, final int var1, final int var2) {
		anIntArray1570 = var0;
		anInt1565 = var1;
		anInt1566 = var2;
		method764(0, 0, var1, var2);
	}
}
