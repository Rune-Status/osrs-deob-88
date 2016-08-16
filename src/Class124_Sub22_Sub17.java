public class Class124_Sub22_Sub17 extends Class124_Sub22 {
	Class24[] aClass24Array1595;

	Class124_Sub22_Sub17(final Class94 var1, final Class94 var2, final int var3, final boolean var4) {
		final Class111 var10 = new Class111();
		final int var5 = var1.widgetLen(var3);
		aClass24Array1595 = new Class24[var5];
		final int[] var6 = var1.method372(var3);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			final byte[] var8 = var1.decode(var3, var6[var7]);
			Class124_Sub12 var9 = null;
			final int var11 = ((var8[0] & 255) << 8) | (var8[1] & 255);

			for (Class124_Sub12 var12 = (Class124_Sub12) var10
					.method428(); null != var12; var12 = (Class124_Sub12) var10.method430())
				if (var11 == var12.anInt1052) {
					var9 = var12;
					break;
				}

			if (null == var9) {
				byte[] var13;
				if (var4)
					var13 = var2.decode2(0, var11);
				else
					var13 = var2.decode2(var11, 0);

				var9 = new Class124_Sub12(var11, var13);
				var10.method424(var9);
			}

			aClass24Array1595[var6[var7]] = new Class24(var8, var9);
		}

	}

	public boolean method829(final int var1) {
		return aClass24Array1595[var1].aBool277;
	}

	static final void method830(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt2185; ++var4)
			if (((client.anIntArray2209[var4] + client.anIntArray2190[var4]) > var0)
					&& (client.anIntArray2190[var4] < (var0 + var2))
					&& ((client.anIntArray2222[var4] + client.anIntArray2223[var4]) > var1)
					&& (client.anIntArray2223[var4] < (var1 + var3)))
				client.aBoolArray2061[var4] = true;

	}
}
