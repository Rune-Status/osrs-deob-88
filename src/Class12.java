public class Class12 {
	Class19[] aClass19Array123 = new Class19[10];
	int anInt122;
	int anInt124;

	public static Class12 method68(final Class94 var0, final int var1, final int var2) {
		final byte[] var3 = var0.decode(var1, var2);
		return var3 == null ? null : new Class12(new RSBuf(var3));
	}

	public Class124_Sub2_Sub1 method69() {
		final byte[] var1 = method70();
		return new Class124_Sub2_Sub1(22050, var1, (22050 * anInt122) / 1000, (22050 * anInt124) / 1000);
	}

	Class12(final RSBuf var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			final int var3 = var1.method558();
			if (var3 != 0) {
				--var1.pos;
				aClass19Array123[var2] = new Class19();
				aClass19Array123[var2].method92(var1);
			}
		}

		anInt122 = var1.method560();
		anInt124 = var1.method560();
	}

	final byte[] method70() {
		int var1 = 0;

		int var3;
		for (var3 = 0; var3 < 10; ++var3)
			if ((aClass19Array123[var3] != null)
					&& ((aClass19Array123[var3].anInt166 + aClass19Array123[var3].anInt178) > var1))
				var1 = aClass19Array123[var3].anInt166 + aClass19Array123[var3].anInt178;

		if (var1 == 0)
			return new byte[0];
		else {
			var3 = (22050 * var1) / 1000;
			final byte[] var2 = new byte[var3];

			for (int var4 = 0; var4 < 10; ++var4)
				if (aClass19Array123[var4] != null) {
					final int var5 = (aClass19Array123[var4].anInt166 * 22050) / 1000;
					final int var8 = (aClass19Array123[var4].anInt178 * 22050) / 1000;
					final int[] var6 = aClass19Array123[var4].method91(var5, aClass19Array123[var4].anInt166);

					for (int var7 = 0; var7 < var5; ++var7) {
						int var9 = var2[var7 + var8] + (var6[var7] >> 8);
						if (((var9 + 128) & -256) != 0)
							var9 = (var9 >> 31) ^ 127;

						var2[var7 + var8] = (byte) var9;
					}
				}

			return var2;
		}
	}

	public final int method71() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2)
			if ((aClass19Array123[var2] != null) && ((aClass19Array123[var2].anInt178 / 20) < var1))
				var1 = aClass19Array123[var2].anInt178 / 20;

		if ((anInt122 < anInt124) && ((anInt122 / 20) < var1))
			var1 = anInt122 / 20;

		if ((var1 != 9999999) && (var1 != 0)) {
			for (var2 = 0; var2 < 10; ++var2)
				if (aClass19Array123[var2] != null)
					aClass19Array123[var2].anInt178 -= var1 * 20;

			if (anInt122 < anInt124) {
				anInt122 -= var1 * 20;
				anInt124 -= var1 * 20;
			}

			return var1;
		} else
			return 0;
	}
}
