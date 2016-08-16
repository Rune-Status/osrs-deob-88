public final class Class124_Sub14_Sub1 extends RSBuf {
	static Class124_Sub9[] aClass124_Sub9Array1609;
	Class67 aClass67_1606;
	int anInt1608;
	static int[] anIntArray1607 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
			32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	public void method836(final int[] var1) {
		aClass67_1606 = new Class67(var1);
	}

	public void method837(final int var1) {
		backing[++pos - 1] = (byte) (var1 + aClass67_1606.method295());
	}

	public Class124_Sub14_Sub1(final int var1) {
		super(var1);
	}

	public int method838() {
		return (backing[++pos - 1] - aClass67_1606.method295()) & 255;
	}

	public int method839(int var1) {
		int var2 = anInt1608 >> 3;
		int var4 = 8 - (anInt1608 & 7);
		int var3 = 0;

		for (anInt1608 += var1; var1 > var4; var4 = 8) {
			var3 += (backing[var2++] & anIntArray1607[var4]) << (var1 - var4);
			var1 -= var4;
		}

		if (var4 == var1)
			var3 += backing[var2] & anIntArray1607[var4];
		else
			var3 += (backing[var2] >> (var4 - var1)) & anIntArray1607[var1];

		return var3;
	}

	public void method840() {
		pos = (anInt1608 + 7) / 8;
	}

	static final int method841() {
		if (Class57.aClass22_538.aBool248)
			return Class134.anInt906;
		else {
			final int var0 = Class63.method285(Class45.anInt445, Class48.anInt479, Class134.anInt906);
			return ((var0 - Class2.anInt14) < 800)
					&& ((Class27.aByteArrayArrayArray285[Class134.anInt906][Class45.anInt445 >> 7][Class48.anInt479 >> 7]
							& 4) != 0) ? Class134.anInt906 : 3;
		}
	}

	public void method842() {
		anInt1608 = pos * 8;
	}

	public int method843(final int var1) {
		return (var1 * 8) - anInt1608;
	}

	static final void method844(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5) {
		final int var6 = (2048 - var3) & 2047;
		final int var13 = (2048 - var4) & 2047;
		int var12 = 0;
		int var9 = 0;
		int var7 = var5;
		int var8;
		int var10;
		int var11;
		if (var6 != 0) {
			var10 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var6];
			var8 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var6];
			var11 = ((var8 * var9) - (var5 * var10)) >> 16;
			var7 = ((var9 * var10) + (var5 * var8)) >> 16;
			var9 = var11;
		}

		if (var13 != 0) {
			var10 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var13];
			var8 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var13];
			var11 = ((var8 * var12) + (var10 * var7)) >> 16;
			var7 = ((var7 * var8) - (var10 * var12)) >> 16;
			var12 = var11;
		}

		Class45.anInt445 = var0 - var12;
		Class2.anInt14 = var1 - var9;
		Class48.anInt479 = var2 - var7;
		Class124_Sub6.anInt1003 = var3;
		Class27.anInt301 = var4;
	}
}
