import java.io.File;
import java.io.RandomAccessFile;

public class Class124_Sub22_Sub9 extends Class124_Sub22 {
	static int[] anIntArray1453;
	static Class45 aClass45_1455;
	public static Class94 aClass94_1456;
	static Class113 aClass113_1454 = new Class113(64);
	public int anInt1457 = 0;

	void method704(final Class124_Sub14 var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method709(var1, var2);
		}
	}

	static final boolean method705(final byte[] var0, final int var1, final int var2) {
		boolean var3 = true;
		final Class124_Sub14 var6 = new Class124_Sub14(var0);
		int var9 = -1;

		label69: while (true) {
			final int var7 = var6.method596((byte) 94);
			if (var7 == 0)
				return var3;

			var9 += var7;
			int var12 = 0;
			boolean var4 = false;

			while (true) {
				int var11;
				while (!var4) {
					var11 = var6.method596((byte) 18);
					if (var11 == 0)
						continue label69;

					var12 += var11 - 1;
					final int var13 = var12 & 63;
					final int var14 = (var12 >> 6) & 63;
					final int var15 = var6.method558() >> 2;
					final int var8 = var14 + var1;
					final int var10 = var13 + var2;
					if ((var8 > 0) && (var10 > 0) && (var8 < 103) && (var10 < 103)) {
						final Class124_Sub22_Sub6 var5 = Class124_Sub22_Sub12.method736(var9);
						if ((var15 != 22) || !client.aBool1989 || (var5.anInt1405 != 0) || (var5.anInt1403 == 1)
								|| var5.aBool1415) {
							if (!var5.method680()) {
								++client.anInt2039;
								var3 = false;
							}

							var4 = true;
						}
					}
				}

				var11 = var6.method596((byte) 95);
				if (var11 == 0)
					break;

				var6.method558();
			}
		}
	}

	static File method706(final String var0) {
		if (!Class60.aBool545)
			throw new RuntimeException("");
		else {
			final File var1 = (File) Class60.aHashtable543.get(var0);
			if (var1 != null)
				return var1;
			else {
				final File var2 = new File(Class60.aFile542, var0);
				RandomAccessFile var3 = null;

				try {
					final File var4 = new File(var2.getParent());
					if (!var4.exists())
						throw new RuntimeException("");
					else {
						var3 = new RandomAccessFile(var2, "rw");
						final int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						Class60.aHashtable543.put(var0, var2);
						return var2;
					}
				} catch (final Exception var8) {
					try {
						if (null != var3) {
							var3.close();
							var3 = null;
						}
					} catch (final Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	public static Class124_Sub22_Sub16_Sub4_Sub1 method707(final byte[] var0) {
		if (null == var0)
			return null;
		else {
			final Class124_Sub22_Sub16_Sub4_Sub1 var1 = new Class124_Sub22_Sub16_Sub4_Sub1(var0, Class7.anIntArray68,
					Class7.anIntArray74, Class7.anIntArray69, Class7.anIntArray70, Class7.anIntArray66,
					Class124_Sub22_Sub5.aByteArrayArray1384);
			Class124_Sub7.method522();
			return var1;
		}
	}

	public static int method708(final CharSequence var0) {
		final int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3)
			var2 = ((var2 << 5) - var2) + Class18.method88(var0.charAt(var3));

		return var2;
	}

	void method709(final Class124_Sub14 var1, final int var2) {
		if (var2 == 2)
			anInt1457 = var1.method560();

	}
}
