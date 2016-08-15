public final class Class124_Sub22_Sub16_Sub2 extends Class124_Sub22_Sub16 {
	public int anInt1741;
	public int[] anIntArray1742;
	public int anInt1743;
	public byte[] aByteArray1740;
	public int anInt1738;
	public int anInt1736;
	public int anInt1737;
	public int anInt1739;

	public void method925() {
		if ((anInt1738 != anInt1741) || (anInt1736 != anInt1743)) {
			final byte[] var4 = new byte[anInt1741 * anInt1743];
			int var1 = 0;

			for (int var2 = 0; var2 < anInt1736; ++var2)
				for (int var3 = 0; var3 < anInt1738; ++var3)
					var4[var3 + anInt1737 + ((var2 + anInt1739) * anInt1741)] = aByteArray1740[var1++];

			aByteArray1740 = var4;
			anInt1738 = anInt1741;
			anInt1736 = anInt1743;
			anInt1737 = 0;
			anInt1739 = 0;
		}
	}

	public void method926(int var1, int var2) {
		var1 += anInt1737;
		var2 += anInt1739;
		int var4 = var1 + (var2 * anInt1565);
		int var3 = 0;
		int var6 = anInt1736;
		int var5 = anInt1738;
		int var7 = anInt1565 - var5;
		int var8 = 0;
		int var9;
		if (var2 < anInt1564) {
			var9 = anInt1564 - var2;
			var6 -= var9;
			var2 = anInt1564;
			var3 += var9 * var5;
			var4 += var9 * anInt1565;
		}

		if ((var2 + var6) > anInt1568)
			var6 -= (var2 + var6) - anInt1568;

		if (var1 < anInt1569) {
			var9 = anInt1569 - var1;
			var5 -= var9;
			var1 = anInt1569;
			var3 += var9;
			var4 += var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var1 + var5) > anInt1567) {
			var9 = (var1 + var5) - anInt1567;
			var5 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if ((var5 > 0) && (var6 > 0))
			method927(anIntArray1570, aByteArray1740, anIntArray1742, var3, var4, var5, var6, var7, var8);
	}

	static void method927(final int[] var0, final byte[] var1, final int[] var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			byte var10;
			int var12;
			for (var12 = var9; var12 < 0; ++var12) {
				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;

				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;
			}

			for (var12 = var5; var12 < 0; ++var12) {
				var10 = var1[var3++];
				if (var10 != 0)
					var0[var4++] = var2[var10 & 255];
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method928(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1742.length; ++var4) {
			int var5 = (anIntArray1742[var4] >> 16) & 255;
			var5 += var1;
			if (var5 < 0)
				var5 = 0;
			else if (var5 > 255)
				var5 = 255;

			int var6 = (anIntArray1742[var4] >> 8) & 255;
			var6 += var2;
			if (var6 >= 0) {
				if (var6 > 255)
					var6 = 255;
			} else
				var6 = 0;

			int var7 = anIntArray1742[var4] & 255;
			var7 += var3;
			if (var7 < 0)
				var7 = 0;
			else if (var7 > 255)
				var7 = 255;

			anIntArray1742[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}
}
