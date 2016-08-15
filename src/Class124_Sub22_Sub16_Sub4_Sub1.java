public final class Class124_Sub22_Sub16_Sub4_Sub1 extends Class124_Sub22_Sub16_Sub4 {
	public Class124_Sub22_Sub16_Sub4_Sub1(final byte[] var1, final int[] var2, final int[] var3, final int[] var4,
			final int[] var5, final int[] var6, final byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	public Class124_Sub22_Sub16_Sub4_Sub1(final byte[] var1) {
		super(var1);
	}

	@Override
	final void method1029(final byte[] var1, int var2, int var3, int var4, int var5, final int var6, final int var7) {
		int var8 = var2 + (var3 * anInt1565);
		int var12 = anInt1565 - var4;
		int var10 = 0;
		int var11 = 0;
		int var9;
		if (var3 < anInt1564) {
			var9 = anInt1564 - var3;
			var5 -= var9;
			var3 = anInt1564;
			var11 += var9 * var4;
			var8 += var9 * anInt1565;
		}

		if ((var3 + var5) > anInt1568)
			var5 -= (var3 + var5) - anInt1568;

		if (var2 < anInt1569) {
			var9 = anInt1569 - var2;
			var4 -= var9;
			var2 = anInt1569;
			var11 += var9;
			var8 += var9;
			var10 += var9;
			var12 += var9;
		}

		if ((var2 + var4) > anInt1567) {
			var9 = (var2 + var4) - anInt1567;
			var4 -= var9;
			var10 += var9;
			var12 += var9;
		}

		if ((var4 > 0) && (var5 > 0))
			method1033(anIntArray1570, var1, var6, var11, var8, var4, var5, var12, var10, var7);
	}

	@Override
	final void method1038(final byte[] var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = var2 + (var3 * anInt1565);
		int var8 = anInt1565 - var4;
		int var11 = 0;
		int var10 = 0;
		int var9;
		if (var3 < anInt1564) {
			var9 = anInt1564 - var3;
			var5 -= var9;
			var3 = anInt1564;
			var10 += var9 * var4;
			var7 += var9 * anInt1565;
		}

		if ((var3 + var5) > anInt1568)
			var5 -= (var3 + var5) - anInt1568;

		if (var2 < anInt1569) {
			var9 = anInt1569 - var2;
			var4 -= var9;
			var2 = anInt1569;
			var10 += var9;
			var7 += var9;
			var11 += var9;
			var8 += var9;
		}

		if ((var2 + var4) > anInt1567) {
			var9 = (var2 + var4) - anInt1567;
			var4 -= var9;
			var11 += var9;
			var8 += var9;
		}

		if ((var4 > 0) && (var5 > 0))
			method1040(anIntArray1570, var1, var6, var10, var7, var4, var5, var8, var11);
	}
}
