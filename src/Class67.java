public final class Class67 {
	public static Class124_Sub14 aClass124_Sub14_569;
	public static Class10 aClass10_570;
	int anInt567;
	int anInt564;
	int anInt568;
	int anInt563;
	int[] anIntArray566 = new int[256];
	int[] anIntArray565 = new int[256];

	final int method295() {
		return 0;
		/*if ((--anInt567 + 1) == 0) {
			method296();
			anInt567 = 255;
		}

		return anIntArray565[anInt567];*/
	}

	final void method296() {
		anInt568 += ++anInt564;

		for (int var1 = 0; var1 < 256; ++var1) {
			final int var2 = anIntArray566[var1];
			if ((var1 & 2) != 0) {
				if ((var1 & 1) == 0)
					anInt563 ^= anInt563 << 2;
				else
					anInt563 ^= anInt563 >>> 16;
			} else if ((var1 & 1) == 0)
				anInt563 ^= anInt563 << 13;
			else
				anInt563 ^= anInt563 >>> 6;

			anInt563 += anIntArray566[(128 + var1) & 255];
			int var3;
			anIntArray566[var1] = var3 = anInt568 + anInt563 + anIntArray566[(var2 & 1020) >> 2];
			anIntArray565[var1] = anInt568 = anIntArray566[((var3 >> 8) & 1020) >> 2] + var2;
		}

	}

	final void method297() {
		int var1 = -1640531527;
		int var2 = -1640531527;
		int var3 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;

		int var6;
		for (var6 = 0; var6 < 4; ++var6) {
			var7 ^= var8 << 11;
			var4 += var7;
			var8 += var9;
			var8 ^= var9 >>> 2;
			var5 += var8;
			var9 += var4;
			var9 ^= var4 << 8;
			var3 += var9;
			var4 += var5;
			var4 ^= var5 >>> 16;
			var2 += var4;
			var5 += var3;
			var5 ^= var3 << 10;
			var1 += var5;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var7 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var8 += var2;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var9 += var1;
			var7 += var8;
		}

		for (var6 = 0; var6 < 256; var6 += 8) {
			var7 += anIntArray565[var6];
			var8 += anIntArray565[var6 + 1];
			var9 += anIntArray565[2 + var6];
			var4 += anIntArray565[var6 + 3];
			var5 += anIntArray565[var6 + 4];
			var3 += anIntArray565[5 + var6];
			var2 += anIntArray565[6 + var6];
			var1 += anIntArray565[var6 + 7];
			var7 ^= var8 << 11;
			var4 += var7;
			var8 += var9;
			var8 ^= var9 >>> 2;
			var5 += var8;
			var9 += var4;
			var9 ^= var4 << 8;
			var3 += var9;
			var4 += var5;
			var4 ^= var5 >>> 16;
			var2 += var4;
			var5 += var3;
			var5 ^= var3 << 10;
			var1 += var5;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var7 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var8 += var2;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var9 += var1;
			var7 += var8;
			anIntArray566[var6] = var7;
			anIntArray566[var6 + 1] = var8;
			anIntArray566[var6 + 2] = var9;
			anIntArray566[3 + var6] = var4;
			anIntArray566[var6 + 4] = var5;
			anIntArray566[5 + var6] = var3;
			anIntArray566[var6 + 6] = var2;
			anIntArray566[var6 + 7] = var1;
		}

		for (var6 = 0; var6 < 256; var6 += 8) {
			var7 += anIntArray566[var6];
			var8 += anIntArray566[var6 + 1];
			var9 += anIntArray566[2 + var6];
			var4 += anIntArray566[var6 + 3];
			var5 += anIntArray566[4 + var6];
			var3 += anIntArray566[var6 + 5];
			var2 += anIntArray566[var6 + 6];
			var1 += anIntArray566[var6 + 7];
			var7 ^= var8 << 11;
			var4 += var7;
			var8 += var9;
			var8 ^= var9 >>> 2;
			var5 += var8;
			var9 += var4;
			var9 ^= var4 << 8;
			var3 += var9;
			var4 += var5;
			var4 ^= var5 >>> 16;
			var2 += var4;
			var5 += var3;
			var5 ^= var3 << 10;
			var1 += var5;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var7 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var8 += var2;
			var1 += var7;
			var1 ^= var7 >>> 9;
			var9 += var1;
			var7 += var8;
			anIntArray566[var6] = var7;
			anIntArray566[var6 + 1] = var8;
			anIntArray566[var6 + 2] = var9;
			anIntArray566[var6 + 3] = var4;
			anIntArray566[var6 + 4] = var5;
			anIntArray566[5 + var6] = var3;
			anIntArray566[6 + var6] = var2;
			anIntArray566[7 + var6] = var1;
		}

		method296();
		anInt567 = 256;
	}

	Class67(final int[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2)
			anIntArray565[var2] = var1[var2];

		method297();
	}

	public static void method298(final Class94 var0, final Class94 var1, final boolean var2) {
		Class124_Sub22_Sub6.aClass94_1426 = var0;
		Class124_Sub22_Sub6.aClass94_1387 = var1;
		Class124_Sub22_Sub6.aBool1400 = var2;
	}

	public static byte[] method299(final Object var0, final boolean var1) {
		if (var0 == null)
			return null;
		else if (var0 instanceof byte[]) {
			final byte[] var6 = ((byte[]) var0);
			if (var1) {
				final int var3 = var6.length;
				final byte[] var4 = new byte[var3];
				System.arraycopy(var6, 0, var4, 0, var3);
				return var4;
			} else
				return var6;
		} else if (var0 instanceof Class55) {
			final Class55 var2 = (Class55) var0;
			return var2.method260(-260877396);
		} else
			throw new IllegalArgumentException();
	}
}
