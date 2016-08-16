public class Def14 extends JagMap {
	public static CacheArch aClass94_1508;
	static int[] anIntArray1512;
	static Class113 aClass113_1509 = new Class113(64);
	public int anInt1510;
	public int anInt1513;
	public int anInt1511;

	void method725(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readByteU();
			if (var2 == 0)
				return;

			method727(var1, var2);
		}
	}

	static String method726(String var0, final Widget var1) {
		if (var0.indexOf("%") != -1) {
			int var2;
			for (var2 = 1; var2 <= 5; ++var2)
				while (true) {
					final int var3 = var0.indexOf("%" + var2);
					if (var3 == -1)
						break;

					final String var7 = var0.substring(0, var3);
					final int var4 = Class122.method448(var1, var2 - 1);
					String var6;
					if (var4 < 999999999)
						var6 = Integer.toString(var4);
					else
						var6 = "*";

					var0 = var7 + var6 + var0.substring(var3 + 2);
				}

			while (true) {
				var2 = var0.indexOf("%dns");
				if (var2 == -1)
					break;

				String var5 = "";
				if (Class78.aClass79_632 != null) {
					var5 = Class121_Sub1.method486(Class78.aClass79_632.anInt640);
					if (Class78.aClass79_632.anObject638 != null)
						var5 = (String) Class78.aClass79_632.anObject638;
				}

				var0 = var0.substring(0, var2) + var5 + var0.substring(4 + var2);
			}
		}

		return var0;
	}

	void method727(final RSBuf var1, final int var2) {
		if (var2 == 1) {
			anInt1510 = var1.readShortU();
			anInt1513 = var1.readByteU();
			anInt1511 = var1.readByteU();
		}

	}

	public static Class124_Sub22_Sub16_Sub1[] method728(final CacheArch var0, final String var1, final String var2) {
		final int var3 = var0.method376(var1);
		final int var4 = var0.method383(var3, var2);
		return Class72.method310(var0, var3, var4);
	}

	static final byte[] method729(final byte[] var0) {
		final RSBuf var1 = new RSBuf(var0);
		final int var4 = var1.readByteU();
		final int var3 = var1.readInt2(-1862637362);
		if ((var3 >= 0) && ((CacheArch.anInt755 == 0) || (var3 <= CacheArch.anInt755))) {
			if (var4 == 0) {
				final byte[] var2 = new byte[var3];
				var1.readReverse(var2, 0, var3);
				return var2;
			} else {
				final int var5 = var1.readInt2(33253765);
				if (var5 < 0 || var5 > 1000000) {
					System.err.printf("bad xtea decrypt %n");
					return new byte[100];
				}
				if ((var5 >= 0) && ((CacheArch.anInt755 == 0) || (var5 <= CacheArch.anInt755))) {
					final byte[] var6 = new byte[var5];
					if (var4 == 1)
						Class52.method248(var6, var5, var0, var3, 9);
					else
						CacheArch.aClass64_743.method288(var1, var6);

					return var6;
				} else {
					System.err.printf("bad xtea decrypt %n");
					return new byte[100];
					//throw new RuntimeException();
				}
			}
		} else
			throw new RuntimeException();
	}

	static final void method730(final int var0, final int var1, final int var2, final int var3,
			final Class124_Sub22_Sub16_Sub1 var4, final Class124_Sub22_Sub20 var5) {
		final int var6 = (var3 * var3) + (var2 * var2);
		if ((var6 > 4225) && (var6 < 90000)) {
			final int var7 = (client.anInt2053 + client.anInt2255) & 2047;
			int var8 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var7];
			int var9 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var7];
			var8 = (256 * var8) / (client.anInt2055 + 256);
			var9 = (var9 * 256) / (client.anInt2055 + 256);
			final int var10 = ((var3 * var8) + (var2 * var9)) >> 16;
			final int var15 = ((var3 * var9) - (var2 * var8)) >> 16;
			final double var13 = Math.atan2(var10, var15);
			final int var11 = (int) (Math.sin(var13) * 63.0D);
			final int var12 = (int) (Math.cos(var13) * 57.0D);
			Class71.aClass124_Sub22_Sub16_Sub1_591.method914((4 + var0 + 94 + var11) - 10, (var1 + 83) - var12 - 20, 20,
					20, 15, 15, var13, 256);
		} else
			Def9.method646(var0, var1, var2, var3, var4, var5);

	}
}
